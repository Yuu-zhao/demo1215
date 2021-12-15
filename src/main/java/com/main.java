package com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {

    private static Executor executors = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        String nextLine1 = scanner.nextLine();

        int num = Integer.parseInt(nextLine);
        final String[] s = nextLine1.split(" ");

        System.out.println(getNum(num, s));

    }


    private static int getNum(int num, String[] strings) {

        return (Math.min(num, strings.length) / 2) + 1;
    }

}
