import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[]args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

    

        int attempts = 0;
        int maxguess = 3;
        

        System.out.println("Think of a number between 1 and 100");
        int number = random.nextInt(100)+1;
        

        while(attempts < maxguess){
            attempts ++;

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

        // System.out.println(number);
        if(choice == number){

        System.out.println("You made it");
        break;
        }
        else if (choice > number){
            System.out.println("You guessed higher");
        } 
        else{
            System.out.println("You guessed lower");
        }
        if(attempts == maxguess){
            System.out.println("Sorry you have reached maximum attempts");
            System.out.println("The number was "+ number);
        }
        }
        scanner.close();
    }
}
