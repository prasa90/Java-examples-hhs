package calculateavarage;

import java.util.Scanner;

public class CalculateAvarage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int count = 0;
        boolean notFound = true;
        while (notFound) {
            if (in.hasNextInt()) {
                input = in.nextInt();
                sum += input;
                count++;
            } else {
                notFound = false;
            }
        }
        
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average:" + average);
        } else {
            System.out.println("invalid input");
        }
    }
    
}
