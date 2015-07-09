
一、JNDI在Java EE中的应用
JNDI技术是Java EE规范中的一个重要“幕后”角色，它为Java EE容器、组件提供者和应用程序之间提供了桥梁作用：
Java EE容器同时扮演JNDI提供者角色，
组件提供者将某个服务的具体实现部署到容器上，应用程序通过标准的JNDI接口就可以从容器上发现并使用服务，
而不用关心服务的具体实现是什么，
它的具体位置在哪里。

下面以一个常见的J2EE应用场景来看四种角色（组件接口、容器、组件提供者、应用程序）是如何围绕JNDI来发挥作用的：
组件接口
数据源DataSource是一种很常见的服务。我们通常将组件接口绑定到容器的Context上供客户调用。

Java EE容器
Tomcat是一种常见的Java EE容器，其他的还有JBoss,WebLogic，它们同时也实现了JNDI提供者规范。
容器通常提供一个JNDI注入场所供加入组件的具体实现，
比如Tomcat中的Server.xml配置文件。

组件提供者
众多数据库厂商提供了DataSource的实现，比如OracleDataSource，MySQLDataSource，XXXDataSource等。
我们将该实现的部署到容器中：
将一系列jar加入classpath中，在Server.xml中配置DataSource实现，如：
<Resource name="jdbc/MyDB" auth="Container" type="javax.sql.DataSource" ..../>

应用程序
一个JSP/Servlet应用程序。通过JNDI接口使用DataSource服务，如：
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/MyDB");

关于在Tomcat中如何配置DataSource，
可以参考文档：http://tomcat.apache.org/tomcat-5.5-doc/jndi-datasource-examples-howto.html。
关于在Tomcat中如何配置其他JNDI服务，
可以参考文档：http://tomcat.apache.org/tomcat-5.5-doc/jndi-resources-howto.html。

二、JNDI实例演练：在Java SE中使用JNDI
要在Java EE中环境中提供一个独立的实例不太容易。下面以一个独立的Java SE应用来演练JNDI的使用过程。在该应用中，
我们使用JNDI来使用两种假想的服务：数据库服务DBService和日志服务LogService。

1、指定JNDI提供者
要使用JNDI，首先要配置JNDI提供者。在我们的Java SE应用中，
没有Java EE容器充当JNDI提供者，因此我们要指定其他的JNDI提供者。
在我们的例子里，我们使用SUN的文件系统服务提供者File System Service Provider。
由于SUN的文件系统服务提供者并没有包含在JDK中，
我们需要从SUN网站上下载：http://java.sun.com/products/jndi/downloads/index.html。
它包含两个jar文件：fscontext.jar和providerutil.jar。
我们将这两个文件加入项目的类路径中。

2、定义服务接口
首先，我们在服务接口package(xyz.service)中定义服务接口：DBService和LogService，分别表示数据库服务和日志服务。
这两个接口就相当于Tomcat提供的数据源接口 要组建提供商实现这个接口
♦数据库服务接口 DBService.java

package xyz.service;

public interface DBService {
 String getLocation(); //获取数据库位置

 String getState(); //获取数据库状态
 
 void accessDB(); //访问数据库
 
 void setProperty(int index,String property); //设置数据库信息
}

♦日志服务接口 LogService.java

package xyz.service;

public interface LogService {
 void log(String message); //记录日志
}

3、组件提供者实现服务接口
接下来，我们在组件提供者package(xyz.serviceprovider)中提供DBService和LogService的实现：
SimpleDBService和SimpleLogService。
为了让服务能够在JNDI环境中使用，根据JNDI规范，
我们同时定义两个对象工厂类SimpleDBServiceFactory和SimpleLogServiceFactory，
分别用来创建服务实例。

♦数据库服务接口实现  SimpleDBService.java 

package xyz.serviceprovider;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

import xyz.service.DBService;

//为了将数据库服务实例加入JNDI的Context中，我们需要实现Referenceable接口，并实现RetReference方法。
//上句话的意思是 实现Referenceable接口 就相当于在将此服务加入到了 SUN的文件系统服务提供者File System Service Provider的数据库服务
//关于Reference和Referenceable，请参考上一篇：Java技术回顾之JNDI：JNDI API

public class SimpleDBService implements Referenceable, DBService {
 private String location="mydb//local:8421/defaultdb";//数据库服务属性之一：数据库位置
 private String state="start"; //数据库服务属性之二：数据库状态

 public Reference getReference() throws NamingException {
  //Reference是对象的引用，Context中存放的是Reference，为了从Reference中还原出对象实例，
  //我们需要添加RefAddr，它们是创建对象实例的线索。在我们的SimpleDBService中，location和state是这样两个线索。
  Reference ref=new Reference(getClass().getName(),SimpleDBServiceFactory.class.getName(),null);
  ref.add(new StringRefAddr("location",location));
  ref.add(new StringRefAddr("state",state));
  return ref;
 }

 public void accessDB() {
  if(state.equals("start"))
   System.out.println("we are accessing DB.");
  else
   System.out.println("DB is not start.");
 }

 public String getLocation() {
  return location;
 }

 public String getState() {
  return state;
 }

