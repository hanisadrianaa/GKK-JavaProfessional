package lesson11.java_multithreading.assignment.simple_thread_creation;

public class SimpleThread extends Thread {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hello World!");
        });

        thread.start();

        // use thread to have control on when to start, stop
    }
    
}
