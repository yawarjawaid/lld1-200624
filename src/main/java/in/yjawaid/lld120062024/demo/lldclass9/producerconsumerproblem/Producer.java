package in.yjawaid.lld120062024.demo.lldclass9;

import java.util.Queue;

public class Producer implements Runnable{

    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Producer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run() {
        while (true) {
            if (this.queue.size() < maxSize) {
                System.out.println(this.name + " Adding an element to the queue, size: " + this.queue.size());
                // pre-empted, context switch happened
                queue.add(new Object());
                System.out.println(this.name + " AFTER: Adding an element to the queue, size: " + this.queue.size());
            }
        }
    }
}
