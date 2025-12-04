package org.example.threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
                    System.out.println("Running task...");
                    return 42;
                }).thenApply(result -> result * 2)
                .thenAccept(finalResult -> System.out.println("Final result: " + finalResult));

        try { Thread.sleep(1000); } catch (Exception e) {}


    }
}
