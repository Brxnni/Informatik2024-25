public class Abschluss extends Listenelement {
    public Abschluss(){
    }

    public int getAnzahl(){
        return 0;
    }
    
    public Listenelement hintenEinfuegen(Datenelement neuerInhalt){
        return new Knoten(this,neuerInhalt);
    }

    public Listenelement getNext(){
        return this;
    }
    
    public void setNext(Listenelement naechsterKnoten){
    }
    
    public Datenelement getInhalt(){
        return null;
    }

    public void informationAusgeben(){
    }
}
