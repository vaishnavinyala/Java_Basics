package Array;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        System.out.println(cars);
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println(cars.get(0));
        cars.add("Ford");
        System.out.println(cars);
        cars.set(1,"BMW");
        System.out.println(cars);
        cars.remove("Volvo");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.size();
        System.out.println(cars);

    }
}
