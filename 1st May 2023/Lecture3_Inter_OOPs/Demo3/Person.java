package FairWork.Lecture3_Inter_OOPs.Demo3;

public class Person {
    int age;
    String name;

    Person(int age, String name){
        // we can have more logic here
        this.age = age;
        this.name = name;
    }

    Person(int age){
        this(age, null);
    }

    Person(String name){
        this(0, name);
    }

    Person(){
        this(0, null);
    }

    void display(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
