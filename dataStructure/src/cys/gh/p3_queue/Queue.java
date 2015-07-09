package cys.gh.p3_queue;

/**
 * ����,�����Ǹ�ѭ������
 * 
 * @author cys
 */
public class Queue {

	private int[] queArray;
	private int front;// ��ͷָ��
	// ��βָ��
	private int rear;
	private int maxSize;// �������ĳ���
	private int nItems;// ��ǰ�����е�Ԫ�ظ���

	// constructor
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// �����У���β����� ��ͷ�ǳ���
	public void insert(int j) {
		if (rear == maxSize - 1) {
			rear = -1;// ������ѭ������ �����е��±굽maxSize-1ʱ ��Ҫ����βָ��ָ��ʼ����-1.
		}
		queArray[++rear] = j;
		nItems++;
	}

	// ������
	public int remove() {
		int temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	// �鿴��ͷ
	public int peekFront() {
		return queArray[front];
	}

	// �Ƿ�ӿ�
	public boolean isEmpty() {
		return nItems == 0;
	}

	// �Ƿ����
	public boolean isFull() {
		return nItems == maxSize;
	}

	// ���ж��ٸ�Ԫ��
	public int size() {
		return nItems;
	}

}
