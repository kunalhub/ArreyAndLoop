import java.util.Scanner;

public class SumOfEachNumber {

    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five digit number : ");
        m = scanner.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits is : "+sum);
    }
}
