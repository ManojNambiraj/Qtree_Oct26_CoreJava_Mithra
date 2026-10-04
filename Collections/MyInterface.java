package Collections;

interface Animal{
    int years = 1996;

    void sound();
}

interface Pet{
    void play();
}

class Dog implements Animal, Pet{
    public void sound(){
        System.out.println("Dog barks");
        System.out.println("Dog was born in: " + years);
    }

    public void play(){
        System.out.println("Dog plays with a ball");
    }
}


public class MyInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.play();
    }
}
