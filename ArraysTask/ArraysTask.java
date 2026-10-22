package ArraysTask;

import java.util.Scanner;

public class ArraysTask {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = {12, 7, 25, 3, 18, 9, 30, 14};

        int sum = sumArray(numbers);
        double average = averageArray(numbers);
        int max = findMax(numbers);
        int min = findMin(numbers);
        int diff = (findMax(numbers)-findMin(numbers));
        int even = countEven(numbers);
        int[]newarr = reverseArray(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Difference: " + diff);
        System.out.println("Even Numbers: " + even);

        System.out.print("Enter a number to search for: "); 
        int num = 0;
        int index = 0;
        boolean isValid = false;
        try{num = sc.nextInt(); isValid = true;}
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");}
        
        if (isValid ){
            index = indexOf(numbers, num);
            if(index != -1){
            
            System.out.println(num+" found at index: " + index);
            }
            else{
                System.out.println(num + " not found");
            }
        }
        
        System.out.print("Original: " ); printArray(numbers);
        System.out.println();
        System.out.print("Reversed: "); printArray(newarr);
        System.out.println();
        
        System.out.print("How many grades Do you want enter? ");
        int num2 =0;
        boolean isValid2 = false;
        int[] gradess = null;
        try{num2 = sc.nextInt(); isValid2 = true;}
        catch(Exception e) {System.out.println("Invalid input. Please enter a number.");}
        if (isValid2 ){
            gradess = readGrades(num2);
            int passedCount = countPassed(gradess);
            int failedCount = gradess.length - passedCount;
            System.out.println("Passed: " + passedCount);
            System.out.println("Failed: " + failedCount);
        }
        



    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            
            sum += arr[i];
        }
        return sum;
    }

    static double averageArray(int[] arr){
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }


    static int findMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max){
            max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr){
        int min = 999999;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min){
            min = arr[i];
            }
        }
        return min;
    }
    static int countEven(int[] arr){
        int even = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0){
            even++;
            }
        }
        return even;
    }

    static int indexOf(int[] arr, int target){
        
        for (int i = 0; i < arr.length; i++)
        {
            
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int[] reverseArray(int[] arr){
        int[] newarrey = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newarrey[i] = arr[arr.length-1-i];
        }
        return newarrey;
    }


    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static int[] readGrades(int size){
        int [] grades = new int[size];

        for(int i = 0 ; i<grades.length ; i++){
            System.out.println("Enter grade "+(i+1));

            try{grades[i] = sc.nextInt();}
            catch(Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                    i--;
                }
            if(grades[i]<0 || grades[i]>100){
                System.out.println("Invalid input. Please enter a number between 0 and 100.");
                i--;
            }
        }
        return grades;
    }

    static int countPassed(int[] grades){
        int passed = 0;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] >= 50){
            passed++;
            }
        }
        return passed;
    }

}
