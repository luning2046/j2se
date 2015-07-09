package cys.gh.deprecated_1;

/*
 * deprecated注解：来标记过时的API
 * 
 * 此例中在A类中有一个方法mm，如果用此注解标识，则在TestDeprecated类
 * 	中使用mm方法时，则编译会报错但在eclispe环境中会发警告（用黄色标块），说TestDeprecate类引用了过时的方法mm
 */

class A{
	//表明mm方法是一个过时的方法
	@Deprecated
	public void mm(){
		System.out.println("ksjfsdf");
	}
	
}

public class TestDeprecated {
	public static void main(String[] args){
		new A().mm();
	}

}
