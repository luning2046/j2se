���������concurrent��ʽ

1�������¼ӵĶ��̰߳�
   Java 5.0���¼������������̰߳���
	   java.util.concurrent, 
	   java.util.concurrent.atomic, 
	   java.util.concurrent.locks. 

	java.util.concurrent�����˳��õĶ��̹߳��ߣ����µĶ��̹߳��ߵ����塣 
	java.util.concurrent.atomic�����˲��ü�������¾��ܸı�ֵ��ԭ�ӱ�����
	����˵AtomicInteger�ṩ��addAndGet()������
	Add��Get��������ͬ�Ĳ�����Ϊ�˱�֤����̲߳����ţ�����������������������ı�����Ȼ���������ķ�Χ�ڽ�������������
	����AtomicInteger.addAndGet()�Ͳ��õ������������ˣ����ڲ�ʵ�ֱ�֤����������������ԭ�����������ģ����ᱻ����̸߳��š� 
	java.util.concurrent.locks�����������Ĺ��ߡ�



2��Callable �� Future�ӿ�
	   Callable��������Runnable�Ľӿڣ�ʵ��Callable�ӿڵ����ʵ��Runnable���඼�ǿɱ������߳�ִ�е�����
	   Callable��Runnable�м��㲻ͬ��
	
	Callable�涨�ķ�����call()����Runnable�涨�ķ�����run(). 
	Callable������ִ�к�ɷ���ֵ����Runnable�������ǲ��ܷ���ֵ�ġ� 
	call�����������׳��쳣����run���������ǲ����׳��쳣�ġ� 
	����Callable������õ�һ��Future����ͨ��Future������˽�����ִ���������ȡ�������ִ�У����ɻ�ȡ����ִ�еĽ���� 
