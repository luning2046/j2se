package cys.gh.lesson9_2;

import java.util.Properties;

public class T_3_CurrentSystemProperties {

	/**
	 * 查看当前系统的属性信息 jvm默认编码方式是GBK
	 */
	public static void main(String[] args) {
		Properties ps = System.getProperties();//得到当前系统的属性信息
		ps.list(System.out);
	}

}
