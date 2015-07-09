package cys.gh.lesson1;
//byte基本数据类型的问题
public class ByteModelProblem {

	public static void main(String[] args){
		byte b;
		b=13;//任何一个在整数类型范围内的数字如3它的默认数据类型为int,之所以编译器没有报错，是因为这个常数在-127到126之间，超出这个范围就是编译出错 报告“丢失精度异常”
		//b=b*3;此语句错误，原因是一个常量3是int类型，b是byte类型，在和int类型运算时自动将这个类型进行提升为int类型 ，将int类型结果付给byte类型就会报错
		//b*=3; 此句不报错，这种运算符，会自动进行强制类型转换
//		byte a,c; b = a+c; 这两句会编译报错，两个byte类型的变量进行运算，器结果可能超过byte类型的范围，
		b=(byte)(b*3);//这样正确
		System.out.println(b);
		
		
		int i=4;
		//short s = i;错误 因为i是int性（精度高）s是short（精度低）会发生异常要强制类型转换
		short s = (short)i;//可以
		System.out.println(s);
		
		
		float f=0.0f;
		//f=1.3;此语句错误，1.3默认的数据类型是double类型 出丢失精度异常
		f=1.3f;//正确 浮点数后跟一个f表示float类型
		double d=2.3;//正确
		boolean bool=true;//boolean类型只能取true或false两个值
		System.out.println(d+","+bool);
		
		
		//数组付出初始值容易出错
		int[] arry1 ={1,2,3,3};//正确
		int[] arry2= new int[]{1,2,2};//正确
		//int[] arry3=new int[3]{1,2,2};//错误编译通不过
		
		int[] arry4;
		//arry4 = {2,3,4};//错误编译通不过
		
		int c=0;
		System.out.println(c++);//结果为0  当执行到c++时是先使用后加1 因此本句先使用输出
		System.out.println(c);//结果为1  因为c++参与运算完了  所以为1
	}
}
