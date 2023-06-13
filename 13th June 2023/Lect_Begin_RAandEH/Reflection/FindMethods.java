package FairWork.Lect_Begin_RAandEH.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FindMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class pdetails = Class.forName("FairWork.Lect_Begin_RAandEH.Reflection.Person");
        Constructor ctorWith2Params = pdetails.getDeclaredConstructor(int.class, String.class);
        Object p = ctorWith2Params.newInstance(10, "Sumeet");
        System.out.println(p);

        Method sayHelloMethod = pdetails.getDeclaredMethod("sayHello");
        System.out.println(sayHelloMethod.getReturnType().getSimpleName());
        sayHelloMethod.invoke(p);

        Method displayMethod = pdetails.getDeclaredMethod("display");
        displayMethod.setAccessible(true);
        System.out.println(displayMethod.getReturnType().getSimpleName());
        displayMethod.invoke(p);
    }
}
