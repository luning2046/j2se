package cys.gh.p4_linkList;
/*
 * �����е�Ԫ�ؽڵ�
 */
class Link{
	public int data;//Ԫ��ֵ
	public Link next;//ָ����һ��Ԫ�ؽڵ�
	
	public Link(int data){
		this.data=data;
	}
	//��ʾԪ��ֵ
	public void displayLink(){
		System.out.println("element value is "+data);
	}
}
/**
 * ��������
 */
public class LinkList {
	private Link first;//�����ͷ�ڵ�  ��ָ�������еĵ�һ���ڵ�
	
	public LinkList(){
		first=null;
	}
	//�Ƿ�Ϊ��
	public boolean isEmpty(){
		return first==null;
	}
	//�ӵ�һ���ڵ㿪ʼ����һ���ڵ�
	public void insertFirst(int element){
		Link newLink = new Link(element);//����һ���½ڵ�
		newLink.next=first;//���½ڵ��ָ��ָ��ԭ��һ���ڵ�
		first=newLink;//���� ͷ�ڵ�ָ������½ڵ�
	}
	//ɾ����һ���ڵ㲢������ڵ㷵��
	public Link deleteFirst(){
		Link temp = first;//�õ���һ���ڵ�
		first=first.next;//����һ���ڵ�ָ��ڶ����ڵ�  Ҳ��ɾ���˵�һ���ڵ�
		return temp;
	}
	//�������нڵ�
	public void displayList(){
		Link current = first;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	//����ָ�� ֵ�Ľڵ�
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
	//ɾ��ָ��ֵ�Ľڵ�
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

