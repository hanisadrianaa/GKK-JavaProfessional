package Lesson2.Operators;

public class Exercise3 {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        
        System.out.println(str);
        System.out.println(str.concat(str));
        str = str.concat(str);
        System.out.println(str);
        System.out.println(str.charAt(9));
        System.out.println(str.length());

        String search = "qwerty";
        if(str.contains(search)) {
            // both have same output
            System.out.println("Contains qwerty");
            System.out.printf("Contains %s", search);
        } else {
            // both have same output
            System.out.println("Does not contains qwerty");
            System.out.printf("Does not contains %s", search);
        }
    }
}
