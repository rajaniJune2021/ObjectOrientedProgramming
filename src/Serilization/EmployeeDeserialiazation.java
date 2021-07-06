package Serilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialiazation {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/e678332/JavaProgrammingPractice/serialiazefile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        EmployeeClassExample obj = (EmployeeClassExample)ois.readObject();
        System.out.println(obj.empName+" "+ obj.empid);
    }
}
