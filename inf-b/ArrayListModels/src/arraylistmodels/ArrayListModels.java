package arraylistmodels;

import java.util.ArrayList;

public class ArrayListModels {

    public static void main(String[] args) {
        Location L1 = new Location("Nederland", 1,   1, "Europa");
        Location l2 = new Location("USA",       100, 1, "Amerika");
        Location l3 = new Location("Belgie",    1,   2, "Europa");
        
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(L1);
        locations.add(l2);
        locations.add(l3);
        
        for(int i = 0; i < locations.size(); i++) {
            if (locations.get(i).breedtegraad == 1) {
                System.out.println(locations.get(i).naam);
            }
        }
    }
    
}
