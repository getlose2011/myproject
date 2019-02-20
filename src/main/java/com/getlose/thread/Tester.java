package com.getlose.thread;

import static java.lang.Thread.sleep;

public class Tester {
    public static void main(String[] args) {

        Thread1();
        customerThread();
        runnable1();
        runnable2();
        mainThread();

        System.out.println("main end");
    }

    private static void runnable2() {
        //runnable v2 => lambda
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("runnable lambda=>"+i);
//                }
//            }
//        }).start();
        //等同上面註解
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("runnable lambda =>"+i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private static void runnable1() {
        //runnable 介面的方法在放到thread
        //v1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("runnable=>"+i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread r = new Thread(runnable);
        r.start();
    }

    private static void Thread1() {
        //匿名執行緒
        Thread thread = new Thread(){
            @Override
            public void run() {
                //super.run();
                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread=>"+i);
                }
            }
        };
        thread.start();
    }

    private static void customerThread() {
        //自訂執行緒
        new MyThread().start();
    }

    private static void mainThread() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

//自訂執行緒
class MyThread extends Thread{
    @Override
    public void run() {
        //
        for (int i = 0; i < 10; i++) {
            System.out.println("my thread=>"+i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}