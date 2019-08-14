public class WordsSpaces {

    public static void main(String[]args)
    {
        int word=1;
        String str="My name is bond, james bond";

        for(int i=0;i<str.length();++i)
        {
            if(str.charAt(i)==' ')
                word++;
        }

        System.out.println("Number of words="+word);
        System.out.println("Number of spaces="+(word-1));
    }
}
