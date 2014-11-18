package throwdice;

public class ThrowDice {

    public static void main(String[] args) {
        double rand = 0;
        for (int i = 0; i < 100; i++) {
            rand = Math.random();
            int dice1 = (int) (rand * 6+1);
            rand = Math.random();
            int dice2 = (int) (rand * 6+1);
            System.out.println(dice1 + " " + dice2);
        }
    }
    
}

