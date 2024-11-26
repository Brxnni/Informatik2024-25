public class Stapel {
    private Listenelement erster;

    public Stapel(){
        erster = new Abschluss();
    }

    public void einfuegen(Datenelement neuerInhalt){
        Listenelement temp = new Knoten(erster, neuerInhalt);
        erster = temp;
    }
    
    public Listenelement entnehmen(){
        Listenelement temp = erster;
        erster = erster.getNext();
        temp.setNext(null);
        return temp;
    }

    public int getAnzahl(){
        return erster.getAnzahl();
    }
    
    public boolean istLeer(){
        return (getAnzahl() == 0);
    }
    
    public void zeigeListe(){
        erster.informationAusgeben();
    }
}