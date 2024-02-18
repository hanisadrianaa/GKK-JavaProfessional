package quiz.Quiz2_090224.Question63;

public class Test {
    public static void main(String[] args) {
        int score = 60;

        // switch (score) {
        //     default:
        //         System.out.println("Not a valid score");
        //     case score < 70:
        //         System.out.println("Failed");
        //         break;
        //     case score >= 70:
        //         System.out.println("Passed");
        //         break;
        // }

        // score < 70 is the condition
        // if score less than 70, value 0 is assigned
        // if score is greater than or equal to 70, value 1 is assigned
        switch (score < 70 ? 0 : 1) {
            case 0:
                System.out.println("Failed");
                break;
            case 1:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Not a valid score");
        }
    }
}
