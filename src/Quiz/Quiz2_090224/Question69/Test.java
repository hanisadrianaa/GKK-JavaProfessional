package Quiz.Quiz2_090224.Question69;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test {
    public static void change(Message m) {
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print(); // obj has single field names 'msg' with value "Happy New Year!"
        change(obj); // modify 'msg' field of the passage argument
                     // change() receive reference to 'obj', replace object in memory
        obj.print(); // print statement will be "Happy Holidays!"
    }
}

// program demonstrates pass-by-reference
// it shows how object fields can be modified by functions
// that receive object references as argumensts