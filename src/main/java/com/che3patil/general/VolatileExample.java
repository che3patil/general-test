package com.che3patil.general;

public class VolatileExample {

    private  static volatile boolean flag = false;
    public static void main(String[] args) {

        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = true;
                System.out.println("Writer thread updated flag to true");
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag){
                    System.out.println("Reader thread detected flag change!");
                }
            }
        });

        reader.start();
        writer.start();
    }
}
