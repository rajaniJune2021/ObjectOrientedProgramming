public class TernaryOperatorExample1 {

//    Ternary Operator
//    usage of break and continue
//    Wrapper Classes
//    Exception Handling
//    I/O handling
//   Type casting - changing one data type to another data type.
    //1. widening type casting(converting lower range int variable to long variable) 2. narrowing type casting.(converting long variable to int variable)


    //ternary operator if condition is true, execute first value else execute second piece line after colon. method name can also place it condition to execute with the ternary operator.


    public static void main(String[] args) {
        int x= 90;
//        if(x<100){
//            y=10;
//            System.out.println(y);
//        }else{
//            System.out.println("x is not below 100");
//        }

        int y = (x<100)?10:-1;
        System.out.println("y value is:"+y);

    }

}
