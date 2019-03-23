package watkiThread.ex01watkithread.ex02javazawwatki;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setName("Watk ex2 przyklad  2");
        thread.start();
    }
}
