package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListStringManipulator {
    private ArrayList<String> arrayList;

    // Constructor to initialize the ArrayList
    public ArrayListStringManipulator() {
        arrayList = new ArrayList<>();
    }

    // Method to add an element to the ArrayList
    public void addElement(String element) {
        arrayList.add(element);
    }

    // Method to remove an element by value from the ArrayList
    public void removeElementByValue(String element) {
        arrayList.remove(element);
    }

    // Method to remove an element by index from the ArrayList
    public void removeElementByIndex(int index) {
        arrayList.remove(index);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    // Method to search for an element in the ArrayList and return its index
    // If the element is not found, return -1
    public int searchElement(String element) {
        return arrayList.indexOf(element);
    }

    // Method to sort the ArrayList in ascending order
    public void sortList() {
        Collections.sort(arrayList);
    }

    public static void main(String[] args) {
        ArrayListStringManipulator arrayListString = new ArrayListStringManipulator();
        arrayListString.addElement("Apple");
        arrayListString.addElement("Kiwi");
        arrayListString.addElement("Durian");
        arrayListString.addElement("Mango");
        arrayListString.addElement("Strawberry");
        arrayListString.addElement("Watermelon");
        arrayListString.addElement("Grape");
        System.out.println("Before Sort: " + arrayListString.getArrayList().toString());
        arrayListString.sortList();
        System.out.println("After Sort: " + arrayListString.getArrayList().toString());

        // Remove by index
        // arrayListString.removeElementByIndex(1);

        // Remove by value
        // arrayListString.removeElementByValue("Kiwi");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to remove: ");
        int indexToRemove = scanner.nextInt();

        // Remove element by index if it's valid
        if (indexToRemove >= 0 && indexToRemove < arrayListString.getArrayList().size()) {
            arrayListString.removeElementByIndex(indexToRemove);
            System.out.println("Element at index " + indexToRemove + " removed successfully.");
            System.out.println("After Remove: " + arrayListString.getArrayList().toString());
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }

        System.out.print("Enter value to remove: ");
        String valueToRemove = scanner.next();

        // Remove element by index if it's valid
        if (arrayListString.getArrayList().contains(valueToRemove)) {
            arrayListString.removeElementByValue(valueToRemove);
            System.out.println("Element \"" + valueToRemove + "\" removed successfully.");
            System.out.println("After Remove: " + arrayListString.getArrayList().toString());
        } else {
            System.out.println("Value \"" + valueToRemove + "\" not found in the list.");
        }

        scanner.close();
    }
}
