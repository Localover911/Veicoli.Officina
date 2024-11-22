package veicoli;

public class UsaOfficina {
    public static void main(String[] args) {
        Veicolo [] veicoli=new Veicolo[6];

        //6 veicoli a scelta
        veicoli[0]=new Vettura("GJ240JN","Opel","Zafira A",false,"Monovolume");
        veicoli[1]=new Vettura("ER164NA","Fiat","Panda Young",false,"Utilitaria");
        veicoli[2]=new Vettura("DD029YJ","Vauxahll","Viva Rocks",false,"Utilitaria");
        veicoli[3]=new Motociclo("JJ78906","Piaggio Vespa","Primavera",false,125);
        veicoli[4]=new Motociclo("MS34567","Piaggio Vespa","GTV",false,125);
        veicoli[5]=new Motociclo("AB12345","Piaggio Vespa","946 Dragon",false,125);
        Oficina off = new Oficina();
        veicoli[0].setGuasto(true);
        veicoli[3].setGuasto(true);
        veicoli[5].setGuasto(true);

        System.out.println( off.ripara(veicoli[0]) );
        System.out.println( off.ripara(veicoli[1]) );
        System.out.println( off.ripara(veicoli[2]) );
        System.out.println( off.ripara(veicoli[3]) );
        System.out.println( off.ripara(veicoli[4]) );
        System.out.println( off.ripara(veicoli[5]) );


    }
}
