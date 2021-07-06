package polymorphism;

// this keyword is referred current class variable, method, invoke current class constructor, return current class instance.

public class OverRidingChildClass extends OverRidingConceptParentClass {

    public void multiplication(int m, int k){
        System.out.println(super.k*this.k);
        System.out.println(m*k);
    }
    public void callParentClassMethod(){
        super.multiplication(6,7);
    }

    private void abc(){
        System.out.println("child method abc called");
        this.multiplication(5,4);
    }

    public static void pqr(){
        System.out.println("child class pqr class method called from overriding concept child class");
    }

    public static void main(String[] args) {
        OverRidingChildClass obj = new OverRidingChildClass();
        obj.multiplication(3,5);
        obj.callParentClassMethod();

    }
}
