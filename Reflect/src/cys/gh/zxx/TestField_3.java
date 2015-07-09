package cys.gh.zxx;

import java.lang.reflect.Field;

public class TestField_3 {

	public static void main(String[] args)throws Exception {
		
		ReflectPoint rp = new ReflectPoint(5,6);
		Field f_y = rp.getClass().getField("y");//ȡ����Ϊ"y"�����ԣ�����ȡprivate������
		
		//f_y��ֵ�Ƕ��٣���6����!f_y���Ƕ������ϵı����������ϵģ�Ҫȡ��ĳ��������ֵ����ָ��һ������
		System.out.println(f_y.get(rp));//ȡָ�����������ֵ
	
		Field f_x = rp.getClass().getDeclaredField("x");//ȡprivate������
		//��Ϊ�����Ե�private�����Բ���������ķ�ʽȡ����ָ�����������ֵ
		f_x.setAccessible(true);//ͨ�������Ϳɷ������ֵ��
		System.out.println(f_x.get(rp));
		
		System.out.println(f_y.getType());//ȡ����f_y������
		
	}
}

class ReflectPoint{
	private int x;
	public int y;
	
	public ReflectPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
}