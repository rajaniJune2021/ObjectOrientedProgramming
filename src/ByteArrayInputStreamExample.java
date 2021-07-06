import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) {

        byte[] b ={88,89,90};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int i =0;
        while((i=bis.read()) != -1)
            System.out.println((char)i);

    }
}
