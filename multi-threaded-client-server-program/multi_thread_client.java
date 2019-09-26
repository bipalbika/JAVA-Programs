import java.net.*;
import java.io.*;
class multi_thread_client{
  private static String servermsg;

  public static void main(String[] args) throws Exception{
    Socket s=new Socket("localhost",8000);
    DataInputStream dis=new DataInputStream(s.getInputStream());
    DataOutputStream dos=new DataOutputStream(s.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String clientmsg="hi";
    while(!clientmsg.equals("bye")){

      servermsg=br.readLine();
      dos.writeUTF(servermsg);
      dos.flush();
      clientmsg=dis.readUTF();
      System.out.println("From Server:"+clientmsg);
    }
    dis.close();
    dos.close();
    s.close();
  }
}
