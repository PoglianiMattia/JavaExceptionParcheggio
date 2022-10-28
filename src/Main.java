import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner tastiera = new Scanner(System.in);

        Macchina parcheggio[] = new Macchina[10];

        System.out.println("inserire targa");
        parcheggio[0] = new Macchina(tastiera.next(),
                System.currentTimeMillis());
        System.out.println("inserire targa");
        parcheggio[1] = new Macchina(tastiera.next(),
                System.currentTimeMillis());
        System.out.println("inserire targa");
        parcheggio[2] = new Macchina(tastiera.next(),
                System.currentTimeMillis());

        System.out.println("che macchina vuoi far uscire");
        String exit = tastiera.next();
        long secondi;
        int i;
        for (i = 0; i < parcheggio.length; i++) {
            if (parcheggio[i] != null) {
                System.out.println("In posizione " + i + " veicolo " + parcheggio[i].getTarga() +
                        " al timestamp " + parcheggio[i].getIngresso().getTime());
                if (parcheggio[i].getTarga().equals(exit)) {
                    parcheggio[i].setUscita(System.currentTimeMillis());
                    secondi = (parcheggio[i].getUscita().getTime() - parcheggio[i].getIngresso().getTime()) / 1000;
                    System.out.println("sono passati " + secondi);
                    break;
                }
            }
        }
        parcheggio[i] = null;
    }
}