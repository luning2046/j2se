package cys.gh;

/**
 *  װ�ν�ɫ
 *	Ϊԭʼ���ܵĽ�����ǿ����
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
		System.out.println("��ǿһ������B");
	}
}
