package privateAccessModifier;

public class Tea extends Coffee {

    public static void main(String[] args) {
        Tea obj = new Tea();
        obj.callParentClassPrivateMethod("Rajani");
    }
}
