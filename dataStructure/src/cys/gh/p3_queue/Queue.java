package cys.gh.p3_queue;

/**
 * 队列,本例是个循环队列
 * 
 * @author cys
 */
public class Queue {

	private int[] queArray;
	private int front;// 队头指针
	// 队尾指针
	private int rear;
	private int maxSize;// 队列最大的长度
	private int nItems;// 当前队列中的元素个数

	// constructor
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// 进队列，队尾是入口 队头是出口
	public void insert(int j) {
		if (rear == maxSize - 1) {
			rear = -1;// 本例是循环队列 当队列的下标到maxSize-1时 ，要将队尾指针指向开始索引-1.
		}
		queArray[++rear] = j;
		nItems++;
	}

	// 出队列
	public int remove() {
		int temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	// 查看队头
	public int peekFront() {
		return queArray[front];
	}

	// 是否队空
	public boolean isEmpty() {
		return nItems == 0;
	}

	// 是否队满
	public boolean isFull() {
		return nItems == maxSize;
	}

	// 队有多少个元素
	public int size() {
		return nItems;
	}

}
