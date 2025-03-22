package com.che3patil.general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakReflection {
    public static void main(String[] args) throws NoSuchMethodException {
        try {

            Singleton instance = Singleton.getInstance();

            Constructor<Singleton> declaredConstructors = Singleton.class.getDeclaredConstructor();
            declaredConstructors.setAccessible(true);

            Singleton singleton2 = declaredConstructors.newInstance();

            System.out.println("Instance 1 hashcode: " + declaredConstructors.hashCode());
            System.out.println("Instance 2 hashcode: " + singleton2.hashCode());

        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }
}
