import java.util.Scanner;

// program to find year is a leap year or not

public class LeapYear {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int Year = scanner.nextInt();
        if(Year % 4 == 0)
            System.out.println(Year + " is Leap Year");
        else
            System.out.println(Year + " is not Leap Year");
    }
}
