import java.util.Scanner;

import java.util.Scanner;
public class CodeNow {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Run"));

        thread.start();
        System.out.println(Thread.currentThread().getName());
        class NewThread extends Thread {
            @Override
            public void run(){
                System.out.println("Run"+Thread.currentThread().getName());
            }
        }
        Thread thread2 = new NewThread();
        thread2.start();

    }
}