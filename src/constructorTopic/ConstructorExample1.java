package constructorTopic;

//Constructor:
//        Is a block or method to initialize methods or objects
//        constructor is called when object of class is created. Constructor set the default values for variables.
//
//        Rules for defining constructor:
//        1. Constructor name should be same as class name.
//        2. Constructor should not a return type not even void.
//        3. Constructor cannot be marked as static,final.
//        4. Constructor can use the access modifiers like public protected private and default
//        5. default constructor will be created by compiler
//        6. we can overload constructor but we can not override constructor
// during class obj creation time after new keyword - it called constructor.
// parameterized constructor - initialization of variable values can be dynamically pass through parameterized constructor.
// constructor can be overloaded  -
// this keyword refer to current class variable to differentiate b/w the method variable or else constructor variables.

public class ConstructorExample1 {

    public ConstructorExample1(){
        tvCount = 10;                  // instead of default values assigning the values
        tvnNme ="samsung";
        System.out.println("this is the parent class constructor");
    }

    int tvCount;
    String tvnNme;
    String tvColor;

    public ConstructorExample1(int tvCount,String tvnNme){
        this.tvCount=tvCount;
        this.tvnNme=tvnNme;
        System.out.println("parent class parameterized constructor invoked");
    }

    public ConstructorExample1(String tvName, String tvColor){
        this.tvnNme = tvName;
        this.tvColor = tvColor;
    }


    public static void main(String[] args) {
        ConstructorExample1 obj = new ConstructorExample1();
        System.out.println(obj.tvCount);
        System.out.println(obj.tvnNme);
        ConstructorExample1 obj1 = new ConstructorExample1(10,"LG");
        System.out.println(obj1.tvnNme);
        System.out.println(obj1.tvCount);
    }
}
