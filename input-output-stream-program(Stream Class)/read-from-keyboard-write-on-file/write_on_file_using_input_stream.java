import java.io.*;
class write_on_file_using_input_stream {
  public static void main(String[] args) throws IOException {
    DataInputStream dis=new DataInputStream(System.in);
    FileOutputStream fout=new FileOutputStream("myfile.txt");
    //BufferedOutputStream bout=new BufferedOutputStream(fout);
    System.out.println("Enter O to Quit");
    char ch;
    while((ch=(char)dis.read())!='O'){
      fout.write(ch);
    }
    fout.close();
  }
}
