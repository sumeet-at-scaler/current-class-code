package FairWork.Lect_Inter_Builder;

public class Student {
    private String name;
    private int age;
    private int psp;
    private String email;
    private String pno;

    public void setName(String name) {
        if(Builder.isNameValid(name) == false){
            throw new IllegalArgumentException("name can't be set to an invalid value");
        }
        
        this.name = name;
    }

    public void setAge(int age) {
        if(Builder.isAgeValid(age) == false){
            throw new IllegalArgumentException("age can't be set to an invalid value");
        }
        this.age = age;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPsp() {
        return psp;
    }

    public String getEmail() {
        return email;
    }

    public String getPno() {
        return pno;
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.email = builder.email;
        this.pno = builder.pno;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private int psp;
        private String email;
        private String pno;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setPSP(int psp){
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPno(String pno){
            this.pno = pno;
            return this;
        }

        private Builder(){
        }

        public Student build(){
            if(isNameValid(this.name) == false){
                throw new IllegalArgumentException("name should be not null, not blank and <= 100 chars long");
            }
            if(isAgeValid(this.age) == false){
                throw new IllegalArgumentException("age should be >= 20 and <= 50");
            }

            // 3 more such validations
            return new Student(this);
        }

        private static boolean isNameValid(String name){
            if(name == null || name.length() == 0 || name.length() > 100){
                return false;
            } else {
                return true;
            }
        }

        private static boolean isAgeValid(int age){
            if(age < 20 || age > 50){
                return false;
            } else {
                return true;
            }
        }
    }
}

// Student
// 1. 5 private dm
// 2. 5 public getters
// 3. private ctor that takes builder and only sets (no validations)
// 4. public static getBuilder to help clients get a builder object
// 5. static inner class called Builder

// Builder
// 1. 5 private dm
// 2. 5 setters that return builder again
// 3. private ctor of Builder
// 4. build = has validations before doing a new Student(this)
