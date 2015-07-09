package cys.gh.lesson8;

import java.util.Properties;

public class TestProperties_7_1 {

	/**
	 * /获得系统属性
	 */
	public static void main(String[] args) {
		Properties pps = System.getProperties();//获得系统属性
		pps.list(System.out);
	}

}
