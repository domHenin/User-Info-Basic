import java.util.Scanner;

public class userInfoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        UserName userName = new UserName();
        UserAge userAge = new UserAge();
        UserWage userWage = new UserWage();

//      GET USER NAME:
        System.out.println("Hello. What is your name?");
        userName.setName(input.nextLine());
        System.out.println(userName.getName());

//      GET USER AGE:
        System.out.println("How old are you?");
        userAge.setAge(input.nextInt());
        System.out.println(userAge.getAge());

//      GET USER WAGE:
        System.out.println("How much do you make?");
        userWage.setSalary(input.nextDouble());
//        System.out.println(userWage.getSalary());
        System.out.printf("$%.2f, I hope that's per hour and not per year!", userWage.getSalary());

//        userName();
//        userAge();
//        userWage();
        System.out.println("\nThank you for your cooperation!");
    }

//    public static void userName() {
//        Scanner keyboard = new Scanner(System.in);
//        String name=keyboard.nextLine();
//        System.out.println("Hi, "+name);
//    }

//    public static void userAge() {
//        int age=0;
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("How old are you?");
//        age=keyboard.nextInt();
//    }

//    public static void userWage() {
//        Scanner keyboard =new Scanner(System.in);
//        double salary=0;
//        System.out.println("How much do you make?");
//        salary=keyboard.nextDouble();
//        System.out.printf("$%.2f, I hope that's per hour and not per year!", salary);
//
//        System.out.println();
//    }


}
