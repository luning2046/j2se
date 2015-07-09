package cys.gh.lessona11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_3_Client {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1",1981);
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			while(true){
				bw.write(br.readLine());
				bw.flush();
				if(br.readLine().equals("88")){
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
