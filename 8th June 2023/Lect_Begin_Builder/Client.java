package FairWork.Lect_Begin_Builder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setAge(10)
                .setName("abc")
                .setEmail("a@b.com")
                .setPSP(100)
                .setPhone("999")
                .build();

        



    }
}
