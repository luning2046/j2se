package cys.gh.useAnnotation_5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ����ע�⣨ע��Ҳ��һ��������ࣩ
 * ��Ϊע���������
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})//��ʾ���ע��ʹ�����������ϣ�������
public @interface DefineAnnotation_1 {
	String color() default "blue";//Ϊע��������һ������(��ָ���ı����Ե�Ĭ��ֵ)����ʽ����һ����ķ���
}
