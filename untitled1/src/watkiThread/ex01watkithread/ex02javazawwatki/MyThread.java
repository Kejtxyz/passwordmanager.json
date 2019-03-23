package watkiThread.ex01watkithread.ex02javazawwatki;

public class MyThread implements Runnable {
    // implementacja interface

    public void run() {   // wywolaj watek
        for (int i = 0; i < 10; i++) {
            System.out.println("Licznik" + i);
            Thread.sleep(1000); // uspi watek
            try {
                Thread.sleep();
            } catch (InterruptedException e) {
                System.out.println("Watek zostal zatrzymany");
                break;
            }
        }
    }
}