package cys.gh.lesson7;

import java.io.*;
/**
 * 线程组ThreadGroup学习与总结  在Java中每个线程都属于某个线程组(ThreadGroup)。例如，如果在main()中产生一个线程，
 * 则这个线程属于main线程组管理的一员，您可以使用下面的指令来获得目前线程所属的线程组名称： 
Thread.currentThread().getThreadGroup().getName();  一个线程产生时，都会被归入某个线程组，视线程是在哪个线程组中产生而定。
如果没有指定，则归入产生该子线程的线程组中。您也可以自行指定线程组，线程一旦归入某个组，就无法更换组。        
java.lang.ThreadGroup类正如其名，可以统一管理整个线程组中的线程，您可以使用以下方式来产生线程组，而且一并指定其线程组： 
ThreadGroup threadGroup1 = new ThreadGroup("group1"); ThreadGroup threadGroup2 = new ThreadGroup("group2"); 
Thread thread1 = new Thread(threadGroup1, "group1's member"); Thread thread2 = new Thread(threadGroup2, "group2's member");      
  ThreadGroup中的某些方法，可以对所有的线程产生作用，例如interrupt()方法可以interrupt线程组中所有的线 程，
  setMaxPriority()方法可以设置线程组中线程所能拥有的最高优先权(本来就拥有更高优先权的线程不受影响)。     
   如果想要一次获得线程组中所有的线程来进行某种操作，可以使用enumerate()方法，例如：
 Thread[] threads = new Thread[threadGroup1.activeCount()]; threadGroup1.enumerate(threads);       
 ThreadGroup中有一个uncaughtException()方法。当线程组中某个线程发生Unchecked exception异常时，由执行环境调用此方法进行相关处理，
 如果有必要，可以重新定义此方法，请看下面的示例。
 *
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup threadGroup1 = 
            new ThreadGroup("group1") {
                // 继承ThreadGroup并重新定义以下方法
                // 在线程成员抛出unchecked exception会执行此方法
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println(t.getName() + ": " + e.getMessage());
                }
            };
        
        Thread thread1 =
            // 这个线程是threadGroup1的一员
            new Thread(threadGroup1,
              new Runnable() {
                public void run() {
                    // 丢出unchecked例外
                    throw new RuntimeException("测试例外");
                }
            });
    
        thread1.start();
    }
}
