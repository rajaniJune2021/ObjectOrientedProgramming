import java.io.FileInputStream;
import java.io.FileWriter;

public class FileOutPutClassWithFileWriter {
    public static void main(String[] args) {

        try{
        FileWriter fw = new FileWriter("C:/Users/e678332/JavaProgrammingPractice/file2.txt");
        fw.write("writing the with file writer class");
        fw.close();

        }catch (Exception e){
            e.printStackTrace();

        }




    }
}
