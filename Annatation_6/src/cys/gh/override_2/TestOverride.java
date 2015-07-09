package cys.gh.override_2;

/*
 * override注解：用于指明被注解的方法重写了父类中的方法，
 * 		如果不是合法的方法重写则编译报错
 */
public class TestOverride {

	//重写父类的Object的方法toString
	
	@Override
	public String toString(){
		String yon="是否是正确的重写！！！";
		return yon;
	}

}
