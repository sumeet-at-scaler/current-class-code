package FairWork.Lect_Begin_RAandEH.Reflection;

public class Person {
    private int age;
    private String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    Person(){

    }

    void sayHello(){
        System.out.println(name + "[" + age + "] says hello");
    }

    private void display(){
        System.out.println(name + " is my name");
    }

}
