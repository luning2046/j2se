package cys.gh;

/**
 * 具体构建角色
 * 这就是要被构建的原始功能实现类
 */
public class ConcreteComponent implements Component{

	@Override
	public void doSomething() {
		System.out.println("功能A");
	}

}
