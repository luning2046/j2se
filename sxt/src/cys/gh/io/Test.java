package cys.gh.io;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "H264_MOVIE#";
		String news = str.replace("#","%23");
		System.out.println(str);
		String coded = URLEncoder.encode("ฝารุ","Utf-8");
		System.out.println(coded);
	}
}
