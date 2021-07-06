package inheritance;

public interface GroceryInterface {

    //default methods can not be added in class.

     void meatSection();
     void bakerySection();
    default void abc(){
        System.out.println("interface default methods");
    }
    static void flowerSection(){
        System.out.println("Flower section of Grocery Interface method called");
    }
}
