package cys.gh.useAnnotation_5;
/*
 * ����ʹ��ע����ࣨUseAnnotion_2��
 */
public class AnnotionTest_3 {
	public static void main(String[] args){
		//UseAnnotion_2�Ƿ����DefineAnnotation_1���ע��
		if(UseAnnotion_2.class.isAnnotationPresent(DefineAnnotation_1.class)){
			//�õ�UseAnnotion_2���ϵ�ע��
			DefineAnnotation_1 da = UseAnnotion_2.class.getAnnotation(DefineAnnotation_1.class);
			System.out.println(da.color());//��ӡע���color����ֵ
		}
	
	}
}
