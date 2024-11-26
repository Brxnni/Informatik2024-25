public abstract class Listenelement {
    abstract int getAnzahl();
    abstract Listenelement hintenEinfuegen(Datenelement neuerInhalt);
    abstract Listenelement getNext();
    abstract void setNext(Listenelement naechsterKnoten);
    abstract Datenelement getInhalt();
    abstract void informationAusgeben();
}
