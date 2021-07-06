package inheritance;

public interface ParentInterface {

    // Default methods(some standard logic) in interfaces in Java 8 version it allowed
    //default methods called as defender methods.

    public void parentHouse();

    default void defaultMethod(){

    }

}
