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
    public static double doubleNumInput(){
        double num = 0;
        try{num = sc.nextDouble();}
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
    public static void menu(){
        boolean isRunning = false;
        if (login())
        {
            isRunning = true;
        }
        else{
            System.out.println("Card locked");
        }
        while (isRunning) {
            System.out.println("Welcome to the ATM App");
            System.out.println("Please select an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Account tier");
            System.out.println("5. Savings projection");
            System.out.println("6. Receipt summary");
            System.out.println("7. Change PIN");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = numinput();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    maxOfThree();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    multiplicationTable();
                    break;
                case 6:
                    starTriangle();
                    break;
                case 7:
                    isPrime();
                    break;
                case 0:
                    isRunning = false;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
    }

    public static double checkBalance(){
        return balance;
    }
    public static void deposit() {
        System.out.print("Enter the deposit amount: ");
        double depo = doubleNumInput();
        if (depo <1 || depo >5000)
        {
            System.out.println("invalid amount, (1-5000)");
            return;
        }
        balance += depo;
        depositAmount +=depo;
        depositCount++;

    }

    public static void main(String[] args){
        login();
        menu();
    }
}
