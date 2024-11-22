package veicoli;

public class Oficina {
    public String ripara (Veicolo v){
        int costoRiparazione = 0;
        if (v instanceof Vettura){ costoRiparazione = 250;}
        else if (v instanceof Motociclo){ costoRiparazione = 150;}
        else{ costoRiparazione = 100; }

        if ( v.isGuasto()){
            costoRiparazione = costoRiparazione * 3;
            v.setGuasto(false);
            return "Il veicolo era guasto, Il costo di riparazione è di: " + costoRiparazione + "€";
        }
        else{ return "Il veicolo non era guasto, il prezzo del controllo è di: " + costoRiparazione + "€"; }


    }




}
