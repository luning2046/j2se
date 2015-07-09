

import static java.lang.Math.*;//静态导入的格式
public class StaticImport {

	public static void main(String[] args) {
		/*
		 * 未使用静态导入之前
		 * System.out.println(Math.max(5, 12));
		 * System.out.println(Math.min(3,1));
		 */
		System.out.println(max(5, 12));//静态导入之后
		System.out.println(min(3,1));
	}

}
