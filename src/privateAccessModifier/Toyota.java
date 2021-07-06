package privateAccessModifier;
import publicAccessModifier.Car;

class Toyota extends Car{

    int toyotaCarNumber = 2;

    public static void main(String[] args) {

        Car  objCar = new Car();
        System.out.println(Car.j);
        objCar.setI(6);
        System.out.println(objCar.getI());
    }
}
