package cys.gh.lesson3;
/*
 * ��ջ�еı���ָ��һ���������͵����ݺ� 
 * ��Person p=new Person(), p����ջ�б�������new Person()�����Ǵ����ڶ��ڴ��С�
 * ��p���������ڽ���p����ڴ�����ͻ��Զ���ʧ��
 * ��ʱ���е����������Ȼ���ڣ�������һ�������ڴ��ˣ���Ϊû������ָ�����ˣ���
 * ��ĳһ��ʱ�ڣ����е�����ڴ�ᱻjvm�������ռ���������ͷ�����ڴ档
 */
class Garbage{
	   int  index ;
	   static int count;
	   Garbage(){
	      count++;
	      System.out.println("object"+count+"construct");
	      setId(count);
	}
	void setId(int id)
	{
	  index=id;
	}

	protected void finalize(){  //JVMÿ�ν����������ղ���֮ǰ��Ҫ���ø���д��java.lang.object��ķ�����
	     System.out.println("object "+index+"is reclaimed");
	}
	
	public static void main(String[] args){
	    new Garbage();  //û�ж�����������ʵ���ᱻJVM���������غ����
	    new Garbage();
	    new Garbage();
	    new Garbage();
	    
	System.gc(); //�������ղ�����JVM�Զ����ڴ治�������������ȼ��ϵ�
	}	//���������ճ������
	                 //�˷�����java.lang.System���еķ��� �Ǹ��û�������ʾ�������������ճ���ķ���
}
