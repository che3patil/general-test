package com.che3patil.general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakClone {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonClone instance = SingletonClone.getInstance();
        SingletonClone clone = (SingletonClone) instance.clone();

        System.out.println("Instance 1 hashcode: " + instance.hashCode());
        System.out.println("Instance 2 hashcode: " + clone.hashCode());


    }
}
