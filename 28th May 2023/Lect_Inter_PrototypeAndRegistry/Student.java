package FairWork.Lect_Inter_PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(){
    }

    public Student(Student orig){
        this.age = orig.age;
        this.name = orig.name;
    }


    @Override
    public Student clone() {
        return new Student(this);
    }
}
