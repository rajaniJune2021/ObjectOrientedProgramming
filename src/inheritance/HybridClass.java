package inheritance;

public class HybridClass implements ChildInterface1, ChildInterface2{


    public void parentHouse() {
        System.out.println("Parent interface implemented");
    }

    public void childOneRoom() {

    }

    public void childOneToy() {
        System.out.println("child one interface implemented");
    }


    public void ChildTwoKitchen() {
        System.out.println("child two interface implemented");
    }

    public void ChildTwoStudyRoom() {

    }

    public void hybridClassMethod(){
        System.out.println("hybrid class method implementation");
    }
}
