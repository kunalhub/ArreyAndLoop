import java.util.Scanner;

// program to find gross salary calculation

public class GrossSalary {

    static double HRA ;
    static double DA;
    static double TA;
    static double PF;


    public static void main(String[]args){
        {
            Scanner grosssalary = new Scanner(System.in);

            System.out.println("Employee ID :");
            int employeeid = grosssalary.nextInt();

            System.out.println("Enter a Name :");
            String name = grosssalary.next();

            System.out.println("Enter Salary :");
            double salary = grosssalary.nextDouble();

            System.out.println("HRA : " + (HRA = (salary*10)/100));

            System.out.println("DA : " + (DA = (salary*8)/100));

            System.out.println("TA : " + (TA = (salary*9)/100));

            System.out.println("PF : " + (PF = (salary*20)/100));

            System.out.println("Gross Salary : " + (salary+HRA+DA+TA-PF));
        }

    }
}
