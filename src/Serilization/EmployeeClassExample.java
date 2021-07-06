package Serilization;

import java.io.Serializable;

//internally hibernet will be consumed to retrieve the data de-deserialiaze to map in to json objects.
//        while storing i to from post api call json body will be seriliazed and store into backend db database.
//
//        Serialization: serialiazable interface called a marker interface.(empty interface no methods, no variables)
//        cloneable, remote are also marker interfaces.


public class EmployeeClassExample implements Serializable {

    String empName;
    int empid;
    public EmployeeClassExample(String empName, int empid){
        this.empName = empName;
        this.empid = empid;

    }




}
