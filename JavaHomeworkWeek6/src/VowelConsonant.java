import java.util.Scanner;

// program to find character is vowel or consonant

public class VowelConsonant {

    public static void main(String[] args) {

        Scanner vc = new Scanner(System.in);

        System.out.println("Enter any character");
        char vowel=vc.next().charAt(0);
        int a=(int)vowel;

        if((a>=65)&&(a<=90)||(a>=97)&&(a<=122))
        {
            if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
            {
                System.out.println("This is Vowel"); }

            else{ System.out.println("This is consonant"); }}
        else{
            System.out.println("INVALID CHARACTER");
        }
    }
}
