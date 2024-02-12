import java.util.Scanner;
public class Charf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input;
        char check;
        int nletter=0;
        System.out.println("enter a string:");
        input=sc.nextLine();
        System.out.println("enter a character:");
        check=sc.next().charAt(0);
        for(int i=0;i<input.length();i++)
        {
            if(check==input.charAt(i))
            {
                nletter++;
            }
        }
        System.out.println("Number of Strings:"+nletter);
    }
    
    
}
