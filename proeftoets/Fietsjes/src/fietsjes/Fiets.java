package fietsjes;

public class Fiets {
    private int frameHoogte;
    private Wiel voorwiel;
    private Wiel achterwiel;
    
    public Fiets(int frame) {
       frameHoogte = frame;
       voorwiel = new Wiel();
       achterwiel = new Wiel();
    }
    
    public void toonFramehoogte() {
        System.out.println(frameHoogte);
        voorwiel.toonDiameter();
        achterwiel.toonDiameter();
    }
    
    public int toonAantalWielen() {
        return 2;
    }
}
