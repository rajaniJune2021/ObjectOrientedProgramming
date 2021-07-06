package abstraction;

public class ClassB extends ClassA {


    public void sumMethodA() {
        System.out.println("implementing the MethodAClass");
    }

    public void multiPlicationMethodA(){}

    public static void main(String[] args) {
        ClassA obj = new ClassB();
        obj.multiPlicationMethodA();
        obj.sumMethodA();
        obj.substraction();
    }
}
