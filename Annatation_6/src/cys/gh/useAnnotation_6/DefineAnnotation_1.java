package cys.gh.useAnnotation_6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ����ע�⣨ע��Ҳ��һ��������ࣩ
 * ��Ϊע���������
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DefineAnnotation_1 {
	//����һ��value���ԣ���ֻ����һ��value����ʱ��
	//�������ʱ�������value���������������Ա��붼��defaultĬ��ֵʱ������
	//�����ʹ�����ע���value����ʱ������������д��
	//@DefineAnnotation_1(value="cys")//����д��
	//@DefineAnnotation_1("cys")//ʡ�Ե�"value="
	String value();
}
