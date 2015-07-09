package cys.gh;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;;

public class TestMain {

	/**
	 * 向http://127.0.0.1:8080/shop/business/AddDeliveryInfo.action通过
	 * post方式，传递参数，且就收返回值页面信息
	 */
	public static void main(String[] args) throws IOException {
		HttpURLConnection urlConnection= null;
		URL url = new URL("http://218.205.244.252:8080/shop/business/AddDeliveryInfo.action:8080/shop/business/AddDeliveryInfo.action");
		urlConnection = (HttpURLConnection) url.openConnection();

		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		urlConnection.setDoInput(true);
	
		String[] strs = "mobile=13900000000&district=高新区&memberId=003080111891&address=边边上&province=四川省&zip=610000&tel=88881111&city=成都市&receiverName=收货火星人".split("&");
		String[] kv= null;
		OutputStream os = urlConnection.getOutputStream();
		for(String str:strs){
			kv= str.split("=");
			os.write((kv[0]+"="+URLEncoder.encode(kv[1],"UTF-8")+"&").getBytes());
		}
		os.flush();
		os.close();
		
		
		InputStream in = urlConnection.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
		StringBuffer temp = new StringBuffer();
		String line = bufferedReader.readLine();
		while (line != null) {
			temp.append(line).append("\r\n");
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		
		String content = new String(temp);
		System.out.println(content);
	}

}
