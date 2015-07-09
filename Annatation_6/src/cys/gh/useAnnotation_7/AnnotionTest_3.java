package cys.gh.useAnnotation_7;
/*
 * 测试使用注解的类（UseAnnotion_2）
 */
public class AnnotionTest_3 {
	public static void main(String[] args){
		//UseAnnotion_2是否存在DefineAnnotation_1这个注解
		if(UseAnnotion_2.class.isAnnotationPresent(DefineAnnotation_1.class)){
			//得到UseAnnotion_2类上的注解
			DefineAnnotation_1 da = UseAnnotion_2.class.getAnnotation(DefineAnnotation_1.class);
			System.out.println(da.value());//打印注解的color属性值
			System.out.println(da.arrayAtr().length);//打印数组属性值
			System.out.println(da.colorAtr().name());//打印枚举属性值
		}
	
	}
}
