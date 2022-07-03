package com.example.java.concurrency.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest3 {
    public static void main(String[] args) {
        System.out.println("start time: " + System.currentTimeMillis());
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        Runnable delayTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("delayTask current time: " + System.currentTimeMillis());
            }
        };
        // 延时5秒执行该任务
        scheduledExecutorService.schedule(delayTask, 5, TimeUnit.SECONDS);

        Runnable periodTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("periodTask current time: " + System.currentTimeMillis());
            }
        };
        // 延时10秒后开始以1秒为周期重复执行任务
        scheduledExecutorService.scheduleAtFixedRate(periodTask, 10, 1, TimeUnit.SECONDS);
    }
}
