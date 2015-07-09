package cys.gh.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_2_Client {

	/**
	 * 此程序会造成服务器端执行到dis.readUTF()时
	 *   抛出java.io.EOFException  原因是执行了
	 *   dos.close()方法，也就是说对于服务器端的输入流dis
	 *   来说dos就是dis的数据源，而在dis还在读的时候，此时
	 *   数据源突然关闭肯定会产生问题的。也就抛出了EOFExcepiotn
	 *   
	 *   心得：只要客户端连接上了服务器端，那么意味客户端与服务器端之间就有了一个管道
	 *   这样，两端就可以互相通信了 ，只要这个管道断开了  则两端就关闭了
	 *   在每一端执行了 InputSteam in = Socket.getInputStream还是OutputStream out = Socket.getOuputStream,
	 *   实际上都是获得了这条管道的入口。这个管道的两端只能一个读一个写。
	 *   当执行in.close()或者out.close()其实都是关闭这个管道。在关闭之后再进行读写操作都会产生异常
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