 public void setProperty(int index,String property){
  if(index==0)
   location=property;
  else
   state=property;
 }
}

♦数据库服务对象工厂类 SimpleDBServiceFactory.java

package xyz.serviceprovider;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

//数据库服务对象工厂类被JNDI提供者调用来创建数据库服务实例，对使用JNDI的客户不可见。
public class SimpleDBServiceFactory implements ObjectFactory {

 //根据Reference中存储的信息创建出SimpleDBService实例
 public Object getObjectInstance(Object obj, Name name, Context ctx,
   Hashtable<?, ?> env) throws Exception {
  if(obj instanceof Reference){
   Reference ref=(Reference)obj;
   String location=(String)ref.get("location").getContent();
   String state=(String)ref.get("state").getContent();
   SimpleDBService db= new SimpleDBService();
   db.setProperty(0, location);
   db.setProperty(1, state);
   return db;
  }
  return null;
 }
}

♦日志服务接口实现 SimpleLogService.java 

package xyz.serviceprovider;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;

import xyz.service.LogService;

public class SimpleLogService implements Referenceable, LogService {
 private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

 //SimpleLogService没有任何属性，通过SimpleLogService类名创建出来的SimpleLogService实例都是一样的，
 //因此这里无需添加RefAddr了。
 public Reference getReference() throws NamingException {
  return new Reference(getClass().getName(),SimpleLogServiceFactory.class.getName(),null);
 }

 public void log(String message) {
  String date=sdf.format(new Date());
  System.out.println(date+":"+message);
 }
}


♦日志服务对象工厂类 SimpleLogServiceFactory.java

package xyz.serviceprovider;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

public class SimpleLogServiceFactory implements ObjectFactory {

 public Object getObjectInstance(Object obj, Name name, Context ctx,
   Hashtable<?, ?> env) throws Exception {
  if(obj instanceof Reference){
   return new SimpleLogService();
  }
  return null;
 }
}

 4、JNDI容器和JNDI客户端
最后，我们在JNDI应用package(xyz.jndi)中实现一个JNDI容器JNDIContainer和一个JNDI客户端应用JNDIClient。
JNDIContainer在内部使用文件系统服务提供者fscontext来提供命名和目录服务，配置文件JNDIContainer.properties是服务注入场所，
供配置DBService和LogService实现。 

♦JNDI容器类 JNDIContainer.java

package xyz.jndi;

import java.io.InputStream;
import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import xyz.service.DBService;
import xyz.service.LogService;

public class JNDIContainer {

 private Context ctx=null;
 
 public void init() throws Exception{
     //初始化JNDI提供者。
     Hashtable env = new Hashtable();
     env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
     env.put(Context.PROVIDER_URL, "file:/c:/sample"); //fscontext的初始目录，我们需要在c:\下创建sample目录。
     ctx=new InitialContext(env);
     loadServices();
 }
 
 //从配置文件JNDIContainer.properties中读取DBService和LogService实现，绑定到Context中。
 private void loadServices() throws Exception{
  InputStream in=getClass().getResourceAsStream("JNDIContainer.properties");
  Properties props=new Properties();
  props.load(in);
  
  //inject dbservice
  String s=props.getProperty("DBServiceClass");
  Object obj=Class.forName(s).newInstance();
  if(obj instanceof DBService){
   DBService db=(DBService)obj;
   String[] ss=props.getProperty("DBServiceProperty").split(";");
   for(int i=0;i<ss.length;i++)
    db.setProperty(i, ss[i]);
   ctx.rebind(props.getProperty("DBServiceName"), db);
  }
  
  //inject logservice
  s=props.getProperty("LogServiceClass");
  obj=Class.forName(s).newInstance();
  if(obj instanceof LogService){
   LogService log=(LogService)obj;
   ctx.rebind(props.getProperty("LogServiceName"), log);
  }
 }
 
 public void close() throws NamingException{
  ctx.close();
 }
 
 public Context getContext(){
  return ctx;
 }
}

♦JNDI容器配置文件 JNDIContainer.properties 

//和JNDIContainer.java文件位于同一目录
DBServiceName=DBService
DBServiceClass=xyz.serviceprovider.SimpleDBService
DBServiceProperty=mydb//192.168.1.2:8421/testdb;start

LogServiceName=LogService
LogServiceClass=xyz.serviceprovider.SimpleLogService

♦JNDI客户端 JNDIClient.java

package xyz.jndi;

import javax.naming.Context;

import xyz.service.DBService;
import xyz.service.LogService;

public class JNDIClient {
 
 public static void main(String[] args){
  try{
   JNDIContainer container=new JNDIContainer();
   container.init();
   
      //JNDI客户端使用标准JNDI接口访问命名服务。
      Context ctx=container.getContext();
      DBService db=(DBService)ctx.lookup("DBService");
      System.out.println("db location is:"+db.getLocation()+",state is:"+db.getState());
      db.accessDB();
      
      LogService ls=(LogService)ctx.lookup("LogService");
      ls.log("this is a log message.");
      
      container.close();
  }
  catch(Exception e){
   e.printStackTrace();
  }
 }
}

至此，我们的整个Java SE应用已经完成。