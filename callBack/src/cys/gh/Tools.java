package cys.gh;

/*
 * ��Java�У�ͨ�����Ǳ�д����һ����������˹涨һ���ӿڣ�������CallBack�ӿڣ���
 * Ȼ������ʵ������ӿڣ�ͨ��������new CallBack���ʵ���˽ӿ�CallBack����
 * Ȼ������ʵ�����һ��������Ϊ�����������˵ĳ���CallBack�ӿڴ��ݸ��˺���testTime()����
 * ���˵ĳ����Ҫʱ�ͻ�ͨ���Ǹ��ӿ����������д�ĺ�����(callBack.execute()���õĽӿڵĺ���)
 * 
 * ������ͳ��һ��������ִ��ʱ���
 */
public class Tools {

	/*
	 * ���⺯���еĳ���Ƭ��ִ�е�ĳ�����ʱ��������һ��������������������ص�����
	 * ������execute��һ���ص�����   �������ע�����testTime����
	 */
	public void testTime(CallBack callBack){
		long begin = System.currentTimeMillis();
		callBack.execute();
		long end = System.currentTimeMillis();
		System.out.println("function run time :"+(end-begin)+"����");
	}
	
	public static void main(String[] args){
		
		Tools tool = new Tools();
		
		//������testTimeע��һ���ص�����
		tool.testTime(new CallBack(){

			@Override
			public void execute() {//����ʹ�õĺô���  execute�ľ���ʵ���ǿ����Զ����
				
				for(int i=0;i<100000000;i++){
					
				}
			}
			
		});
	}
}
