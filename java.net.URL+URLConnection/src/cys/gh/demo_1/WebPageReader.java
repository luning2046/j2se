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
 * ͨ��HttpURLConnection���ȡ ָ��url����ҳ��Ϣ
 * URLConnection����Ӧ�ó���� URL ֮���ͨ������
 */
public class WebPageReader {

	private static URLConnection connection;
	HttpURLConnection hc = null;

	private void httpUrlConnection() {
		try {
			String pathUrl = "http://172.20.0.206:8082/TestServelt/login.do";
			// ��������
			URL url = new URL(pathUrl);
			HttpURLConnection httpConn = (HttpURLConnection) url
					.openConnection();

			// //������������
			httpConn.setDoOutput(true);// ʹ�� URL ���ӽ������
			httpConn.setDoInput(true);// ʹ�� URL ���ӽ�������
			httpConn.setUseCaches(false);// ���Ի���
			httpConn.setRequestMethod("POST");// ����URL���󷽷�
			String requestString = "�ͷ���Ҫ��������ʽ���͵�����˵�����...";

			// ������������
			// ��������ֽ����ݣ������������ı��룬���������������˴����������ı���һ��
			byte[] requestStringBytes = requestString.getBytes("UTF_8");
			httpConn.setRequestProperty("Content-length", ""
					+ requestStringBytes.length);
			httpConn.setRequestProperty("Content-Type",
					"application/octet-stream");
			httpConn.setRequestProperty("Connection", "Keep-Alive");// ά�ֳ�����
			httpConn.setRequestProperty("Charset", "UTF-8");
			//
			String name = URLEncoder.encode("������", "utf-8");
			httpConn.setRequestProperty("NAME", name);

			// �������������д������
			OutputStream outputStream = httpConn.getOutputStream();
			outputStream.write(requestStringBytes);
			outputStream.close();
			// �����Ӧ״̬
			int responseCode = httpConn.getResponseCode();

			if (HttpURLConnection.HTTP_OK == responseCode) {// ���ӳɹ�
				// ����ȷ��Ӧʱ��������
				StringBuffer sb = new StringBuffer();
				String readLine;
				BufferedReader responseReader;
				// ������Ӧ�����������������Ӧ������ı���һ��
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

	// ����url����
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

	// ��ȡ��ҳ��Ϣ
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

	// ����
	public static void main(String[] args) {
		connect("http://192.168.11.13:8080/request_3/tr");
		readContents();
	}

}
