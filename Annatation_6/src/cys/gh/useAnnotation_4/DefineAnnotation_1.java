package cys.gh.useAnnotation_4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ����ע�⣨ע��Ҳ��һ��������ࣩ
 * @Retention��һ��Ԫע�⣨���Ƕ���ע�����ע�⣩
 * ��ʾ���ע����������ڣ�����ʹ�����ע�����������������ע�����Ч��Χ
 * ��ע���ʾ����ʹ�����ע��������������Ч�����������ʱ��Ч ��@Overrideע������ڱ���ʱ��Ч��
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})//��ʾ���ע���ע�ڡ����ϡ�Ҳ�ɱ�ע�ڡ������ϡ�
public @interface DefineAnnotation_1 {

}