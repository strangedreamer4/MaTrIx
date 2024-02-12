import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row1,col1,row2,col2;
        int a1[][]=new int[10][10];
        int a2[][]=new int[10][10];
        int rs[][]=new int[10][10];
        do{
            System.out.print("the row of first matrix:");
            row1=sc.nextInt();
            System.out.print("the column of first matrix:");
            col1=sc.nextInt();
            System.out.print("the row of second matrix:");
            row2=sc.nextInt();
            System.out.print("the column of second matrix:");
            col2=sc.nextInt();
            if (row1!=col2 || row2!=col1)
            {
                System.out.println("enter valid no of rows and columns:"); 
            }
        }
        while(row1!=col2 || row2!=col1);
        {
            System.out.println("start enter the values of first matrix:");
            for(int i=0;i<row1;i++)
            {
                for(int j=0; j<col1;j++)
                {
                    a1[i][j]=sc.nextInt();
                }
            }
                System.out.println("start enter the values of second matrix:");
                for(int i=0; i<row2; i++)
                {
                    for(int j=0; j<col2; j++)
                    {
                        a2[i][j]=sc.nextInt();
                    }
                }
                System.out.println("the first matrix is:");
                for(int i=0; i<row1; i++)
                {
                    for(int j=0; j<col1; j++)
                    {
                        System.out.println(a1[i][j]+" ");
                    }
                System.out.println();
                }
                System.out.println("the second matrix is:");
                for(int i=0; i<row2; i++)
                {
                    for(int j=0; j<col2; j++)
                    {
                        System.out.println(a2[i][j]+" ");
                    }
                System.out.println();
                }
                for(int i=0;i<row1;i++)
                {
                    for(int j=0;j<col2;j++)
                    {
                        rs[i][j]=0;
                        for(int k=0;k<col1;k++)
                        {
                            rs[i][j]=rs[i][j] + (a1[i][k]*a2[k][j]);
                        }
                    }
                }
                System.out.println("the resultent matrix is:");
                for(int i=0; i<row1; i++)
                {
                    for(int j=0;j<col2;j++)
                    {
                        System.out.print(rs[i][j]+" ");
                    }
                    System.out.println();
                }
            
        }
    }
    
}
