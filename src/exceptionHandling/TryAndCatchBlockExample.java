package exceptionHandling;


//public void abc() throws Exception{
//
//        try{
//
////actual logic will be written in try block, try execute of piece of code working or not
//
//
//        throw new Exception(); // throw keyword specify an exception explicitly
//        }
//        catch(Exception e){
//
//        catch block will execute when an exception occured
//
//        }
//
//        finally{
//
//        this finally block will be executed even when an exception occured or not
//
//
//        }
//
//        }
//
//        Example:
//
//        Example for finally block in real time. Closing the database connection can be written in the finally block since code will execute irrespective of exception occured or not.
//        So duplicate code can be avoided in try and catch block to close the databse connection.
//    try block should have followed by catch block or finally block otherwise it throw  compile time error.
// printStackTrace() prints the stack of the error error occurred in the system which is captured by system.err variable.

public class TryAndCatchBlockExample {
    public static void main(String[] args) {
        try{
            int i = 5/0;
            System.out.println("i value is:"+i);
            throw new NumberFormatException();
        }

        catch(ArithmeticException ae){
            System.out.println("division by zero is not possible");
        }

        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
          //  System.out.println("exception occured");
        }
        finally {
            System.out.println("Fanally block called.");
        }
    }

}
