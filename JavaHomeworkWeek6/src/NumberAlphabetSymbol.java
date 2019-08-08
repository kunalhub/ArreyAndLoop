import java.util.Scanner;

// program to check character is a number or alphabet or symbol

public class NumberAlphabetSymbol {

    public static void main(String[] args) {

        Scanner alphabet = new Scanner(System.in);

        System.out.println("Enter any character");
        char c = alphabet.next().charAt(0);
        int b=(int)c;
        if (b >=48&& b <= 57) {
            System.out.println("Is a number");
        }

        else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c+ " is an alphabet.");
        } else {
            System.out.println(c + " is a symbol");
        }

    }
}
