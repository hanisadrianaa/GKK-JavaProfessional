package quiz.Quiz1_060224.Question3;

abstract class Traveller {
    void travel(String place){
    }
}

abstract class BeachTraveller extends Traveller {

    // Option 1 - valid
    // public void travel() throws RuntimeException{
    // }

    // Option 2 - valid
    // abstract void travel();

    // Option 3 - valid
    // abstract void travel(String beach);

    // Option 4 - valid
    // public abstract void travel();

    // Option 5 - error
    // public void travel(String beach) throws Exception{
    // }

    // Option 6 - valid
    // public void travel(Object obj) {
    // }

    // Option 7 - error
    // void travel(String beach) throws java.io.IOException {
    // }
}
