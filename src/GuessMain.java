import java.util.Random;
import java.util.Scanner;
public class GuessMain {

    public static int rando()
    {
        Random gen = new Random();
        return gen.nextInt(20) + 1;

    }
    public static void rng()
    {   int gen=rando();
        int count=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String newline= scan.nextLine();
        System.out.println("Well, "+newline+", I am thinking of a number between 1 and 20.\n Take a guess.");
        newline= scan.nextLine();
        while(Integer.decode(newline)!=gen) {
            while (Integer.decode(newline) < 1 || Integer.decode(newline) > 20) {
                System.out.println("The number was not between 1 and 20. Please type a number between 1 and 20.");
                newline = scan.nextLine();
            }
            if (Integer.decode(newline) < gen) {
                System.out.println("Try a larger number.");
                count++;
                newline = scan.nextLine();
            }
            if (Integer.decode(newline) > gen) {
                System.out.println("Try a smaller number.");
                count++;
                newline = scan.nextLine();
            }
        }
        count++;
        if(count<=6)
        System.out.println("You win! You guessed the correct number in "+count+" tries.");
        else
            System.out.println("You guessed the correct number, but you got it after too many attempts.");

        }
    public static void main(String[] args)
    {
       rng();
       System.out.println("Try again? (Type 'y' for yes, 'n' for no)");
       Scanner scan=new Scanner(System.in);
       String check=scan.nextLine();
        while(!check.equals("n"))
        {
            if(!check.equals("y"))
            {
                System.out.println("Please type either 'y' for another game, or 'n' to cancel.");
                check=scan.nextLine();
            }
            if (check.equals("y"))
            {
                rng();
                System.out.println("Try again? (Type 'y' for yes, 'n' for no)");
                check=scan.nextLine();
            }

        }
    }
}
