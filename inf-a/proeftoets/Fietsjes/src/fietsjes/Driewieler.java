package fietsjes;

public class Driewieler extends Fiets {
    private Wiel derdewiel;
    
    public Driewieler() {
       super(55);
       derdewiel = new Wiel();
    }
    
    public int toonAantalWielen() {
        int aantalWielen = super.toonAantalWielen();
        return aantalWielen+1;
    }
}
