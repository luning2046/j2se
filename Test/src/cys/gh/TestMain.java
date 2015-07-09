package cys.gh;

import java.io.IOException;
import java.io.InputStream;

public class TestMain {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		while(true){
			int buf1 = in.read();
			System.out.println(buf1);
		}

//		int buf2 = in.read();
//		System.out.println(buf2);
	}

}
