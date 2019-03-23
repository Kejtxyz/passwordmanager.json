package watkiThread.ex01watkithread.ex05threadwatkiJavaIncrementacjaZmiennychAtom;

import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = ExecutorService.newFixedThreadPool(10);
        executorService.execute(new MyThread());
        System.out.println(Data.counter);

        /// najpierw wyswietlil komunikat,a dopiero pozniej wyswietlil watek
        // wyscig sazczorw,kto pierwszy ten lepszy


        // synchornizacja dzialania watkow
        // w sordowkisu wielowatkowym nie ma problemow z wyscigiem szczrow, i wielowatkowosci
        // zatrzymanie service shotdown

    }
}
