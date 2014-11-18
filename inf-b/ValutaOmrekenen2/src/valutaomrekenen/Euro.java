package valutaomrekenen;

public class Euro extends Valuta {
    
    public Euro() {
        koers = 1.12;
    }
    
    public Euro(double bedrag) {
        this();
        this.bedrag = bedrag;
    }
    
    public Euro convert_from_dollar(Dollar dollars) {
        double newValue = convert(dollars.bedrag);
        this.bedrag = newValue;
        return this;
    }
}
