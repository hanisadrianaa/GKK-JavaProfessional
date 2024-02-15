package Lesson8.GenericClasses.Assignment.GenericQueue;

public class TestGenericQueue {
    public static void main(String[] args) {
        // object in integer type
        GenericQueue<Integer> queue1 = new GenericQueue<>();
        // insert element into queue
        queue1.enqueue(200);
        queue1.enqueue(400);
        queue1.enqueue(150);
        
        // print queue after enqueue()
        System.out.print("queue1 after enqueue() elements: " + queue1 + "\n");

        // remove element from queue
        queue1.dequeue();
        System.out.print("queue1 after dequeue(): " + queue1 + "\n");


    }
}
