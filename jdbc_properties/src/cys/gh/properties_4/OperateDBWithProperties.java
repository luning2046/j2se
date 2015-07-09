package cys.gh.properties_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class OperateDBWithProperties {
	//读取属性文件中内容
	public static Map<String,String> getPropertiesInf() throws IOException{
		Map<String,String> properties = new HashMap<String,String>();
		
		Properties ps = new Properties();
		FileInputStream fis = new FileInputStream("DBInfor.properties");
		
		ps.load(fis);
		
		String url = ps.getProperty("db_url");
		String driver = ps.getProperty("db_driver");
		String user = ps.getProperty("name");
		String password = ps.getProperty("password");
System.out.println("url:"+url+",driver:"+driver+",user:"+user+",password:"+password);
		properties.put("url",url);
		properties.put("driver", driver);
		properties.put("user", user);
		properties.put("password", password);
		
		return properties;
	}
	public static void main(String[] args) throws Exception{
		Map<String,String> m = OperateDBWithProperties.getPropertiesInf();
	}
}








