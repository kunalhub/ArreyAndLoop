import java.util.Arrays;

public class NumericString {

    public static void main(String[] args){

        int a[] = {20,555,658,9586,245
        };

        String[] array2 = {"apple","banana","orange","greps","kiwi"
        };
        System.out.println("numeric array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+Arrays.toString(a));

        System.out.println("string array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : "+ Arrays.toString(array2));
    }
}
