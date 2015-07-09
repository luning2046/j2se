回调函数

下面是一个例子：
如果我们要测试一个类的方法的执行时间，通常我们会这样做：



 
public class TestObject {   
       
    public static void testMethod(){   
        for(int i=0; i<100000000; i++){   
               
        }   
    }   
       
    public void testTime(){   
        long begin = System.currentTimeMillis();//测试起始时间   
        testMethod();//测试方法   
        long end = System.currentTimeMillis();//测试结束时间   
        System.out.println("[use time]:" + (end - begin));//打印使用时间   
    }   
       
    public static void main(String[] args) {   
        TestObject test=new TestObject();   
        test.testTime();   
    }   
}   

大家看到了testTime()方法，就只有"//测试方法"是需要改变的，下面我们来做一个函数实现相同功能但更灵活：

首先定一个回调接口：



 
public interface CallBack {   
    //执行回调操作的方法   
    void execute();   
}   

然后再写一个工具类：



 
public class Tools {   
       
       
    public void testTime(CallBack callBack) {   
        long begin = System.currentTimeMillis();//测试起始时间   
        callBack.execute();///进行回调操作   
        long end = System.currentTimeMillis();//测试结束时间   
        System.out.println("[use time]:" + (end - begin));//打印使用时间   
    }   
       
    public static void main(String[] args) {   
        Tools tool = new Tools();   
        tool.testTime(new CallBack(){   
            //定义execute方法   
            public void execute(){   
                //这里可以加放一个或多个要测试运行时间的方法   
                TestObject.testMethod();   
            }   
        });   
    }   
       
}   

大家看到，testTime()传入定义callback接口的execute()方法就可以实现回调功能

 

