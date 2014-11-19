package arraylists;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
       ArrayList<Integer> lijstje = 
                new ArrayList<Integer>();
       
       lijstje.add(3);
       lijstje.add(5);
       lijstje.add(7);
       
       for (int i=0; i < lijstje.size(); i++) {
           lijstje.set(i, lijstje.get(i)+1);
           System.out.println(lijstje.get(i));
       }
       
    }
    
}
