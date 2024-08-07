package in.yjawaid.lld120062024.demo.lldclass9;

import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Consumer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run() {
        while (true) {
            if (this.queue.size() > 0) {
                System.out.println(this.name + " Removing an element to the queue, size: " + this.queue.size());
                queue.remove();
                System.out.println(this.name + " AFTER: Removing an element to the queue, size: " + this.queue.size());
            }
        }
    }
}
