package ToolboxApp;
import java.util.Scanner;

public class ToolboxApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    //Menu method to display the list of tools and handle user input
    public static void menu()
    {
        boolean isRunning = true;
        do {
            System.out.println("Welcome to the Toolbox App");
            System.out.println("Please select a tool from the list below:");
            System.out.println("1. Celsius to Fahrenheit Converter");
            System.out.println("2. Even or Odd ");
            System.out.println("3. Maximum of Three");
            System.out.println("4. Factorial Calculator");
            System.out.println("5. Multiplication Table");
            System.out.println("6. Star Triangle");
            System.out.println("7. Prime Number ");
            System.out.println("8. Reverse a Number");
            System.out.println("9. Number Pyramid ");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    evenOrOdd();
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
                case 8:
                    reverseNumber();
                    break;
                case 9:
                    numberPyramid();
                    break;
                case 10:
                    isRunning = false;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (isRunning); 
    }

    // Method to convert Celsius to Fahrenheit
    public static void celsiusToFahrenheit() {
        System.out.print("Enter a Celsius Temp: ");
        double temp;
        try{temp = sc.nextDouble();}
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return; }

        System.out.println("Fahrenheit: "+(temp * 9/5 + 32));
    }

    // Method to check if a number is even or odd
    public static void evenOrOdd() {
        System.out.print("Enter a number: ");
        int num = 0;
        try{
            num = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return; }
        
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("ODD");
        }
    }
    
    // Method to find the maximum of three numbers
    public static void maxOfThree() {
        System.out.print("Enter 1st number: ");
        int num1 = 0;
        try{
            num1 = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return; }
        

        System.out.print("Enter 2nd number: ");
        int num2 = 0;
        try{
            num2 = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return; }
        
        System.out.print("Enter 3rd number: ");
        int num3 = 0;
        try{
            num3 = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return; }
        
        int highest = Math.max(num1 , Math.max(num2, num3));
        System.out.println("The max is: "+highest);

    }

    // Method to calculate the factorial of a number.
    public static void factorial() {
        System.out.print("Enter a number (0-15): ");
        
        int num = 0;
        try{
            num = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return;} 

        if(num < 0 || num >15){
            System.out.println("Out of range");
            return;
        }

        long factoriall = 1;
        for (int i = 1; i <= num; i++) {
            factoriall *= i;
        }

        System.out.println(num + "! = "+factoriall);
        
    }
    // Method to generate a multiplication table for a given number 
    public static void multiplicationTable() {
        System.out.println("Enter a number: ");

        int num = 0;
        try{
            num = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return;} 

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(+ num + " x "+i+" = "+(num*i));
        }
        }
    

    // Method to print a star triangle of a given height
    public static void starTriangle() {
        System.out.println("how many rows do you want? : ");
        int num = 0;
        try{
            num = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return;} 

        for (int i = 0; i<=num ; i++)
        {
            
            for (int j = num; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();   
        }
        
    }

    
    // Method to check if a number is prime
    public static void isPrime(){
        System.out.println("Enter a number");

        int num = 0;
        try{
            num = sc.nextInt();
        }
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");sc.next(); return;} 

        if(num<2)
        {
            System.out.println("enter a number greater than 1");
            return;
        }
        boolean isPrime = true;
    
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }

    }
    // Method to reverse a number
    public static void reverseNumber(){

    }
    // Method to print a number pyramid of a given height
    public static void numberPyramid(){

    }

}
