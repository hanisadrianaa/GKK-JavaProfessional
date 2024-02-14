package Quiz.Quiz2_090224.Question57;

class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car /*extends Vehicle*/ {
    // @Override
    // not markes as @Override so compiler doesn't recognize it as override method from superclass
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        System.out.println(obj.getRegistrationNumber());
    }
}

// getRegistrationNumber() of type Car must override
// you're assigning a new Car object to a variable declared as Vehicle
// eventho they're related classes, a Car isn't directly a Vehicle.