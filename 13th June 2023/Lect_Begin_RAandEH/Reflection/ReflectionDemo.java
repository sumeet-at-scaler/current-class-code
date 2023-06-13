package FairWork.Lect_Begin_RAandEH.Reflection;

import java.lang.reflect.Constructor;

public class ReflectionDemo {
    public static void main(String[] args) {
        String s = "hello"; // String is the class and s is an object of String class
        System.out.println(s.length());
        System.out.println(s.charAt(0));

        try {
            Class detailsOfString = Class.forName("java.lang.String");
            System.out.println(detailsOfString);

            System.out.println(detailsOfString.getDeclaredConstructors().length);
            System.out.println(detailsOfString.getDeclaredFields().length);
            System.out.println(detailsOfString.getDeclaredMethods().length);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
