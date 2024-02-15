package Lesson8.GenericClasses.Assignment.GenericQueue;

import java.util.ArrayList;

public class GenericQueue<T> {
    int head = -1, tail = -1;
    ArrayList<T> queue;

    // insert element at head of queue
    void enqueue(T X) {
        if(queue.isEmpty()) { // if queue empty
            head = 0;
            tail = 0;
            queue.add(X);
        } else { // if queue not empty
            head++;
            if(queue.size() > head) {
                queue.set(head, X); // move element at head to next
            } else {
                queue.add(X); // add element into queeue
            }
        }
    }

    // delete element from tail of queue
    void dequeue() {
        if(queue.isEmpty()) { // if queue doesn't has any element
            System.out.print("Queue is empty.");
        } else if(head == tail) { // if queue only has 1 element
            head = tail = -1; // both point to same element
        } else { // if queue has more than 1 element
            tail++;
        }
    }

    // check if queue empty or not
    boolean isEmpty() {
        if(head == -1 && tail == -1) {
            return true;
        } else {
            return false;
        }
    }

    // print queue
    public String printQueue() {
        if (queue.isEmpty()) {
            return "";
        }
        String queue = "";

        for(int i = tail; i < head; i++) {
            queue += String.valueOf(i) + " > ";
        }

        queue += String.valueOf(head);
        return queue;
    }
}
