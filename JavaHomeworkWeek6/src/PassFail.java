import java.util.Scanner;

// program of student's result on basis of their each subject marks

public class PassFail {

    public static void main(String[] args) {


        System.out.println("enter student name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("enter roll number :");
        int roll = scanner.nextInt();

        System.out.println("enter arts marks :");
        int arts = scanner.nextInt();

        System.out.println("enter science marks :");
        int sci = scanner.nextInt();

        System.out.println("enter computer marks :");
        int com = scanner.nextInt();

        if (arts >= 35 && sci >= 35 && com >= 35) {
            System.out.println("student is pass");
        } else
            System.out.println("student is fail");
    }
}
