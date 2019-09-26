import java.net.*;
import java.io.*;
class ServerTCP{
  public static void main(String[] args) throws Exception{
  ServerSocket ss=new ServerSocket(9000);
  Socket s =ss.accept();
  System.out.println("Connection Established");
  OutputStream os=s.getOutputStream();
  PrintStream ps=new PrintStream(os);
  String str="Hello Client";
  ps.println(str);
  ps.println("bye");
  ps.close();
  ss.close();
  s.close();
  }
}
