package Quiz.Quiz2_090224.Question13;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (IOException e) {
            System.out.print("A");
        } catch(FileNotFoundException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }
}
