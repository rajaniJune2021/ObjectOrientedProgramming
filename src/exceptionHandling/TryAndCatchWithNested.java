package exceptionHandling;

public class TryAndCatchWithNested {

    // if piece of code possibility of throwing different set of exceptions such as arithematic, file not found etc.. to capture all exception with readable format we choose to write nested try and catch blocks
    // At any given point of time nested try and catch block has any possibility of error it will execute only one catch block.
    //Compiler will handle the exception with "Throws" keyword but try and catch block exceptions handled by the user
    //"throw" keyword exception will be handled by the user not by the compiler.

    public static void main(String[] args) throws ArithmeticException,NullPointerException {


        try{

            int i = 5/1;
            System.out.println("first try block is executed "+ i);

            try{
              //  int j = 4/0;
                String s = null;
                System.out.println(s.length());
                //System.out.println("second try block executed "+ j);
            }
//            catch (Exception e){
//                e.printStackTrace();
//                System.out.println("nested catch block executed");
//            }
            finally {
                System.out.println("nested finally block called");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Outer catch block executed");
        }
    }



}
