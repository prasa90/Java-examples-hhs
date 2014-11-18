package powertable;

public class PowerTable {

    public static void main(String[] args) {
        
        for (int i = 0; i < 20; i++) {
            System.out.print(i+"\t");
            for (int j = 2; j < 10; j++) {
                if (i == 0) {
                    System.out.print(j+"\t");    
                } else {
                    System.out.print(Math.pow(i,j)+"\t");
                }
            }
            System.out.println();
        }
    }
    
}
