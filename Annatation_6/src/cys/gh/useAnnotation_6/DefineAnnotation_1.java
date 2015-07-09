package cys.gh.useAnnotation_6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 定义注解（注解也是一个特殊的类）
 * 并为注解添加属性
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DefineAnnotation_1 {
	//设置一个value属性（当只有这一个value属性时或
	//多个属性时除了这个value属性其余所有属性必须都有default默认值时）这种
	//情况下使用这个注解的value属性时可以如下两种写法
	//@DefineAnnotation_1(value="cys")//正常写法
	//@DefineAnnotation_1("cys")//省略的"value="
	String value();
}
