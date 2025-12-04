package org.example.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class VirtualThreadsTest {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside VirtualThreadsTest");
            }
        };

        //1 way
        Thread virtualThread = Thread.startVirtualThread(r);
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            virtualThread.interrupt();
        }

       //2nd way to create the thread
        Executor executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.execute(() ->
            System.out.println("Inside VirtualThreadsTest using executor")
        );

        //thread builder
        Thread thread = Thread.ofVirtual()
                .name("virtual thread using builder")
                .unstarted(
                        () -> System.out.println("Inside VirtualThreadsTest using builder unstarted")
                );
        thread.start();

        Thread thread1 = Thread.ofVirtual()
                .name("virtual thread using builder")
                .start(
                        () -> System.out.println("Inside VirtualThreadsTest using builder start")
                );
    }
}
