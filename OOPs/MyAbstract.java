package OOPs;
abstract class Vehicle{
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car is starting");
    }

    void stop(){
        System.out.println("Car is stopping");
    }
}


public class MyAbstract {
    public static void main(String[] args) {
        Car BMW = new Car();
        BMW.start();
        BMW.stop();
    }
}
