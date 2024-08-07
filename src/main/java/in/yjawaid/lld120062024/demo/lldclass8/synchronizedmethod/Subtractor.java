package in.yjawaid.lld120062024.demo.lldclass8.synchronizedblock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;


    public Subtractor(Count count)
    {

        this.count = count;

    }

    public void run() {
        for (int i = 1; i <= 10000; i++)
        {
            synchronized (count) {

                System.out.println("Subtractor : " + i + " " + Thread.currentThread().getName());
                count.value -= i;
            }

        }
    }
}
