package inheritance;

public class GrandChildClass extends ChildClass{

    int granChildVariable = 50;

    public void callChildAndParentClass(){
        System.out.println(childint);
        System.out.println(parentFirstName);
        System.out.println(parentVariable2);
        System.out.println(this.granChildVariable);
    }

    public static void main(String[] args) {
        GrandChildClass gObj = new GrandChildClass();
        gObj.callChildAndParentClass();;
    }
}
