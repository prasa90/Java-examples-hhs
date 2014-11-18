package checkvalue;

import java.util.Scanner;

public class CheckValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        
        System.out.println("Enter a value below 100: ");
        do {
            input = in.nextInt();
        } while(input >= 100);
        
        System.out.println("Input is" + input);
    }
    
}
