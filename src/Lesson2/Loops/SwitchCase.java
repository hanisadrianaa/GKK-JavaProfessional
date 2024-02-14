package Lesson2.Loops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day abbr: ");
        String str = scanner.nextLine();
        System.out.println("switch: " + switchCase(str));

        scanner.close();
    }

    static String switchCase(String day) {
        String ret = "";
        switch (day) {
            case "m":
            case "mon":
            case "md":
                if (day.contains("m")) {
                    ret = "Monday";
                } else {
                    ret = "Not Monday";
                }
                break;
            case "tu":
                ret = "Tuesday";
                break;
            case "w":
                ret = "Wednesday";
                break;
            case "th":
                ret = "Thursday";
                break;
            case "f":
                ret = "Friday";
                break;
            default:
                ret = "Undefined";
                break;
        }
        return ret;
    }

}
