package FairWork.Lect_Begin_RAandEH.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FindConstructors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class pdetails = Class.forName("FairWork.Lect_Begin_RAandEH.Reflection.Person");
        Constructor[] ctors = pdetails.getDeclaredConstructors();
        for(Constructor ctor: ctors){
            System.out.println(ctor.getParameterCount());
        }

        Constructor ctorWith2Params = pdetails.getDeclaredConstructor(int.class, String.class);
        Object p = ctorWith2Params.newInstance(10, "Sumeet");
        System.out.println(p);
    }
}
