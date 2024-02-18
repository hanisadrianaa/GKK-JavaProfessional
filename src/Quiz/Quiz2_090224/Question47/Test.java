package quiz.Quiz2_090224.Question47;

public class Test {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                switch(arr[i][j]) {
                    case "2":
                    case "4":
                    case "6":
                        break;
                    default:
                        continue;
                }
                System.out.println(arr[i][j]);
            }
        }
    }
}
