package javaWatkiCwiczneia.watki2threadCw2;

import java.time.LocalDate;
import java.time.LocalTime;

public class MyThread extends Thread{
    public void run() {




        for(int i= 0; i < 3; i++) {
            LocalTime localTime1 = LocalTime.now();
            System.out.println("Czas lokalny" + localTime1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
