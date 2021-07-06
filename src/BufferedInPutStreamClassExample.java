import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInPutStreamClassExample {


    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("C:/Users/e678332/JavaProgrammingPractice/file3.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i = 0;
        while((i = bis.read()) != -1){
            System.out.print((char)i);
        }

    }
}
