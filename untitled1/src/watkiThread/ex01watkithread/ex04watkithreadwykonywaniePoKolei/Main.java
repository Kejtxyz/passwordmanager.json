package watkiThread.ex01watkithread.ex04watkithreadwykonywaniePoKolei;


import watkiThread.ex01watkithread.ex01watkithread.MyThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executor.newFixedThreadPool(15);
        executorService.execute(new MyThread());// wykonywanie watkow w tym samym mamecie
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());  // uzywasz czy ni to one sa dostepne
        executorService.shutdown(); // zatrrzymanie watkow po wykonaniu

        myThread.join(); // synchornizacja watkow,jeden watek oczekuje,
        System.out.println("Komunikat metody main jest na koncu,po wykonaniu watku");
    }
}
