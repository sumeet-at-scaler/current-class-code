package FairWork.Lect_Begin_Streams.DemoOnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapAndFilterDemo {
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
        List<Integer> list = Arrays.asList(2, 5, 12, 44, 43, 85, 17, 7, 24);

        // give only even numbers to me
        List<Integer> res = new ArrayList<>();
        for(int val: list){
            if(val % 2 == 0){
                res.add(val);
            }
        }
        System.out.println(res);

        // give only even numbers to me -> filter method of stream
        System.out.println(list.stream().filter(x -> x % 2 == 0).toList());

        // list converted to stream
        // stream will loop over the elements in list
        // pass every element to filter
        // filter will pass every element to lambda
        // lambda will return true or false for the element
        // if filter gets a true from lambda, it will include the element in results
        // if filter gets a false from lambda, it will reject the element


        List<Car> cars = Arrays.asList(
                new Car(100, 500, "ABC"),
                new Car(2100, 7870, "DeF"),
                new Car(1550, 60, "ghi"),
                new Car(70, 5000, "jkl"),
                new Car(7800, 8000, "mno")
        );
        // i want cars for which speed is > 1000
        System.out.println(cars.stream().filter(c -> c.speed > 1000).toList());


        List<Integer> prices = cars.stream().map(c -> c.price).toList();
        System.out.println(prices);

        System.out.println(cars.stream().filter(c -> c.price > 1000).toList()); // 3 cars
        System.out.println(cars.stream().map(c -> c.price > 1000).toList()); // 5 booleans
    }
}
