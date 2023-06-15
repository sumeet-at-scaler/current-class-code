package FairWork.Lect_Begin_Streams.Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarsSortedViaLambdas {
    static class Car {
        int speed;
        int price;
        String brand;
        Car(int speed, int price, String brand){
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "[Speed=" + this.speed + ", Price=" + this.price + ", Name=" + this.brand + "]\n";
        }
    }


    public static void main(String[] args) {
        Car c1 = new Car(100, 1000, "A");
        Car c2 = new Car(200, 2000, "B");
        Car c3 = new Car(300, 3000, "C");
        Car c4 = new Car(400, 4000, "D");
        Car c5 = new Car(500, 5000, "E");

        List<Car> list = Arrays.asList(c2, c3, c5, c4, c1);
//        System.out.println(list);

        Comparator<Car> speedComparator = (car1, car2) -> car1.speed - car2.speed;
        Collections.sort(list, speedComparator);

//        System.out.println(list);

        Collections.sort(list, (car1, car2) -> car2.price - car1.price);
        System.out.println(list);
    }

}
