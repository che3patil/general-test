package com.che3patil.general;

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
/*Singleton can be broken using:
Reflection
Cloning
Serialization
Multi-threading*/