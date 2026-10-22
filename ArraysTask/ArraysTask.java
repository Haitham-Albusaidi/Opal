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




        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Difference: " + diff);



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

}
