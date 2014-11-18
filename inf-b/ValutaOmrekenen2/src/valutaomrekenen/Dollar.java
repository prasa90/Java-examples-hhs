package valutaomrekenen;

public class Dollar extends Valuta {

    public Dollar() {
        koers = 0.08;
    }
    
    public Dollar(double bedrag) {
        this();
        this.bedrag = bedrag;
    }
    
    public Dollar convert_from_euro(Euro euros) {
        double newValue = convert(euros.bedrag);
        this.bedrag = newValue;
        return this;
    }
}
