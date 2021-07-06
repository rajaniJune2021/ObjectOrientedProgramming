package inheritance;

public class StoreClass implements GroceryInterface, StoreInterface {

    //interface can have static methods
    // A Interface without any methods called as marker interface or tagged interface - ex: serialiazable class or cloneable classes Java marker interfaces.


    public void furnitureSection() {

    }

    public void clothesSection() {
        System.out.println("Implementing Store interface Cloths section");
    }

    public void bakerySection() {
        System.out.println("implementing bakery section");
    }

    public void meatSection() {
        System.out.println("implementing meat section");
    }

    public void callInterfaceDefaultMethod(){
        GroceryInterface.super.abc();
    }

    public static void main(String[] args) {
        StoreClass obj = new StoreClass();
        obj.callInterfaceDefaultMethod();
        GroceryInterface.flowerSection();
    }
}
