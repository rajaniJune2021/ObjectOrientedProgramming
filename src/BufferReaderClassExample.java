import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderClassExample {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:/Users/e678332/JavaProgrammingPractice/bufferwriterfile.txt");
        BufferedReader br = new BufferedReader(fr);
        int i =0;
        while((i=br.read() )!= -1)
            System.out.print((char)i);

    }
}