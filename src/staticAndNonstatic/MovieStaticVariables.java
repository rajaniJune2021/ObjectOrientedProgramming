package staticAndNonstatic;

//Statis and non static membrs:
//
//static variables or methods gets memory allocated during class load no matter what line of code it is. Since this memory allocation happen at the class cload time so this static variables and methods are referred by the class name.
// non static variables get memory allocated at the run time.
// For non static methods resides in the same calss must have allocate memory through an class object
// Static key is applicable for methods, variables and nested class.
// Since static variable and method allocation happen at during class loader time and will store JVM during class loader time so all methods and variables ca not be static as it will take time load the class and there will be delay in executing the program.
// class can not be static since class loader will load first and static (stack) memory allocated later after class loader.
// nested class can be static

public  class MovieStaticVariables {
    static class NestedClass{
        public static void abc(){
            System.out.println("nested class abc method");
        }
    }

    public static int seatsCount =100;

    public static void  multiplexTheaterScreen(){
        System.out.println("Movie class static method is called");
    }

    public void regularScreen(){
        System.out.println("Movie class non static method called");
    }

    public static void main(String[] args) {
        System.out.println(MovieStaticVariables.seatsCount);
        multiplexTheaterScreen();
        MovieStaticVariables obj = new MovieStaticVariables();
        obj.regularScreen();
        NestedClass.abc();

    }
}
