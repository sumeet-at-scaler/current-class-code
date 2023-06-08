package FairWork.Lect_Begin_Builder;

public class Student {
    private int age;
    private int psp;
    private String name;
    private String email;
    private String pno;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(Builder.isAgeValid(age) == false){
            throw new IllegalArgumentException("age should be between 0 and 120");
        }
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPno() {
        return pno;
    }

    private Student(Builder bldr){
        this.age = bldr.age;
        this.psp = bldr.psp;
        this.name = bldr.name;
        this.email = bldr.email;
        this.pno = bldr.pno;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int age;
        private int psp;
        private String name;
        private String email;
        private String pno;

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setPSP(int psp){
            this.psp = psp;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPhone(String pno){
            this.pno = pno;
            return this;
        }

        public Student build(){
            if(isAgeValid(age) == false){
                throw new IllegalArgumentException("age should be between 0 and 120");
            }
            if(isPSPValid(psp) == false){
                throw new IllegalArgumentException("psp should be between 0 and 100");
            }
            if(isNameValid(name) == false){
                throw new IllegalArgumentException("name should not be null or empty");
            }

            // 2 more validations
            return new Student(this);
        }

        private static boolean isAgeValid(int age){
            if(age < 0 || age > 120){
                return false;
            }
            return true;
        }

        private static boolean isPSPValid(int psp){
            if(psp < 0 || psp > 100){
                return false;
            }
            return true;
        }

        private static boolean isNameValid(String name){
            if(name == null || name.length() == 0){
                return false;
            }
            return true;
        }


    }

}
