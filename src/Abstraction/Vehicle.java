package Abstraction;

public class Vehicle {
    public static void main(String[] args) {
//        Bike b = new Bike();
//        Cycle c = new Cycle();
//        b.Car();
//        c.Car();
        Abstract obj;
        obj=new Bike();
        obj.Car(56478);
        obj=new Cycle();
        obj.Car(832);
    }
}
