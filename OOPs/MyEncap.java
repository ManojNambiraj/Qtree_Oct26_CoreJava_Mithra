package OOPs;
// Encapsulation --> (Getter & Setter) --> Data Hiding

class Student{
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }
}

class MyEncap {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Varun");
        s1.setAge(20);
        
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}