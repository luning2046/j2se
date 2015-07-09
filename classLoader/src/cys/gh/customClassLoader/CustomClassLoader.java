package cys.gh.customClassLoader;

import java.io.File;
import java.io.FileInputStream;

public class CustomClassLoader extends ClassLoader{

	private String classDir;
	
	public CustomClassLoader(String classDir){
		this.classDir = classDir;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try{
			String classFileName = classDir+"\\"+name+".class";
			File f = new File(classFileName);
			
			FileInputStream fis = new FileInputStream(f);
			byte[] buff = new byte[1024];
			int len = fis.read(buff);
			fis.close();
			return defineClass(buff, 0,len);
		}catch(Exception e){
			e.printStackTrace();
		}
		return super.findClass(name);
	}

}
