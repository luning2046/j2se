package cys.gh.useAnnotation_7;
/*
 * ����ʹ��ע����ࣨUseAnnotion_2��
 */
public class AnnotionTest_3 {
	public static void main(String[] args){
		//UseAnnotion_2�Ƿ����DefineAnnotation_1���ע��
		if(UseAnnotion_2.class.isAnnotationPresent(DefineAnnotation_1.class)){
			//�õ�UseAnnotion_2���ϵ�ע��
			DefineAnnotation_1 da = UseAnnotion_2.class.getAnnotation(DefineAnnotation_1.class);
			System.out.println(da.value());//��ӡע���color����ֵ
			System.out.println(da.arrayAtr().length);//��ӡ��������ֵ
			System.out.println(da.colorAtr().name());//��ӡö������ֵ
		}
	
	}
}
