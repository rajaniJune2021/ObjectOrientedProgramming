package Serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerilization {

    public static void main(String[] args) throws Exception{
        EmployeeClassExample obj = new EmployeeClassExample("employeeName", 66678);
        FileOutputStream fos = new FileOutputStream("C:/Users/e678332/JavaProgrammingPractice/serialiazefile.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(obj);
        os.flush();
        os.close();
    }
}
