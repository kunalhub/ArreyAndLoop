import java.util.Scanner;

public class AgeVoting
{
    public static void main (String[] args)
    {
        Scanner age=new Scanner(System.in);

        System.out.println("enter your age :");
        int a = age.nextInt();

        if(a>=18)
        {
            System.out.println("A person is eligible for voting");
        }
        else
            {System.out.println("A person is not eligible for voting");
        }
    }
}
