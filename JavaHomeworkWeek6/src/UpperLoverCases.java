import java.util.Scanner;

//program for uppercase alphabets into lowercase alphabets

public class UpperLoverCases {

    public static void main (String[] args){

        Scanner alphabet=new Scanner(System.in);
        System.out.println("Input any alphabet in uppercase :");
        String name=alphabet.next();

        System.out.println("The lowercase alphabet is :");
        System.out.println(name.toLowerCase());
    }
}
