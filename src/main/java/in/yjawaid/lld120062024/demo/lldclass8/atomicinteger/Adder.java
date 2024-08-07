package in.yjawaid.lld120062024.demo.lldclass8.synchronizedmethod;

public class Adder implements Runnable {
    private Count count;


    public Adder(Count count ) {

        this.count = count;

    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {


                System.out.println("Adder : " + i + " " + Thread.currentThread().getName());
                count.increamentValue(i);




        }
    }
}
