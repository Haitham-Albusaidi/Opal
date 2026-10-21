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
        

    }

    // Method to calculate the factorial of a number.
    public static void factorial() {

    }
    // Method to generate a multiplication table for a given number 
    public static void multiplicationTable() {
        
        }
    

    // Method to print a star triangle of a given height
    public static void starTriangle() {
        
        
    }
    // Method to check if a number is prime
    public static void isPrime(){

    }
    // Method to reverse a number
    public static void reverseNumber(){

    }
    // Method to print a number pyramid of a given height
    public static void numberPyramid(){

    }

}
