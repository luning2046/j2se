package cys.gh.lesson2;

//���ǵھſε����ڽ���
public class TestExtends2 {
	public static void main(String[] args){
		zi z = new zi();
		z.show();
	}
}
class Fq{
	public Fq(){
		show();
	}
	void show(){
		System.out.println("fq show");
	}
}

class zi extends Fq{
	int num = 9;//��ʾ��ʼ��     ��û�и��������£� ��Ա������ʼ����˳����    1.Ĭ�ϳ�ʼ��  2.��ʾ��ʼ��  3.���췽����ʼ��
	
	public zi(){
		super();
		System.out.println("zi show .... "+num);
//		show();
	}
	void show(){
		System.out.println("zi show "+num);
	}
}