import java.io.FileReader;

public class FileInputWithFileReaderClass {

    // FileInputStream class reads the from network socket , data sources, file types but file reader reads stream of string and chars

    public static void main(String[] args) {

        try{
        FileReader fr = new FileReader("C:/Users/e678332/JavaProgrammingPractice/file2.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }catch (Exception e){
        e.printStackTrace();
        }
    }
}
