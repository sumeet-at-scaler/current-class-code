package FairWork.Lecture3_Inter_OOPs.Demo2;

public class Person {
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
