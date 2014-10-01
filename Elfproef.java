package elfproef;

import java.util.Scanner;

public class Elfproef {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bankNumber = in.nextInt();
        int sum = 0;
        int multiplier = 1;
        while (bankNumber > 0) {
            int digit = bankNumber % 10;
            sum = sum + (digit * multiplier);
            bankNumber = bankNumber / 10;
            multiplier++;
        }
        
        if (sum > 0 && sum % 11 == 0) {
            System.out.println("This is a valid number");
        } else {
            System.out.println("This is not a valid number");
        }
    }
    
}
