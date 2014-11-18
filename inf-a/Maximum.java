package maximum;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int maximum = input;
        
        while(input != -1) {
            input = in.nextInt();
            if (input > maximum) {
               maximum = input; 
            }
        }
        
        if (maximum != -1) {
            System.out.println("Max number: " + maximum);
        }
    }
    
}
