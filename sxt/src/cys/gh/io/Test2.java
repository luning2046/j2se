package cys.gh.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
	/*
	 * ¸´ÖÆÍ¼Æ¬
	 */
	public static void main(String[] args) throws Exception{
		FileInputStream in = new FileInputStream("h:\\10.jpg");
		FileOutputStream out = new FileOutputStream("h:\\11.jpg");
		int b = 0;
		while((b=in.read())!=-1){
			out.write(b);
			out.flush();
		}
		out.close();
		in.close();
	}
}
