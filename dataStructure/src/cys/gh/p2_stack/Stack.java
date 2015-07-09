package cys.gh.p2_stack;

public class Stack {

	/**
	 * ����һ��ջ
	 */
	private int maxSize;// ջ���������
	private long[] stackArray;// ջ����
	private int top;// ջ��ָ��

	public Stack(int maxSize) {
		stackArray = new long[maxSize];
		this.maxSize = maxSize;
		top = -1;
	}

	/**
	 * ��ջ
	 * 
	 * @param j
	 *            ��ջ��Ԫ��
	 */
	public void push(long j) {
		top++;
		if (top == maxSize) {
			return;
		}
		stackArray[top] = j;
	}

	/**
	 * ��ջ
	 * 
	 * @return
	 */
	public long pop() {
		if (top < 0) {
			return 0;
		}
		return stackArray[top--];
	}

	/**
	 * �õ�ջ��Ԫ��
	 * 
	 * @return
	 */
	public long peek() {
		return stackArray[top];
	}

	/**
	 * �ж�ջ�Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * �ж�ջ�Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isFull() {
		return top == maxSize - 1;
	}

	public static void main(String[] args) {

	}
}
