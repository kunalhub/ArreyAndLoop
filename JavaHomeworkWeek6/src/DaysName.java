import java.util.Scanner;

// program to find days

public class DaysName {

    public static void main(String[] args) {

            Scanner dayweek = new Scanner(System.in);

            System.out.println("Input any number :");
            int a = dayweek.nextInt();

            if (a == 1) {
                System.out.println("It is Monday");
            }
            if (a == 2) {
                System.out.println("It is Tuesday");
            }
            if (a == 3) {
                System.out.println("It is wednesday");
            }
            if (a == 4) {
                System.out.println("It is Thursday");
            }
            if (a == 5) {
                System.out.println("It is Friday");
            }
            if (a == 6) {
                System.out.println("It is Saturday");
            }
            if (a == 7) {
                System.out.println("It is Sunday");
            }
        }
    }
