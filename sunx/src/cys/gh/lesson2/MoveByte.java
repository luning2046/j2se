package cys.gh.lesson2;
/*
 * 移位运算测试
 */
public class MoveByte {
	//在计算机中数值都用补码表示
	//关于移位运算的问题 都用补码表示
	public static void main(String[] args){
		//int i=-1;
		//System.out.println(Integer.toHexString(i));
		byte i=1;//占一个字节
		byte r1=(byte)(i<<6);//值为01000000 = 64 由此可得n位数据左移小于等于n-2位时符合左移1位相当于乘以1个2
							//左移2位相当于乘以2个2
		byte r2=(byte)(i<<7);//右移七位后此值为（10000000）二进制补码=（-128）十进制
		byte r3=(byte)(i<<8);//cpu的位数是32位的 所以如果n位数据左移大于等于n位小于32位时 横为0 
						//高于等于32位时 有周期性如（右移32位相当于右移0位 ，33位相当于1位
		byte r4=(byte)(i<<32);//值为1   相当于i右移0位 周期为32 每移32的倍数位（如64，96...）都相当于右移0位
		System.out.println(r1+","+r2+","+r3+","+r4);
	}
}
