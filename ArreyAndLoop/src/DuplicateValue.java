public class DuplicateValue {

    public static void main(String[] args)
    {
    int a[] ={1,5,2,1,6,9,5,3};
    for (int i = 0; i < a.length-1; i++)
    {
    for (int j = i+1; j<a.length; j++ )
    {
     if ((a[i] == a[j] ) && (i != j))
     {
         System.out.println("Duplicate Element is : " +a[j]);
     }
}
    }
    }
}

