package inheritance;

public class ChildClass extends ParentClass{
    int childint =30;
    public void callParentVariables(){
        System.out.println(super.parentVariable1);
        System.out.println(super.parentVariable2);
        System.out.println(parentFirstName);
        System.out.println(this.childint); //current class variables can be called with 'this' keyword
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.callParentVariables();
    }
}
