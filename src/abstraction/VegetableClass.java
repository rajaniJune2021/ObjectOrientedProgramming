package abstraction;

//Abstraction:
//        In generic terms - what to do, not specify how to do
//
//        Rules:
//        1.If a class has at least one abstract method that class has declared as abstract expilicitly
//        2. All the abstract methods of the parent class should be implemented by child classes
//        3. For the methods which we don't want implement in the child class we should have dummy implementation for those methods.(empty methods called as dummy methods)
//        5. abstract methods can not be final
//        6. abstract class will have nt complete implementation all the methods hence can not create object for abstract class.

public abstract class VegetableClass {

    public abstract void abc();
    public abstract void def();

}
