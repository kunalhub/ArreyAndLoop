import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {

        int a[] = {14, 49, 25, 56, 66, 24, 20, 91, 7, 39};

        // Insert an element in 2rd position of the array

        int position = 3;
        int newValue = 50;

        System.out.println("Original Array : "+Arrays.toString(a));


        a[position] = newValue;
        System.out.println("New Array : "+ Arrays.toString(a));
    }
}
