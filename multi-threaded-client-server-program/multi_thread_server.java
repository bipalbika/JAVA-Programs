import java.io.*;
import java.net.*;


class ServerClientThread extends Thread{
  Socket sc;
  int client_no;
  ServerClientThread(Socket c,int count){
    sc=c;
    client_no=count;
  }
  public void run(){
    try{
    DataInputStream dis=new DataInputStream(sc.getInputStream());
    DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String clientmsg,servermsg;
    clientmsg="hi";
    while(!clientmsg.equals("bye")){
      clientmsg=dis.readUTF();
      System.out.println("From Client:"+clientmsg);
      servermsg=br.readLine();
      dos.writeUTF(servermsg);
      dos.flush();
    }
    dis.close();
    dos.close();
    sc.close();
    }catch(Exception e){System.out.println(e);}
  }
  }
public class multi_thread_server{
  public static void main(String[] args){
    try{
    ServerSocket ss=new ServerSocket(8000);
    int counter=0;
    System.out.println("Server Started");
    while(true){
      counter ++;
      Socket client=ss.accept();
      System.out.println(">>"+"Client no:"+counter+"Started");
      ServerClientThread set=new ServerClientThread(client,counter);
      set.start();
    }
   
   }catch(Exception e){System.out.println(e);}
 
 }
}
