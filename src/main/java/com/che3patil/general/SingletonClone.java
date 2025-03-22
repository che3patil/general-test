package com.che3patil.general;

public class SingletonClone implements Cloneable{

    private static SingletonClone instance = new SingletonClone();

    private SingletonClone() {}

    public static SingletonClone getInstance() {
        return instance;
    }
//    @Override
//    public SingletonClone clone() throws CloneNotSupportedException {
//            return (SingletonClone) super.clone();
//
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }

}
