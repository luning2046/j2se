package cys.gh.lesson9_1;

public class T_3_TestByte {

	public static void main(String[] args){
		byte[] bs1 = "产盐电话".getBytes();
		for(int i=0;i<bs1.length;i++){
			/*
			 * 中文字符产生乱码
			 * 原因是：当按字节输出到控制台的时候，System.out.println((char)bs1[i])语句
			 * 告诉控制台 按一个字节的形式解析 这段二进制数据，而一个汉字有两个字节表示所以出了乱码
			 * 输出英文字码等ASCII码时，由于就是一个字节表示的，所以当控制台按一个字节解析时，也就
			 * 不会出现乱码了 而是正确显示
			 */
			System.out.println(bs1[i]);//此例子中输出值全为负值
			//所以负整数转为字符的为非ASCII吗的非法字符，所以输出值为问号？
			System.out.println((char)bs1[i]);//输出值全是问号"?"
		}
		
		byte[] bs2 = "cysghg".getBytes();
		for(int i=0;i<bs2.length;i++){
			System.out.println((char)bs2[i]);//和ASCII码对应的字符与byte类型可以相互转化
		}
	}
}
