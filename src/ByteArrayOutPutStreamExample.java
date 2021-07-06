import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutPutStreamExample {

//    ByteArrayOutPutStreamClass - It is used to write same data into multiple files

    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("C:/Users/e678332/JavaProgrammingPractice/bytearrayfile.txt");
        FileOutputStream fos1 = new FileOutputStream("C:/Users/e678332/JavaProgrammingPractice/bytearrayfile2.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String s = "byteArrayStream";
        byte[] b = s.getBytes();
        baos.write(b);
        baos.writeTo(fos);
        baos.writeTo(fos1);
        baos.flush();
        baos.close();

    }
}
