import java.util.Scanner;

// program to find interchange value of 2 number

public class InterChangeValue {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the value of x :");
        int x=scanner.nextInt();

        System.out.println("Enter the value of y :");
        int y=scanner.nextInt();

        // swap the value of x and y

        System.out.println("Before Interchange Value\nx = " + x   + "\ny = " +y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after Interchange Value\nx = " +  x    + "\ny = " +y);
    }
}
