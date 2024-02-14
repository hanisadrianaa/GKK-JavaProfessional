package Lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListManipulator {
    private ArrayList<Integer> arrayList;

    // Constructor to initialize the ArrayList
    public ArrayListManipulator() {
        arrayList = new ArrayList<>();
    }

    // Method to add an element to the ArrayList
    public void addElement(int i) {
        arrayList.add(i);
    }

    // Method to remove an element by Index from the ArrayList
    public void removeElementByValue(int element) {
        arrayList.remove(Integer.valueOf(element));
    }

    // Method to remove an element by Index from the ArrayList
    public void removeElementByIndex(int element) {
        arrayList.remove(element);
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    // Method to search for an element in the ArrayList and return its index
    // If the element is not found, return -1
    public int searchElement(int element) {
        return arrayList.indexOf(element);
    }

    // Method to sort the ArrayList in ascending order
    public void sortList() {
        Collections.sort(arrayList);
    }

    public static void main(String[] args) {
        ArrayListManipulator arrayListManipulator = new ArrayListManipulator();
        arrayListManipulator.addElement(200);
        arrayListManipulator.addElement(90);
        arrayListManipulator.addElement(250);
        arrayListManipulator.addElement(100);
        arrayListManipulator.addElement(150);
        arrayListManipulator.addElement(50);
        arrayListManipulator.addElement(10);
        System.out.println("Before Sort: " + arrayListManipulator.getArrayList().toString());
        arrayListManipulator.sortList();
        System.out.println("After Sort: " + arrayListManipulator.getArrayList().toString());
    }
}
