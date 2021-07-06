import java.io.BufferedWriter;
import java.io.FileWriter;

public class BuffereWriteExample {

    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("C:/Users/e678332/JavaProgrammingPractice/bufferwriterfile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String s1 = "testing";
        bw.write(s1);
        bw.close();

    }
}
