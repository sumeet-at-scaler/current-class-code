package FairWork.Lect_Inter_Builder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                    .setName("abc")
                    .setAge(25)
                    .setPSP(100)
                    .setEmail("a@b.com")
                    .setPno("999..")
                    .build();

        System.out.println(st);

        st.setAge(45);
        System.out.println(st);
    }
}
