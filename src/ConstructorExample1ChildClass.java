import constructorTopic.ConstructorExample1;

// super keyword will be always referring to parent class.

public class ConstructorExample1ChildClass extends ConstructorExample1 {

    public ConstructorExample1ChildClass(){
        super(10,"LG");
        System.out.println("this is the child class constructor");

    }

    public static void main(String[] args) {
        ConstructorExample1ChildClass constructorExample1ChildClass = new ConstructorExample1ChildClass();
    }
}
