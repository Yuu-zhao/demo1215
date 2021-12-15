package com;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.class.getName());
    }
}
