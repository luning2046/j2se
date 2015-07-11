package cys.gh.lesson7.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ���һ��������
 * ���һ������ϵͳ
 */
public class T05_CacheDemo {

	private Map<String, Object> cache = new HashMap<String, Object>();
	public static void main(String[] args) {

	}

	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	/**
	 * �������������ʹ�ó���
	 * �����߳�  t1 t2
	 *  ������1 t1ִ�е� a�� ������Ȼ����벢����ִ�к������룬ִ�е�d��ʱ��
	 *     ����valueΪ�� ����˺�������Ҫ�޸Ĺ�����Դcache�ˣ���ʱ���⿪д����e�䣩
	 *     ��д����f�䣩��Ȼ��ִ�е�g�䣬t1��ͣ��
	 *     2 ��ʱt2 ִ��  ִ�е�a���ǣ�һ����ǰ��  ����д״̬  ��ôt2����ͣ�ˡ���û��a�䣬t2�ǲ�֪����ǰ���������˶���
	 *     Ҳ��û��֪������״̬��
	 *   
	 */
	public  Object getData(String key){
		rwl.readLock().lock();//a
		Object value = null;//b
		try{
			value = cache.get(key);//c
			if(value == null){//d
				rwl.readLock().unlock();//e
				rwl.writeLock().lock();//f
				try{
					if(value==null){//g
						value = "aaaa";//ʵ��ʧȥqueryDB();
					}
				}finally{
					rwl.writeLock().unlock();//h
				}
				rwl.readLock().lock();//i
			}
		}finally{
			rwl.readLock().unlock();//j
		}
		return value;
	}
}