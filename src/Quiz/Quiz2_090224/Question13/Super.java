package quiz.Quiz2_090224.Question13;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

