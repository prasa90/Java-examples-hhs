package stirngsandarrays;

import java.util.Scanner;

public class StirngsAndArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        String word3 = in.next();
        
        while(word1.length() < 3 || word2.length() < 3 || word3.length() < 3 ) {
            word1 = in.next();
            word2 = in.next();
            word3 = in.next();    
        }
        
        String[] wordsArray = {word1, word2, word3};
        
        int keuze = in.nextInt();
        
        switch (keuze) {
            case 1:
                if (word1.length() > word2.length() && word1.length() > word3.length()) {
                    System.out.println(word1);
                } else if (word2.length() > word3.length()) {
                    System.out.println(word2);
                } else {
                    System.out.println(word3);
                }
                break;
            case 2:
                System.out.println(wordsArray[0]);
                break;
            case 3:
                System.out.println(wordsArray[2]);
                break;
        }
    }
}
