package cys.gh.customClassLoader;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {

		CustomClassLoader ccl = new CustomClassLoader("storeClassDir");
		Class clazz = ccl.loadClass("ClassLoaderAttachement");
		System.out.println(clazz.getClassLoader()+"-------------"+clazz.getClassLoader().getParent());
		Date d = (Date)clazz.newInstance();
		System.out.println(d);
	}

}
