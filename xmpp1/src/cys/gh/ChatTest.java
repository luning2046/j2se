package cys.gh;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Message;
import java.io.*; 

public class ChatTest { 

    public static void main(String[] args) throws Exception {
          //���´���Ĺ����� ʹ����δ������е�ʱ��ᵯ�������ԶԻ������鿴���ܺͷ��͵���Ϣ
//        XMPPConnection.DEBUG_ENABLED = true; dkf

        XMPPConnection connection = new XMPPConnection("gmail.com");
        connection.connect();
        connection.login("cys1982.6.23@gmail.com", "gh820703");
        Chat chat = connection.getChatManager().createChat("guanhong0703@gmail.com", new MessageListener() {
            public void processMessage(Chat chat, Message message) {
                System.out.println(message.getFrom() + " " +  new java.util.Date().toLocaleString() + "˵:" + message.getBody());
            } 

        });
        BufferedReader cmdIn = new BufferedReader(new InputStreamReader(System.in));
        for(;;) {
          try {
             String cmd = cmdIn.readLine();
             if("!q".equalsIgnoreCase(cmd)) {
                 break;
             }
            chat.sendMessage(cmd);
          }catch(Exception ex) {
          }
        }
        connection.disconnect();
        System.exit(0);
    }
} 


