package FairWork.Lecture3_Inter_OOPs.Demo2;




public class Client {
    public static void main(String[] args) {
//        Person p = new Person(); // default ctor is not provided by Java if we write a ctor ourself
        Person p = new Person(10, "ABC");
        p.display();

    }
}
