package Quiz.Quiz2_090224.Question16;

public abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}
