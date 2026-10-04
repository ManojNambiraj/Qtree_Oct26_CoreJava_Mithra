package OOPs;
class Calculator{
    int add(int a, int b){
        return a + b;
    }

    int add(int x, int y, int z){
        return x + y + z;
    }

    double add(double p, double q){
        return p + q;
    }
}

public class MyPolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 5 and 10: " + calc.add(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + calc.add(5, 10, 15));
        System.out.println("Addition of 5.5 and 10.5: " + calc.add(5.5, 10.5));
    }
}
