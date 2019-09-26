import java.io.*;
class read_file_write_on_console_using_stream {
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("myfile.txt");
    //FileOutputStream fout=new FileOutputStream("myfile.txt");
    //BufferedOutputStream bout=new BufferedOutputStream(fout);
    //System.out.println("Enter O to Quit");
    int ch;
    while((ch=fis.read())!=-1){
      System.out.print((char)ch);
    }
    fis.close();
  }
}
