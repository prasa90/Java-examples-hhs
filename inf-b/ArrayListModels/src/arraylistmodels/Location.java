package arraylistmodels;

public class Location {
    public String naam;
    public int lengtegraad;
    public int breedtegraad;
    public String werelddeel;
    
    public Location(String n, int x, int y, String w) {
        naam         = n;
        lengtegraad  = x;
        breedtegraad = y;
        werelddeel   = w;
    }
}
