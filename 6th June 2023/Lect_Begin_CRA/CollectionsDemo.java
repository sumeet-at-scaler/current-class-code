package FairWork.Lect_Begin_CRA;

import java.util.*;

public class CollectionsDemo {
    static class Car implements Comparable<Car> {
        int speed;
        int power;
        String name;
        Car(int speed, int power, String name){
            this.speed = speed;
            this.power = power;
            this.name = name;
        }

        @Override
        public String toString() {
            return "(" + this.name + "-" + this.speed + "-" + this.power + ")";
        }

        @Override
        public int compareTo(Car o) {
            return this.speed - o.speed;
        }
        public static final CarPowerComparator AComparatorOnPower = new CarPowerComparator();
        public static final CarNameComparator AComparatorOnName = new CarNameComparator();

        static class CarPowerComparator implements Comparator<Car> {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.power - o2.power;
            }
        }

        static class CarNameComparator implements  Comparator<Car> {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.name.compareTo(o2.name);
            }
        }
    }



    public static void main(String[] args) {
//        demo1(new HashSet<>());
//        demo1(new LinkedHashSet<>());

//        demo2();
        demo3();
//        demo4();
    }

    private static void demo1(Set<String> set){
        set.add("India");
        set.add("China");
        set.add("US");
        set.add("UK");
        set.add("Canada");
        System.out.println(set);
    }

    private static void demo2(){
        // comparable used because no dedicated class passed for comparison
        PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Car(50, 800, "A"));
        pq.add(new Car(20, 200, "B"));
        pq.add(new Car(70, 600, "C"));
        pq.add(new Car(30, 300, "D"));
        pq.add(new Car(10, 500, "E"));

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }
    }

    private static void demo3(){
//        PriorityQueue<Car> pq = new PriorityQueue<>(new CarPowerComparator());
//        PriorityQueue<Car> pq = new PriorityQueue<>(Car.AComparatorOnName);

        Comparator<Car> obj = new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.speed != o2.speed){
                    return o1.speed - o2.speed;
                } else {
                    return o1.power - o2.power;
                }
            }
        };

        PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder(obj));
        pq.add(new Car(10, 500, "E"));
        pq.add(new Car(20, 200, "B"));
        pq.add(new Car(30, 600, "C"));
        pq.add(new Car(20, 800, "A"));
        pq.add(new Car(30, 300, "D"));

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }
    }

    static void demo4(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);


        System.out.println(set.ceiling(35));
        System.out.println(set.ceiling(40));
        System.out.println(set.floor(35));
        System.out.println(set.floor(30));
        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.headSet(35));
        System.out.println(set.headSet(30));
        System.out.println(set.headSet(30, true));

        System.out.println(set.tailSet(35));
        System.out.println(set.tailSet(40));
        System.out.println(set.tailSet(40, false));

        System.out.println(set.subSet(10, 70));
        System.out.println(set.subSet(10, true, 70, true));
    }
}
