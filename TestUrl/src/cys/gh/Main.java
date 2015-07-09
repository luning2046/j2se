package cys.gh;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com/tieba/tee?name=ls");
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getQuery());
		System.out.println(url.getFile());
	}

}
