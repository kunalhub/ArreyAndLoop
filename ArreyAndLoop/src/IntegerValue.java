import java.util.Arrays;

public class IntegerValue {

    public static void main(String[] args)
    {

        int a[] = {89, 20, 99, 156, 213, 148, 458,};
        System.out.println("Original array : "+Arrays.toString(a));

        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+ Arrays.toString(a));
    }

}
