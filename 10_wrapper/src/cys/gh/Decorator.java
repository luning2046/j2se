package cys.gh;

/**
 *  装饰角色
 *	为原始功能的进行增强的类
 */
public class Decorator implements Component{
	
	private ConcreteComponent cc;

	public Decorator(ConcreteComponent cc){
		this.cc=cc;
	}
	@Override
	public void doSomething() {
		cc.doSomething();
		doAnotherThing();
	}

	private void doAnotherThing(){
		System.out.println("增强一个功能B");
	}
}
