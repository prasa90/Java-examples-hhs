package firstmatch;

import java.util.Scanner;

public class FirstMatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char first;
        int i = 0;
        boolean found = false;
        
        while (!found && i < input.length()) {
            char character = input.charAt(i);
            if (Character.isUpperCase(character)) {
                first = character;
                found = true;
            }
            i++;
        }
    }
    
}
