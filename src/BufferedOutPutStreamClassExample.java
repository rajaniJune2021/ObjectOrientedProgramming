import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutPutStreamClassExample {

//    BufferedOutPutStream :internally uses to store the data and this data passes to an output stream
//
//    Buffer is a storage of primitive types of data.
//
//    Buffered output stream execution is faster than fileOutputStream execution.
    // moving data to buffer to stream (nextwork, database obj, filetypes)

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("C:/Users/e678332/JavaProgrammingPractice/file3.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = "rajani";
        byte[] b = s.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
    }


}
