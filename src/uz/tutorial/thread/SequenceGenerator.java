package uz.tutorial.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {

    AtomicInteger number = new AtomicInteger();

    public int generate(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return number.incrementAndGet();
    }
}
