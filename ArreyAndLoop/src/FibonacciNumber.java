import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args)
    {
        int num, num1 = 0, num2 = 1;
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.print("Fibonacci Series of" + num +" number:");
        int i = 1;
        while (i <= num)
        {
            System.out.print( num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }

    }


}
