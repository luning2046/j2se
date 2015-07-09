
一个java类如class AA 的使用过程：
   1.先编译AA生成.class文件  
   2.将这个class文件加载到内存jvm中并生成字节码 
   3.运行这个字节码。
   
反射就是把java类中的各种成分（如 属性，方法）映射成相应的java类（如Method，Field）

一个Class对象 就是是一个类的字节码并通过这个字节码 得到这个类的方法，属性等信息

得到一个类的字节码的方式：
  1.类名.class  如：String.class
  2.对象.getClass 如  new Date().getClass();
  3.Class.forName("类名"); 