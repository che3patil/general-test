package com.che3patil.general;

public class VolatileAtomicityExample {
private static int count = 0;
    public static void main(String[] args) throws InterruptedException {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    count++;
//                    System.out.println("Final Count: " + count);

                }
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();


        System.out.println("Final Count: " + count);
    }
}
