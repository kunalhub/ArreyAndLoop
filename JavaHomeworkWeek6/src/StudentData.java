import java.util.Scanner;

// program to create students mark sheet.

public class StudentData {

    public static void main (String [] args){

        System.out.println("enter student name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("enter roll number :");
        int roll = scanner.nextInt();

        System.out.println("enter maths marks :");
        int maths = scanner.nextInt();

        System.out.println("enter english marks :");
        int eng = scanner.nextInt();

        System.out.println("enter account marks :");
        int acc = scanner.nextInt();

        System.out.println("total marks of three subject" + " = " + (maths+eng+acc));

        System.out.println("total percentage" + " = " + ((maths+eng+acc) / (3)) + "%");

        if ((maths + eng + acc) / (3) >=35){
            System.out.println("the student is pass");
        }
        else {
            System.out.println("the result is fail");
        }
        System.out.print("the grade is ");
        if ((maths + eng + acc) / (3) >= 80) {
            System.out.print("A+");
        }
        else if (((maths + eng + acc) / (3) >= 60)){
            System.out.print("A");
        }
        else if (((maths + eng + acc)  / (3) >= 50)){
            System.out.print("B");
        }
        else if (((maths + eng + acc) / (3) >= 35)) {
            System.out.print("C");
        }
        else {
        }
    }
}
