package com.che3patil.general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

enum SingletonEnum {
    INSTANCE,INSTANCE2
}

public class SingletonEnumTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Hence enum object can not be cloned/duplicate
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        Constructor<? extends SingletonEnum> declaredConstructor = singletonEnum.getClass().getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        SingletonEnum singletonEnum1 = declaredConstructor.newInstance();
        System.out.println("Instance 1 hashcode: " + singletonEnum.hashCode());
        System.out.println("Instance 2 hashcode: " + singletonEnum1.hashCode());

    }

}
