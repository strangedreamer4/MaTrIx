import java.util.Scanner;

public class Palindrome
 {
    public static void main(String[] args)
     {
        String newString;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        newString=sc.nextLine();
        char newArray[] = new char[newString.length()];
        newArray = newString.toCharArray();
        char resArray[]=new char[newArray.length];

        for(int i=0; i<newArray.length; i++)
        {
            resArray[i]=newArray[newString.length()-i-1];
        }
        String resString=String.valueOf(resArray);
        if(resString.equals(newString))
        {
            System.out.println("the String is palindrome");
        }
        else
        {
            System.out.println("the stringis not palindrome");
        }
    }
}
