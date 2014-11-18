package fietsjes;

public class Fietsjes {

    public static void main(String[] args) {
        Fiets f = new Fiets();
        f.toonFramehoogte();
        f.toonAantalWielen();
        
        Driewieler d = new Driewieler();
        d.toonAantalWielen();
    }
    
}