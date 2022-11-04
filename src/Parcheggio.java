public class Parcheggio {
    private Macchina parcheggio[];

    public Parcheggio() {
        parcheggio = new Macchina[10];
    }
    public void aggiungiMacchina(Macchina m, int posizione){
        parcheggio[posizione] = m;
    }

    public long rimuoviMacchina(String targa){
        long secondi = 0;
        int i;
        for (i = 0; i < parcheggio.length; i++) {
            if (parcheggio[i] != null) {
                System.out.println("In posizione " + i + " veicolo " + parcheggio[i].getTarga() +
                        " al timestamp " + parcheggio[i].getIngresso().getTime());
                if (parcheggio[i].getTarga().equals(targa)) {
                    parcheggio[i].setUscita(System.currentTimeMillis());
                    secondi = (parcheggio[i].getUscita().getTime() - parcheggio[i].getIngresso().getTime()) / 1000;
                    break;
                }
            }
        }
        parcheggio[i] = null;
        return secondi;
    }
}
