package quiz.Quiz2_090224.Question62;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
        sb.delete(0, 100);
        System.out.println(sb.length());

        // text "Hurrah! I Passed..." length is 19 (including spaces, punctuation)
        // delete(int start, int end) removes character from specified start index to the end index
        // sb.delete(0, 100) attempt to delete character from index 0 up to index 100
        // the text only has 19 characters, so it will delete all existing character
        // then, sb becomes empty string with length of 0
    }
}
