package cys.gh;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Message;
import java.io.*; 

public class ChatTest { 

    public static void main(String[] args) throws Exception {
          //如下代码的功能是 使得这段代码运行的时候会弹出个调试对话框来查看接受和发送的消息
//        XMPPConnection.DEBUG_ENABLED = true; dkf

        XMPPConnection connection = new XMPPConnection("gmail.com");
        connection.connect();
        connection.login("cys1982.6.23@gmail.com", "gh820703");
        Chat chat = connection.getChatManager().createChat("guanhong0703@gmail.com", new MessageListener() {
            public void processMessage(Chat chat, Message message) {
                System.out.println(message.getFrom() + " " +  new java.util.Date().toLocaleString() + "说:" + message.getBody());
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


