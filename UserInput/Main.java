package UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name:");

        String username = obj.nextLine();

        System.out.println("Enter your age:");

        int age = obj.nextInt();

        System.out.println("Your name is: " + username);
        System.out.println("Your age is: " + age);
    }
}
