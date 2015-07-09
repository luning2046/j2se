package cys.gh.p5_doubleLinkList;

/*
 * 双向链表
 */
class DoubleLink{
	public int data;
	public DoubleLink next;
	public DoubleLink previous;
	
	public DoubleLink(int data){
		this.data=data;
	}
	public void displayLink(){
		System.out.print(data+" ");
	}
}
public class DoubleLinkedList {
	private DoubleLink first;//头指针
	private DoubleLink last;//尾指针
	
	public DoubleLinkedList(){
		first=null;
		last=null;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public void insertFirst(int d){
		DoubleLink newlink = new DoubleLink(d);
		if(isEmpty()){
			last=newlink;
		}else{
			first.previous=newlink;
		}
		newlink.next=first;
		first=newlink;
	}
	public void insertLast(int d){
		DoubleLink newlink = new DoubleLink(d);
		if(isEmpty()){
			first=newlink;
		}else{
			newlink.previous=last;
			last.next=newlink;
		}
		last=newlink;
	}
}

