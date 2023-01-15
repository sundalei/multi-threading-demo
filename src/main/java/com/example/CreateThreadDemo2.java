package com.example;

/**
 * Create threads by extending Thread class.
 */
public class CreateThreadDemo2 {
    
    public static void main(String[] args) {
        Thread t = new DemoThread();
        t.start();
    }
}

class DemoThread extends Thread {

    @Override
    public void run() {
        System.out.println("In demo thread");
    }
}
