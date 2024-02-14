package Quiz.Quiz1_060224.Question2;

public class Test {
    static int i1 = 10;
    int i2 = 20;

    int add() {
        return i1 + this.i2;
    }

    public static void main(String[] args) {
        System.out.println(new Test().add());
    }
}
