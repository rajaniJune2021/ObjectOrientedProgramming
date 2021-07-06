package inheritance;

public class RandomClass extends ParentClass{

       public void printParentVariables(){
        System.out.println(super.parentVariable1);}

    public static void main(String[] args) {
        RandomClass rc = new RandomClass();
        rc.printParentVariables();
    }
}
