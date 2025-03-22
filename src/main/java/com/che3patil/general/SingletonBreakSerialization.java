package com.che3patil.general;

import java.io.*;

class SingletonSerializable implements Serializable {

    private static SingletonSerializable instance = new SingletonSerializable();

    private SingletonSerializable() {}

    public static SingletonSerializable getInstance() {
        return instance;
    }
}
public class SingletonBreakSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerializable instance = SingletonSerializable.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Singleton.ser"));
        objectOutputStream.writeObject(instance);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Singleton.ser"));
        SingletonSerializable singletonSerializable = (SingletonSerializable) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Instance 1 hashcode: " + instance.hashCode());
        System.out.println("Instance 2 hashcode: " + singletonSerializable.hashCode());

    }
}
