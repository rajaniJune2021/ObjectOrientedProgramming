package polymorphism;

//polymorphism:(many forms)
//
//        1.This poly morphism applicable for methods
//        2. this is a technique single action can be performed in multiple forms.
//        3. poly morphism is two types
//        compile time poly morphism(overloading) and runtime poly morphism(overriding)
//
//        overloading:
//        When there are multiple methods with same name but different parameters then these methods are set to be overloaded.
//        methods can be overloaded by change in no. of parameters and change in type of parameters
//  realtime example: Banking application(different type of loan - using same method name with different parameters to calculate the interest)
// type of the parameters are different between two methods return type can be different to achieve method overloading.
// method overloading is applicable within  same class

public class OverLoadingConcept {

    public void sumNumbers(int i, int j){
        System.out.println(i+j);
    }

    public void sumNumbers(int k, int l, int m){
        System.out.println(k+l+m);
    }

    public float sumNumbers(int n, float p){
        float q =  (n+p);
        System.out.println(q);
        return  q;

    }

    public static void main(String[] args) {
        OverLoadingConcept obj = new OverLoadingConcept();
        obj.sumNumbers(2,3);
        obj.sumNumbers(3,5,7);
        obj.sumNumbers(5,3.5f);
    }

}
