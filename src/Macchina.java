import java.sql.Timestamp;

public class Macchina {
    private String targa;
    Timestamp ingresso, uscita;

    public Macchina(String targa, long ingresso) {
        this.targa = targa;
        this.ingresso = new Timestamp(ingresso);
        System.out.println("Ingresso veicolo " + targa + " al timestamp " + this.ingresso.getTime());
    }

    public void setUscita(Timestamp uscita) {
        this.uscita = uscita;
    }

    public String getTarga() {
        return targa;
    }

    public Timestamp getIngresso() {
        return ingresso;
    }

    public Timestamp getUscita() {
        return uscita;
    }
}
