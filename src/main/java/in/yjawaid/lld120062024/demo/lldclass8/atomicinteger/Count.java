package in.yjawaid.lld120062024.demo.lldclass8.synchronizedmethod;

public class Count  {
    int value = 0;

    public synchronized void increamentValue(int value) {
        this.value += value;
    }

    public int getValue() {
        return this.value;
    }
}
