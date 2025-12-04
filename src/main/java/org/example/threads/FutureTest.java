package org.example.threads;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String[] args) {

        Callable<Integer> add = () -> 1+2;
        Callable<Integer> sub = () -> 1-2;
        Callable<Integer> mul = () -> 1*2;

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> addRes =  executor.submit(add);
        Future<Integer> subRes =  executor.submit(sub);
        Future<Integer> mulRes =  executor.submit(mul);

        int sum = 0;
        try {
            sum = addRes.get()+subRes.get()+mulRes.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);
        executor.shutdown();


    }
}
