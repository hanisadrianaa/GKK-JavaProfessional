package quiz.Quiz2_090224.Question19;

public interface I1 {
    void m1() throws java.io.IOException;

    // Option 1
    public class C1 implements I1 {
        public void m1() {
        }
    }

    // Option 2
    public class C4 implements I1 {
        // match interface exception
        // if C4 throws different exception, caller might not handle correctly
        // leading to runtime errors
        // if C4 can throw different exception, use more specific exceptions
        // e.g: FileNotFoundException
        public void m1() throws java.io.IOException {
        //public void m1() throws Exception {
        }
    }

    // Option 3
    public class C2 implements I1 {
        public void m1() throws java.io.FileNotFoundException {

        }
    }

    // Option 4
    public class C3 implements I1 {
        public void m1() throws java.io.IOException {

        }
    }
}
