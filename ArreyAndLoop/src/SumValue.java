public class SumValue {

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50,60,70,80,90,10};
        int sum = 0;

        for (int i : a)
            sum += i;
        System.out.println("The sum is :" + sum);
    }
}
