package countingmatches;

import java.util.Scanner;

public class CountingMatches {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int counter = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isUpperCase(character)) {
                counter++;
            }
        }
        
        System.out.println("Number of capitals: " + counter);
    }
    
}
