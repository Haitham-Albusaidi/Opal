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
        int num = 999;
        try{num = sc.nextInt();}
        catch(Exception e) {System.out.println("Invalid input. Please enter a number."); sc.next();}
        return num;
    }
    public static double doubleNumInput(){
        double num = 0;
        try{num = sc.nextDouble();}
        catch(Exception e) {System.out.println("Invalid input. Please enter a number."); sc.next();}
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
                System.out.println("Wrong password, attempts left: " + (2-i) );
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
                    withdraw();
                    break;
                case 4:
                    accountTier();
                    break;
                case 5:
                    savingsProjection();
                    break;
                case 6:
                    receiptSummary();
                    break;
                case 7:
                    changePin();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } 
    }

    public static void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public static void deposit() {
        System.out.print("Enter the deposit amount: ");
        double depo = doubleNumInput();
        if (depo <1 || depo >5000)
        {
            System.out.println("invalid amount, (1-5000)");
            return;
        }
        System.out.println("Deposit successful: " + depo);
        balance += depo;
        depositAmount +=depo;
        depositCount++;
        System.out.println("Current Balance: " + balance);

    }
    
    public static void withdraw(){
        System.out.print("Enter the withdraw amount: ");
        double draw = doubleNumInput();
        int fee = 0;
        if(draw <=500)
        {
            fee = 2;
        }
        else if (draw >500)
        {
            fee = 5;
        }

        if (draw <1 || draw >1000)
        {
            System.out.println("invalid amount, (1-1000)");
            return;
        }
        if (draw <=500 && draw+2 > balance)
        {
            System.out.println("invalid amount, Cannot withdraw more than the balance");
            return;
        }
        
        if (draw >500 && draw+5 > balance)
        {
            System.out.println("invalid amount, Cannot withdraw more than the balance");
            return;
        }
        
        if(draw%10 != 0)
        {
            System.out.println("invalid amount, only multiple of 10");
            return;
        }
        if (draw + fee > 1000) {
            System.out.println("Cannot withdraw more than 1000 in this session.");
            return;
        }
        
            System.out.println("Fee: " + fee);
            System.out.println("Total amount withdrawn: " + (draw + fee));
            balance -=draw+fee;
            WithdrawalCount++;
            WithdrawalAmount+=draw;

    }

    public static double getInterestRate() {
        if (balance < 1000) {
            return 0.01;
        } else if (balance < 5000) {
            return 0.02;
        } else if (balance < 20000) {
            return 0.03;
        } else {
            return 0.04;
        }
    }
    public static void accountTier(){
        String tier;
        double interestRate = getInterestRate();
        if (balance < 1000) {
            tier = "Bronze";
        } else if (balance < 5000) {
            tier = "Silver";
        } else if (balance < 20000) {
            tier = "Gold";
        } else {
            tier = "Platinum";
        }
        System.out.println("Account Tier: " + tier);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }

    public static void savingsProjection(){
        System.out.print("Enter the number of years for projection: ");
        int years = numinput();
        if(years < 1 || years > 10)
        {
            System.out.println("Invalid input. (1-10) years.");
            return;
        }
        double interestRate = getInterestRate();
        double currentBalance = balance;  
        for (int i = 1; i <= years; i++) {
            currentBalance *= (1 + interestRate);  
            System.out.printf("Year %d: %.2f\n", i, currentBalance);
        }
    }
    
    public static void receiptSummary(){
        System.out.println("Receipt Summary:");
        System.out.println("Current Balance: " + balance);
        System.out.println("Total Deposits: " + depositCount + " (Amount: " + depositAmount + ")");
        System.out.println("Total Withdrawals: " + WithdrawalCount + " (Amount: " + WithdrawalAmount + ")");
    }
    
    public static void changePin(){
        System.out.print("Enter your current PIN: ");
        int currentPin = numinput();
        if (currentPin != pin) {
            System.out.println("Incorrect PIN. Please try again.");
            return;
        }
        System.out.print("Enter your new PIN: ");
        int newPin = numinput();
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("Invalid PIN. Please enter a 4-digit number.");
            return;
        }
        System.out.print("Confirm your new PIN: ");
        int confirmPin = numinput();
        if (newPin != confirmPin) {
            System.out.println("PINs do not match. Change failed.");
            return;
        }
        pin = newPin;
        System.out.println("PIN changed successfully.");
    }
    public static void main(String[] args){
        menu();
    }
}
