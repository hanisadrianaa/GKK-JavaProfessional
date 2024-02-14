package Quiz.Quiz2_090224.Question16;

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {
        System.err.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String[] args) {
        new LogHelper().help();
    }
}
