import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
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
        if (number <= 10) {
            System.out.println("Your day will not be enjoyable."); //Negative 1
        }
        if (number > 10 && number <= 20) {
            System.out.println("Your will have a good day."); //Positive 1
        }
        if (number > 20 && number <= 30) {
            System.out.println("Your day will be filled with joy."); //Positive 2
        }
        if (number > 30 && number <= 40) {
            System.out.println("Your day is not looking good."); //Negative 2
        }
        if (number > 40 && number <= 50) {
            System.out.println("Your day just plain sucks dude..."); //Negative 3
        }
        if (number > 50 && number <= 60) {
            System.out.println("Wow today is going to be awesome for you."); //Positive 3
        }
        if (number > 60 && number <= 70) {
            System.out.println("All of your tires are going to go flat and you'll be late to school/work"); //Negative 4
        }
        if (number > 70 && number <= 80) {
            System.out.println("Congrats! You won the lottery!"); //Positive 4
        }
        if (number > 80 && number <= 90) {
            System.out.println("Oops! The FBI got some info wrong and you'll be spending the night in a cell."); //Negative 5
        }
        if (number > 90 && number <= 100) {
            System.out.println("Hooray! You gonna get a raise at work!"); //Positive 5
        }
    }
}


