package privateAccessModifier;

public class Coffee {

    private  void mocha(String m){

        System.out.println(m);
    }

    public void callParentClassPrivateMethod(String m){
        mocha(m);
    }

}
