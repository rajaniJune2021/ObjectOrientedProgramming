import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStreamClassExample {

    public static void main(String[] args) {
      try{
        FileInputStream fis = new FileInputStream("C:/Users/e678332/JavaProgrammingPractice/file.txt");
       int i = 0;
       while((i=fis.read())!=-1)
          System.out.print((char)i);
        fis.close();
    }catch (Exception e){

      e.printStackTrace();}
    }
}
