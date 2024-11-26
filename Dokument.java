public class Dokument extends Datenelement {
    private String name;
    private int anzahl;
    
    public Dokument(String neuername){
        name = neuername;
        anzahl = 1;
    }

    public Dokument(String neuername, int neueanzahl){
        name = neuername;
        anzahl = neueanzahl;
    }

    public void setName(String neuerName){
        name = neuerName;
    }

    public String getName(){
        return name;
    }
    
    public void setAnzahl(int neueanzahl){
        anzahl = neueanzahl;
    }

    public int getAnzahl(){
        return anzahl;
    }

    public void informationAusgeben(){
        System.out.print(name);
        System.out.print(" (");
        System.out.print(anzahl);
        System.out.println(" Seiten)");
    }
}