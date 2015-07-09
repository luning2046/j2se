package cys.gh.p4_linkList;
/*
 * 链表中的元素节点
 */
class Link{
	public int data;//元素值
	public Link next;//指向下一个元素节点
	
	public Link(int data){
		this.data=data;
	}
	//显示元素值
	public void displayLink(){
		System.out.println("element value is "+data);
	}
}
/**
 * 单向链表
 */
public class LinkList {
	private Link first;//链表的头节点  ，指向链表中的第一个节点
	
	public LinkList(){
		first=null;
	}
	//是否为空
	public boolean isEmpty(){
		return first==null;
	}
	//从第一个节点开始插入一个节点
	public void insertFirst(int element){
		Link newLink = new Link(element);//创建一个新节点
		newLink.next=first;//让新节点的指针指向原地一个节点
		first=newLink;//链表 头节点指向这个新节点
	}
	//删除第一个节点并将这个节点返回
	public Link deleteFirst(){
		Link temp = first;//得到第一个节点
		first=first.next;//将第一个节点指向第二个节点  也即删除了第一个节点
		return temp;
	}
	//遍历所有节点
	public void displayList(){
		Link current = first;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	//查找指定 值的节点
	public Link find(int data){
		Link current = first;
		while(current.data!=data){
			if(current.next==null)
				return null;
			else
			    current=current.next;
		}
		return current;
	}
	//删除指定值的节点
	public Link delete(int data){
		Link current = first;
		Link previous = first;
		while(current.data!=data){
			if(current==null)
				return null;
			else{
				previous=current;
				current=current.next;
			}
		}
		if(current==first){
			first=first.next;
		}else{
			previous.next=current.next;
		}
		return current;
	}
	
}

