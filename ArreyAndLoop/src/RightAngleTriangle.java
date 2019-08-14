import java.util.Scanner;
public class RightAngleTriangle {

    public static void main(String[] args)

    {
        int x, y;
        Scanner scanner = new Scanner (System.in);
        System.out.print("number of lines : ");
        int num = scanner.nextInt();
        for ( x = 1; x <= num; x++)
        {
            for ( y =1; y <= x; y++)
            {
                System.out.print("@");
            }
            System.out.println();
        }


    }
}
