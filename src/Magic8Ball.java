import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        //                             Answers
        //Yes: Yes | That is very likely | That is Correct! | Indeed | Yep!
        //No: No. | Probably not. | Very unlikely. | Never. | Not at all.
        //declare
        int value;
        int testing;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //initialize
        String userName;
        String number;

        //code
        System.out.println("Hello, what is your name?");
        userName = keyboard.nextLine();
        System.out.println("Hello " + userName + "! Welcome to the Magic 8 Ball!");
        System.out.println("Please " + userName + " try to guess a number 1-100.");
        number = keyboard.nextLine();

    }
}

