public class SpecificValue {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int value = 7;

        boolean found = false;

        for (int n : a)
        {
            if (n == value) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(value + " has found.");
        else
            System.out.println(value + " has not found.");
    }
}
