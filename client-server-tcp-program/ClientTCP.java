import java.net.*;
import java.io.*;
class ClientTCP{
  public static void main(String[] args) throws Exception {
    Socket s=new Socket("localhost",9000);
    DataInputStream is=new DataInputStream(s.getInputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(is));
    String str;
    while ((str=br.readLine())!=null) {
      System.out.println("From Server:"+str);
    }
    br.close();
    s.close();
  }
}
