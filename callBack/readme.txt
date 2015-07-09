�ص�����

������һ�����ӣ�
�������Ҫ����һ����ķ�����ִ��ʱ�䣬ͨ�����ǻ���������



 
public class TestObject {   
       
    public static void testMethod(){   
        for(int i=0; i<100000000; i++){   
               
        }   
    }   
       
    public void testTime(){   
        long begin = System.currentTimeMillis();//������ʼʱ��   
        testMethod();//���Է���   
        long end = System.currentTimeMillis();//���Խ���ʱ��   
        System.out.println("[use time]:" + (end - begin));//��ӡʹ��ʱ��   
    }   
       
    public static void main(String[] args) {   
        TestObject test=new TestObject();   
        test.testTime();   
    }   
}   

��ҿ�����testTime()��������ֻ��"//���Է���"����Ҫ�ı�ģ�������������һ������ʵ����ͬ���ܵ�����

���ȶ�һ���ص��ӿڣ�



 
public interface CallBack {   
    //ִ�лص������ķ���   
    void execute();   
}   

Ȼ����дһ�������ࣺ



 
public class Tools {   
       
       
    public void testTime(CallBack callBack) {   
        long begin = System.currentTimeMillis();//������ʼʱ��   
        callBack.execute();///���лص�����   
        long end = System.currentTimeMillis();//���Խ���ʱ��   
        System.out.println("[use time]:" + (end - begin));//��ӡʹ��ʱ��   
    }   
       
    public static void main(String[] args) {   
        Tools tool = new Tools();   
        tool.testTime(new CallBack(){   
            //����execute����   
            public void execute(){   
                //������Լӷ�һ������Ҫ��������ʱ��ķ���   
                TestObject.testMethod();   
            }   
        });   
    }   
       
}   

��ҿ�����testTime()���붨��callback�ӿڵ�execute()�����Ϳ���ʵ�ֻص�����

 

