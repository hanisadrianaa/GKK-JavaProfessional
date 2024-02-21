package quiz.quiz3_200224;

import java.io.IOException;

class Super {
    Super() throws RuntimeException {
        System.out.print("CARPE ");
    }
}

class Sub extends Super {
    Sub() throws IOException {
        // super(); // call parent class constructor (Super)
        // super() is not written here, but it implicitly invoke by compiler
        // print "CARPE" first
        // then will print "DIEM"
        System.out.print("DIEM ");
    }
}

public class Q69_Test {
    public static void main(String[] args) throws Exception {
        new Sub();
    }
}
