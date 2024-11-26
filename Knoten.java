public class Knoten extends Listenelement {
    private Listenelement naechster;
    private Datenelement inhalt;

    public Knoten(Listenelement naechsterKnoten, Datenelement neuerInhalt){
        inhalt = neuerInhalt;
        naechster = naechsterKnoten;
    }
    
    public int getAnzahl(){
        return naechster.getAnzahl() + 1;
    }
    
    public Listenelement hintenEinfuegen(Datenelement neuerInhalt){
         naechster = naechster.hintenEinfuegen(neuerInhalt);
         return this;
    }
    
    public Listenelement getNext(){
        return naechster;
    }
    
    public void setNext(Listenelement naechsterKnoten){
        naechster=naechsterKnoten;
    }
    
    public Datenelement getInhalt(){
        return inhalt;
    }

    public void informationAusgeben(){
        inhalt.informationAusgeben();
        naechster.informationAusgeben();
    }
}
