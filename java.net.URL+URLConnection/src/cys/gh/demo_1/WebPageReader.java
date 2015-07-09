package cys.gh.demo_1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/*
 * 通过HttpURLConnection类获取 指定url的网页信息
 * URLConnection代表应用程序和 URL 之间的通信链接
 */
public class WebPageReader {

	private static URLConnection connection;
	HttpURLConnection hc = null;

	private void httpUrlConnection() {
		try {
			String pathUrl = "http://172.20.0.206:8082/TestServelt/login.do";
			// 建立连接
			URL url = new URL(pathUrl);
			HttpURLConnection httpConn = (HttpURLConnection) url
					.openConnection();

			// //设置连接属性
			httpConn.setDoOutput(true);// 使用 URL 连接进行输出
			httpConn.setDoInput(true);// 使用 URL 连接进行输入
			httpConn.setUseCaches(false);// 忽略缓存
			httpConn.setRequestMethod("POST");// 设置URL请求方法
			String requestString = "客服端要以以流方式发送到服务端的数据...";

			// 设置请求属性
			// 获得数据字节数据，请求数据流的编码，必须和下面服务器端处理请求流的编码一致
			byte[] requestStringBytes = requestString.getBytes("UTF_8");
			httpConn.setRequestProperty("Content-length", ""
					+ requestStringBytes.length);
			httpConn.setRequestProperty("Content-Type",
					"application/octet-stream");
			httpConn.setRequestProperty("Connection", "Keep-Alive");// 维持长连接
			httpConn.setRequestProperty("Charset", "UTF-8");
			//
			String name = URLEncoder.encode("黄武艺", "utf-8");
			httpConn.setRequestProperty("NAME", name);

			// 建立输出流，并写入数据
			OutputStream outputStream = httpConn.getOutputStream();
			outputStream.write(requestStringBytes);
			outputStream.close();
			// 获得响应状态
			int responseCode = httpConn.getResponseCode();

			if (HttpURLConnection.HTTP_OK == responseCode) {// 连接成功
				// 当正确响应时处理数据
				StringBuffer sb = new StringBuffer();
				String readLine;
				BufferedReader responseReader;
				// 处理响应流，必须与服务器响应流输出的编码一致
				responseReader = new BufferedReader(new InputStreamReader(
						httpConn.getInputStream(), "UTF_8"));
				while ((readLine = responseReader.readLine()) != null) {
					sb.append(readLine).append("\n");
				}
				responseReader.close();
//				tv.setText(sb.toString());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// 建立url连接
	public static void connect(String urlString) {

		try {
			URL url = new URL(urlString);
			connection = url.openConnection();
			System.out.println(connection.getClass());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 读取网页信息
	public static void readContents() {
		BufferedReader in = null;
		try {
			InputStream is = connection.getInputStream();
			in = new BufferedReader(new InputStreamReader(is));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 测试
	public static void main(String[] args) {
		connect("http://192.168.11.13:8080/request_3/tr");
		readContents();
	}

}
