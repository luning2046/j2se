package cys.gh.lesson7;

import java.io.*;
/**
 * �߳���ThreadGroupѧϰ���ܽ�  ��Java��ÿ���̶߳�����ĳ���߳���(ThreadGroup)�����磬�����main()�в���һ���̣߳�
 * ������߳�����main�߳�������һԱ��������ʹ�������ָ�������Ŀǰ�߳��������߳������ƣ� 
Thread.currentThread().getThreadGroup().getName();  һ���̲߳���ʱ�����ᱻ����ĳ���߳��飬���߳������ĸ��߳����в���������
���û��ָ�����������������̵߳��߳����С���Ҳ��������ָ���߳��飬�߳�һ������ĳ���飬���޷������顣        
java.lang.ThreadGroup����������������ͳһ���������߳����е��̣߳�������ʹ�����·�ʽ�������߳��飬����һ��ָ�����߳��飺 
ThreadGroup threadGroup1 = new ThreadGroup("group1"); ThreadGroup threadGroup2 = new ThreadGroup("group2"); 
Thread thread1 = new Thread(threadGroup1, "group1's member"); Thread thread2 = new Thread(threadGroup2, "group2's member");      
  ThreadGroup�е�ĳЩ���������Զ����е��̲߳������ã�����interrupt()��������interrupt�߳��������е��� �̣�
  setMaxPriority()�������������߳������߳�����ӵ�е��������Ȩ(������ӵ�и�������Ȩ���̲߳���Ӱ��)��     
   �����Ҫһ�λ���߳��������е��߳�������ĳ�ֲ���������ʹ��enumerate()���������磺
 Thread[] threads = new Thread[threadGroup1.activeCount()]; threadGroup1.enumerate(threads);       
 ThreadGroup����һ��uncaughtException()���������߳�����ĳ���̷߳���Unchecked exception�쳣ʱ����ִ�л������ô˷���������ش���
 ����б�Ҫ���������¶���˷������뿴�����ʾ����
 *
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup threadGroup1 = 
            new ThreadGroup("group1") {
                // �̳�ThreadGroup�����¶������·���
                // ���̳߳�Ա�׳�unchecked exception��ִ�д˷���
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println(t.getName() + ": " + e.getMessage());
                }
            };
        
        Thread thread1 =
            // ����߳���threadGroup1��һԱ
            new Thread(threadGroup1,
              new Runnable() {
                public void run() {
                    // ����unchecked����
                    throw new RuntimeException("��������");
                }
            });
    
        thread1.start();
    }
}
