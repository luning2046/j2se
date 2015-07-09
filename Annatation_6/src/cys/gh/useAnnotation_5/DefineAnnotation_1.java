package cys.gh.useAnnotation_5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 定义注解（注解也是一个特殊的类）
 * 并为注解添加属性
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})//表示这个注解使用在用在类上，方法上
public @interface DefineAnnotation_1 {
	String color() default "blue";//为注解增加了一个属性(并指定的本属性的默认值)，格式就像一般类的方法
}
