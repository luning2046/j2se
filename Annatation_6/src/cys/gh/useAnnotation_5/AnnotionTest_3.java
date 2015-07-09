package cys.gh.useAnnotation_5;
/*
 * 测试使用注解的类（UseAnnotion_2）
 */
public class AnnotionTest_3 {
	public static void main(String[] args){
		//UseAnnotion_2是否存在DefineAnnotation_1这个注解
		if(UseAnnotion_2.class.isAnnotationPresent(DefineAnnotation_1.class)){
			//得到UseAnnotion_2类上的注解
			DefineAnnotation_1 da = UseAnnotion_2.class.getAnnotation(DefineAnnotation_1.class);
			System.out.println(da.color());//打印注解的color属性值
		}
	
	}
}
