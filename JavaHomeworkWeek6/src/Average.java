import java.util.Scanner;

// program to find average of 5 numbers

public class Average {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Enter first number");
        int a=number.nextInt();

        System.out.println("Enter second number :");
        int b=number.nextInt();

        System.out.println("Enter third number :");
        int c=number.nextInt();

        System.out.println("Enter fourth number :");
        int d=number.nextInt();

        System.out.println("Enter fifth number :");
        int e=number.nextInt();

        System.out.println("Average of five number is : "+((a+b+c+d+e)/5));

    }

}

