public class Schreibtisch {
    private Stapel eingangskorb;
    
    public Schreibtisch(){
        eingangskorb = new Stapel();
    }
    
    public void fuelleEingangskorb(){
        Datenelement d1 = new Dokument("Rundschreiben", 3);
        Datenelement d2 = new Dokument("Scheiﬂzeitung", 4);
        Datenelement d3 = new Dokument("Rechnung", 1);
        Datenelement d4 = new Dokument("Mahnung", 2);
        
        eingangskorb.einfuegen(d1);
        eingangskorb.einfuegen(d2);
        eingangskorb.einfuegen(d3);
        eingangskorb.einfuegen(d4);
       
        eingangskorb.zeigeListe();
        System.out.println("_____________________________________________________");
    }
    
    public void neuerEingang(String titel, int seitenZahl){
        Datenelement d = new Dokument(titel, seitenZahl);
        eingangskorb.einfuegen(d);
    }

    public void bearbeiteEingang(){
        Listenelement temp = eingangskorb.entnehmen();
        if (temp == null){
            return;
        }
        System.out.println(temp.getInhalt().getName() + " wird bearbeitet.");
    }
    
    public void statusEingangskorb(){
        System.out.println(eingangskorb.istLeer() ? "Alles fertig!" : "Die Arbeit wartet!");
    }

    public void anzahlEingaenge(){
        System.out.println("Es liegen noch " + eingangskorb.getAnzahl() + " Dokumente auf dem Schreibtisch.");
    }
    
    public void anzeigeEingangskorbStapel(){
        eingangskorb.zeigeListe();
    }
}
