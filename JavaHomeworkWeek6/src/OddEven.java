import java.util.Scanner;

// program to find out number is odd or even

public class OddEven {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println(num+ " is even number");
        else
            System.out.println(num+ " is odd number");

    }
}
