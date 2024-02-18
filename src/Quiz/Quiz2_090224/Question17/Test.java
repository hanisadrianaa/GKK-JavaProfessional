package quiz.Quiz2_090224.Question17;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();

        
        String s2 = "Java";

        System.out.println(s1 == s2);

        // correct comparison
        // to compare actual content of strings, use 'equals' method
        // System.out.println(s1.equals(s2));
    }
}

// even though 's1' and 's2' contain same characters, they are stored in different memory
// because they were created separately
// 's1 == s2' compare reference (memory address), not content
// so it point to different objects