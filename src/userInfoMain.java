import java.util.Scanner;

public class userInfoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        userName();
        userAge();
        userWage();
        System.out.println("\nThank you for your cooperation!");
    }

    public static void userName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name=keyboard.nextLine();
        System.out.println("Hi, "+name);
    }

    public static void userAge() {
        int age=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How old are you?");
        age=keyboard.nextInt();
    }

    public static void userWage() {
        Scanner keyboard =new Scanner(System.in);
        double salary=0;
        System.out.println("How much do you make?");;
        salary=keyboard.nextDouble();
        System.out.println("%.2f, I hope that's per hour and not per year!");
    }
}
