package wrapperClassConcepts;

//Wrapper class:
//
//
//        1. To achieve 100% java as object oriented programm converting primitive data types(int, byte, char,long, boolean) into objects can be achieved through wrapper class.
//        2. Wrapper classes in java provide the support to convert primitive data types into objects
//        3. We do not need wrapper class for String
//        4. Auto boxing and unboxing.
//
//        Auto- Boxing: converting primitive data type into Wrapper class object.
//        Example: int i=10;
//        Integer j = i;
//        Wrapper class objects use it for serialiazation and de-serialization and in the collection framework

//Unboxing: Converting wrapper class object to primitive data type.
//        Example : Integer k = new Interger(10);
//        int m = k;

// wap wrapper class for all the primitive data types

public class LearningIntegerWrapperClass {

    public static void main(String[] args) {
        System.out.println("auto boxing converting primitive data type to wrapper class object");
        int i =10;
        Integer j = i;
        System.out.println("Wrapper class object integer value"+ i);

        System.out.println("Converting wrapper class object to primitive data type");

        Integer k = 20;
        int m = k; // converting here as primitive data type
        System.out.println("Primitive int value"+ k);

        long p = 2147483649L;
        Long q = p;
        System.out.println("long value cahnged into Object "+ q);

        float r = 2.356f;
        Float s = r;
        System.out.println("float value changed into object "+ s );

        byte b = 8;
        Byte c = b;
        System.out.println("byte value change into Object "+ b);

    }
}
