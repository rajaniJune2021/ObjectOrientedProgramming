package inheritance;

public class NestedClassOfNestedinterface implements NestedInterface.childInterface{


    public void childMethodOfNestedInterface() {
        System.out.println("calling nested interface method");
    }

    public static void main(String[] args) {
        NestedClassOfNestedinterface obj = new NestedClassOfNestedinterface();
        obj.childMethodOfNestedInterface();
    }
}
