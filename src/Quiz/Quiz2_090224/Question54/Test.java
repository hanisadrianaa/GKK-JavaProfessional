package Quiz.Quiz2_090224.Question54;

// public class Test {
//     private static void m1() throws Exception {
//         throw new Exception();
//     }

//     public static void main(String[] args) {
//         try {
//             m1();
//         } finally {
//             System.out.println("A");
//         }
//     }
// }

public class Test {
    private static void m1() throws Exception {
        throw new Exception("Exception from m1()");
    }

    public static void main(String[] args) throws Exception {
        try {
            m1();
        } catch(Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("A");
    }
}

// 'finally' block is unnecessary since exception is already handled within 'try-catch' block