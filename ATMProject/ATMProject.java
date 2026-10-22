package ATMProject;

import java.util.Scanner;

public class ATMProject {
    static Scanner sc = new Scanner(System.in);
    static double balance = 1000.00;
    static int pin = 1234;
    static int depositCount = 0;
    static double depositAmount = 0;
    static int WithdrawalCount = 0;
    static double WithdrawalAmount = 0;



    public static int numinput(){
        int num = 0;
        try{num = sc.nextInt();}
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");}
        return num;
    }
    public static boolean login(){
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter the PIN: ");
            int pin = numinput();
            if(pin == 1234)
            {
                System.out.println();
                System.out.println("Welcome!");
                return true;
            }
            else{
                System.out.println("Wrong password");
            }
        }
        return false;
        
    }
    public static void main(String[] args){

        System.out.println(login());
    }
}
