package numbers;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        
        while(number1 < 2 || number2 < 2) {
            number1 = in.nextInt();
            number2 = in.nextInt();
        }
        
        if (number2 > number1*2) {
            System.out.println("Het tweede getal is groter dan 2 keer het eerste getal");
        }
        
        int kleinste = Math.min(number1, number2);
        int grootste = Math.max(number1, number2);
        
        if (grootste % kleinste == 0) {
            System.out.println("veelvoud");
        }
    }
    
}
