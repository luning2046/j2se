package cys.gh;

import java.lang.reflect.Constructor;

/*
 * ͨ�����䴴��һ��ʵ�����󣨿����ò�ͬ�Ĺ��췽����������
 */
public class NewInstanceTest {

	public static void main(String[] args) throws Exception {
		Class clazz = User.class;
		Object obj = getObj(clazz);
		System.out.println(obj);
	}
	
	public static Object getObj(Class clazz) throws Exception{
//		//ȡ�ø�������й��췽��
//		Constructor[] cons = clazz.getConstructors();
//		//�������й��췽��
//		for(Constructor c : cons){
//			//System.out.println(c.getName());ȡ��������췽��������
//			Class[] cs = c.getParameterTypes();//ȡ��������췽���Ĳ������ͼ���
//			for(Class clas:cs){//������Щ��������
//				System.out.print("====="+clas.getName()+",");
//			}
//			System.out.println();
//		}
		Constructor cons = clazz.getConstructor(int.class,String.class);//�õ�ָ�������Ĺ��췽��
		//ͨ��������췽������һ��ʵ����clazz.newInstance();��ȱʡ�Ĺ��췽������ʵ����
		Object obj = cons.newInstance(1,"cys");
		return obj;
	}
}

