package watkiThread.ex01watkithread.ex05threadwatkiJavaIncrementacjaZmiennychAtom;

public class MyThread extends Thread {

    @Override // taki beszpiecnzik
    public void run(){


        for (int i = 0; i <100; i++){
            Date.counter.addAndGet(1);



        Data.counter++;
    }
}
