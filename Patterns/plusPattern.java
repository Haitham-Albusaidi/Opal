package Patterns;

import java.util.Scanner;

public class plusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();

        for(int i = 0 ; i < num ; i++)
        {
            for (int j = 0 ; j < num; j++)
            {
                if (i == num/2 || j == num/2 )
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}

    

