package valutaomrekenen;

public class ValutaOmrekenen {

    public static void main(String[] args) {
        
        Euro euros     = new Euro(2);
        Dollar ConvertedFromEuro  = new Dollar();
        ConvertedFromEuro.convert_from_euro(euros);
        System.out.println("2 euro in dollars:" + ConvertedFromEuro.bedrag);
        
        Dollar dollars = new Dollar(5);
        Euro ConvertedFromDollar = new Euro();
        ConvertedFromDollar.convert_from_dollar(dollars);
        System.out.println("5 dollar in euros:" + ConvertedFromDollar.bedrag);
    }
    
}
