package lesson11.java_multithreading.assignment.deadlock_detection;

public class DeadlockDetection {

    public static void main(String[] args) {
        final String resource1 = "hello world";
        final String resource2 = "world hello";

        // deadlock
        Thread threadX = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread X: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource2) {
                        System.out.println("Thread X: locked resource 2");
                    }
                }
            }
        };

        Thread threadY = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread Y: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread Y: locked resource 1");
                    }
                }
            }
        };

        // solve deadlock
        Runnable r1 = new Runnable() {
            public void run() {
                synchronized (resource2) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("In block 1");
                    }
                }
            }
        };

        Runnable r2 = new Runnable() {
            public void run() {
                synchronized (resource2) {
                    synchronized (resource1) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        threadX.start();
        threadY.start();

        new DeadlockDetection().solveDeadlock(r1, r2);
    }

    private void solveDeadlock(Runnable r1, Runnable r2) {
        new Thread(r1).start();
        new Thread(r2).start();
    }

}
