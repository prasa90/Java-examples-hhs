package valutaomrekenen;

public abstract class Valuta {
    public double koers;
    public double bedrag;
    
    public double convert(double value) {
        return value*koers;
    }
}
