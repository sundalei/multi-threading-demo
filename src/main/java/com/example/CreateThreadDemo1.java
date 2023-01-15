package com.example;

/**
 * Create threads by implementing Runnable interface
 */
public class CreateThreadDemo1 {
    
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("In thread.");
            }
        });

        t.start();
    }
}
