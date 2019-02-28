import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //initialize
        String userName;
        int number;

        //code
        System.out.println("Hello, what is your name?");
        userName = keyboard.nextLine();
        System.out.println("Hello " + userName + "! Welcome to the Magic 8 Ball!");
        System.out.println("Please " + userName + " try to guess a number 1-100.");
        number = keyboard.nextInt();
            if (number<= 10);
        {
            System.out.println("Your day will not be enjoyable.");
        }
            if (number > 10 && number <= 20);
        {
            System.out.println("Your will have a good day.");
        }
            if (number > 10 && number > 20 && number <= 30);
        {
            System.out.println("Your day will be filled with joy.");
        }
        }
    }


