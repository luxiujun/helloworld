package com.test;

public class Test {
    public static void main(String[] args) {

       new Thread(new Runnable() {

           @Override
           public void run() {
                System.out.println("1111111");
                System.out.println(Thread.currentThread().getName());
           }
       }).start();

       new Thread(new Runnable() {

           @Override
           public void run() {
               System.out.println("2222222");
               System.out.println(Thread.currentThread().getName());
           }
       }).start();


    }

}
