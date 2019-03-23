package watkiThread.ex01watkithread.ex01watkithread;

public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread(); // utworzeniue instancji watku
                                                //
        new MyThread().start();
        System.out.println("Komunikat z metody main");

        // zalezy od procesora i jego obciazenia,w jakiej kolejsnosci sie wykona,
        // ikominukat moze sie wykonac po albo przed,niezaleznie od nas tylko od procesora.

    }
}