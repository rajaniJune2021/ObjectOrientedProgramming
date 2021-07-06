package publicAccessModifier;

public class Car {
    private int i=10;
    protected static int j=1;
    static int k= 3;
    public void sum(){
        int sum = 4+5;
    }
    public static void main(String[] args) {
        int maruthiCarNumber =1;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
