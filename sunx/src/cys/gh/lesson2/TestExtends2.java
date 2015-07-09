package cys.gh.lesson2;

//传智第九课第三节讲到
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
	int num = 9;//显示初始化     在没有父类的情况下， 成员变量初始化的顺序是    1.默认初始化  2.显示初始化  3.构造方法初始化
	
	public zi(){
		super();
		System.out.println("zi show .... "+num);
//		show();
	}
	void show(){
		System.out.println("zi show "+num);
	}
}