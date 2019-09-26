import java.io.*;
class read_file_write_file {
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("myfile.txt");
    FileOutputStream fos=new FileOutputStream("myfile2.txt");
    int ch;
    while((ch=fis.read())!=-1){
    fos.write(ch);
    }
    fis.close();
    fos.close();
  }
}
