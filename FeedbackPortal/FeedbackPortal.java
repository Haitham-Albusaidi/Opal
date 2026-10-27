package FeedbackPortal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FeedbackPortal {
    static String[] names = new String[100];
    static int[] ratings = new int[100];
    static String[] comments = new String[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    

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

    public static void loadFeedback(){
        System.out.println("--------------------");
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Haitham\\tt\\Opal\\FeedbackPortal\\feedback.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            names[count] = parts[0];
            ratings[count] = Integer.parseInt(parts[1]);
            comments[count] = parts[2];
            count++;
        }
        System.out.println("Feedback Loaded");
        }catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
        }
    }

    public static void saveFeedback(){
        System.out.println("--------------------");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Haitham\\tt\\Opal\\FeedbackPortal\\feedback.txt"))) {
            for (int i = 0; i < count; i++) {
                writer.write(names[i] + "|" + ratings[i] + "|" + comments[i]);
                writer.newLine();
            }
            System.out.println("Feedback Saved");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void addFeedback(){
        System.out.println("--------------------");
        
            System.out.print("Enter your name: ");
            String name = sc.next();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter your name.");
                return;
            }
            System.out.print("Enter your rating (1-5): ");
            int rating = numinput();
            if (rating < 1 || rating > 5) {
                System.out.println("Invalid rating. Please enter a number between 1 and 5.");
                return;
            }
            System.out.print("Enter your comment: ");
            String comment = sc.next();
            if (comment.isEmpty()) {
                System.out.println("Comment cannot be empty. Please enter your comment.");
                return;
            }

            names[count] = name;
            ratings[count] = rating;
            comments[count] = comment;
            count++;
        }
    
    public static void showAllFeedback(){
        System.out.println("--------------------");
        if (count == 0) {
            System.out.println("No feedback available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(i + ". "+"Name: " + names[i] + " | Rating: " + ratings[i]+ " | Comment: " + comments[i]);
            System.out.println("--------------------");
        }
    }

    public static double showAverageRating() {
        System.out.println("--------------------");
        if (count == 0) {
            System.out.println("No feedback available.");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ratings[i];
        }
        double average = (double) sum / count;
        System.out.println("Average rating: " + average);
        return average;
    }

    public static void searchByRating() {
        System.out.println("--------------------");
        System.out.print("Enter rating to search for: ");
        int ratingg = numinput();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (ratings[i] == ratingg) {
                System.out.println("Name: " + names[i] + " | Rating: " + ratings[i] + " | Comment: " + comments[i]);
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No feedback found with rating " + ratingg);
        }
    }
    
    public static void deleteFeedback() {
        System.out.println("--------------------");
        showAllFeedback();
        System.out.print("Enter the number of the feedback to delete: ");
        int delete = numinput();
        if (delete <1 || delete >count)
        {
            System.out.println("Out of bound");
            return;
        }
            for (int j = delete ; j<count -1; j++){
                names[j] = names[j+1];
                ratings[j] = ratings[j+1];
                comments[j] = comments[j+1];
                }
                count --;
    }

    public static void menu(){
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("--------------------");
            System.out.println("Welcome to the ATM App");
            System.out.println("Please select an option:");
            System.out.println("1. Add feedback");
            System.out.println("2. Show all feedback");
            System.out.println("3. Show average rating");
            System.out.println("4. Search by rating");
            System.out.println("5. Delete feedback");
            System.out.println("6. Save to file");
            System.out.println("7. Save and exit");
            System.out.print("Enter your choice: ");
            int choice = numinput();
            switch (choice) {
                case 1:
                    addFeedback();
                    break;
                case 2:
                    showAllFeedback();
                    break;
                case 3:
                    showAverageRating();
                    break;
                case 4:
                    searchByRating(); 
                    break;
                case 5:
                    deleteFeedback();
                    break;
                case 6:
                    saveFeedback();
                    break;
                case 7:
                    saveFeedback();
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } 
    }
    
    public static void main(String[] args) {
        loadFeedback();
        menu();
    }
    
}