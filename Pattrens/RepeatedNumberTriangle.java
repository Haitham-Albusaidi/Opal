package Pattrens;

import java.util.Scanner;

public class RepeatedNumberTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();

        for(int i = 0 ; i <num ; i++)
        {
            for (int j = 0 ; j <= i ; j++)
            {
                    System.out.print(i+1 + " ");                
            }
            System.out.println();
        }
        sc.close();
    }
}

