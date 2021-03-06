package cys.gh.useAnnotation_4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 定义注解（注解也是一个特殊的类）
 * @Retention是一个元注解（就是定义注解类的注解）
 * 表示这个注解的生命周期，根据使用这个注解的类生命周期来定注解的有效范围
 * 此注解表示，在使用这个注解的类的运行期有效（还有如编译时有效 如@Override注解就是在编译时有效）
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})//表示这个注解标注在“类上”也可标注在“方法上”
public @interface DefineAnnotation_1 {

}
