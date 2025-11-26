package org.example.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest {

    void main(){
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();


    }


}

class Producer extends Thread {
    private BlockingQueue<String> queue;
    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                queue.put(String.valueOf(i+1));
                IO.println("Producer put "+(i+1)+ " times");
            } catch (InterruptedException e) {
                IO.println("Exception :"+e.getMessage());
            }
        }
        try {
            queue.put("end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Consumer extends Thread {
    private BlockingQueue<String> queue;
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                IO.println("Consumer take "+queue.take());
            } catch (InterruptedException e) {
                IO.println("Exception :"+e.getMessage());
            }
            try {
                if(queue.take().equals("end")){
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
