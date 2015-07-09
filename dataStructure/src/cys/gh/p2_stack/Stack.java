package cys.gh.p2_stack;

public class Stack {

	/**
	 * 定义一个栈
	 */
	private int maxSize;// 栈的最大容量
	private long[] stackArray;// 栈容器
	private int top;// 栈顶指针

	public Stack(int maxSize) {
		stackArray = new long[maxSize];
		this.maxSize = maxSize;
		top = -1;
	}

	/**
	 * 入栈
	 * 
	 * @param j
	 *            入栈的元素
	 */
	public void push(long j) {
		top++;
		if (top == maxSize) {
			return;
		}
		stackArray[top] = j;
	}

	/**
	 * 出栈
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
	 * 得到栈顶元素
	 * 
	 * @return
	 */
	public long peek() {
		return stackArray[top];
	}

	/**
	 * 判断栈是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * 判断栈是否为满
	 * 
	 * @return
	 */
	public boolean isFull() {
		return top == maxSize - 1;
	}

	public static void main(String[] args) {

	}
}
