package com.example.java.concurrency.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ThreadTest {
    public static void main(String[] args) {
        createThreadMethodOne();
        createThreadMethodTwo();
        createThreadMethodThree();
    }

    private static void createThreadMethodOne() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("create thread method one.");
            }
        });
        thread.start();
    }

    private static void createThreadMethodTwo() {
        new ThreadTwo().start();
    }

    private static void createThreadMethodThree() {
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "create thread method three.";
            }
        });
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class ThreadTwo extends Thread {
        @Override
        public void run() {
            System.out.println("create thread method two.");
        }
    }
}
