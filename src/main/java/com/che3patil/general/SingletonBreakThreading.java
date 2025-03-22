package com.che3patil.general;

public class SingletonBreakThreading {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("Instance hashcode: " + singleton.hashCode());

            }
        };

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();

//        thread.join();
//        thread2.join();

    }
}
