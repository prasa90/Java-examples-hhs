package valutaomrekenen;

public class ValutaOmrekenen {

    public static void main(String[] args) {
        Euro euros     = new Euro();
        Dollar dollars = new Dollar();
        System.out.println("5 dollar in euros:" + euros.convert(5));
        System.out.println("7 euro in dollars:" + dollars.convert(7));
    }
    
}
