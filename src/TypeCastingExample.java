public class TypeCastingExample {

    //   Type casting - changing one data type to another data type.
    //1. widening type casting called automatic type conversion(converting lower range int variable to long variable) 2. narrowing type casting.(converting long variable to int variable)

    public static void main(String[] args) {
        int i = 2;
        double d  = i;

        double d2 = 1234567.56788888;
        int j = (int)d2;

        System.out.println("widening type casting  "+ d);
        System.out.println("narrowing type casting  "+ j);


        System.out.println("----------------------------");

        char c ='d';
        int k = c;
        System.out.println("char to int type casting    "+ k);

        System.out.println("----------------------------");

        int L = 120;
        char m = (char)L;

        System.out.println("narrowing type casting from int to char     "+ m);

        System.out.println("----------------------------");

        Integer n = 100;
        String s = Integer.toString(n);

        System.out.println("integer to String " + s);

        String s1 = "120";
        int n1 = Integer.parseInt("printing this int value with Parse int  method  " +s1);
        int n2 = Integer.valueOf("printing this int value with value of method  "+ s1);

        System.out.println("String to integer  "+ n1);



    }

}
