package polymorphism;

// method overriding is for parent class and child class
//  method should have same method name, same return type and same no.of parameters and same type of parameters.
// private methods can not be override
// static methods cannot be override since static methods are class members can not access through objects.
// final methods cannot be override


public class OverRidingConceptParentClass {
    public int k;
     public void multiplication(int j, int p){
        System.out.println(j*p);
    }

    private void abc(){
        System.out.println("parent class abc method called");
    }

    public static void pqr(){
        System.out.println("parent class pqr class method called from overriding concept parent class");
    }

}
