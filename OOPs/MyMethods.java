package OOPs;
public class MyMethods {

    int marks;

    void total(){
        System.out.println("Total:" + marks);
    }

    public static void main(String[] args) {

        MyMethods student1 = new MyMethods();
        MyMethods student2 = new MyMethods();
        MyMethods student3 = new MyMethods();

        student1.marks = 99;
        student2.marks = 98;
        student3.marks = 77;

        System.out.println("Varun: " + student1.marks);
        System.out.println("Kavitha:" + student2.marks);
        System.out.println("Sanjay:" + student3.marks);
    }
}

// OOPs --> Object Oriented Programming Languages

    // 1. Class
    // 2. Object
    // 3. Inheritance
    // 4. Encapsulation
    // 5. Abstraction
    // 6. Polymorphism