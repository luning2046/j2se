package cys.gh.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_2_Client {

	/**
	 * �˳������ɷ�������ִ�е�dis.readUTF()ʱ
	 *   �׳�java.io.EOFException  ԭ����ִ����
	 *   dos.close()������Ҳ����˵���ڷ������˵�������dis
	 *   ��˵dos����dis������Դ������dis���ڶ���ʱ�򣬴�ʱ
	 *   ����ԴͻȻ�رտ϶����������ġ�Ҳ���׳���EOFExcepiotn
	 *   
	 *   �ĵã�ֻҪ�ͻ����������˷������ˣ���ô��ζ�ͻ������������֮�������һ���ܵ�
	 *   ���������˾Ϳ��Ի���ͨ���� ��ֻҪ����ܵ��Ͽ���  �����˾͹ر���
	 *   ��ÿһ��ִ���� InputSteam in = Socket.getInputStream����OutputStream out = Socket.getOuputStream,
	 *   ʵ���϶��ǻ���������ܵ�����ڡ�����ܵ�������ֻ��һ����һ��д��
	 *   ��ִ��in.close()����out.close()��ʵ���ǹر�����ܵ����ڹر�֮���ٽ��ж�д������������쳣
	 */
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",1982);
			
			Thread.sleep(3000);
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("hello server");
			dos.close();
//			s.getOutputStream();
//			s.close();
			Thread.sleep(5000);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}