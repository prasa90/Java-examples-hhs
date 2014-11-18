package valutaomrekenen;

public class Valuta {
    public double koers;
    
    public double convert(double value) {
        return value*koers;
    }
}
