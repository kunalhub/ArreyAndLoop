import java.util.Scanner;

public class MultificationTable {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=0;

        System.out.println("Enter the number: ");
        num=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
