import java.util.Scanner;

// program of city's name

public class CitysName {

    public static void main(String[] args){

        Scanner alphabet=new Scanner(System.in);

        System.out.println("Enter alphabet from A to F :");
        char x=alphabet.next().charAt(0);

        if(x=='a'||x=='A') {
            System.out.println("The city name is London");
        }
        else if(x=='b'||x=='B'){
            System.out.println("The city name is Manchester");
        }
        else if(x=='c'||x=='C'){
            System.out.println("The city name is Kent");
        }
        else if(x=='d'||x=='D') {
            System.out.println("The city name is Dover");
        }
        else if(x=='e'||x=='E') {
            System.out.println("The city name is Birmingham");
        }
        else if(x=='f'||x=='F') {
            System.out.println("The city name is Wales");}
        else{
            System.out.println("Invalid entry");
        }

    }
}

