import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner tastiera = new Scanner(System.in);

        Parcheggio p = new Parcheggio();

        System.out.println("inserire targa");
        p.aggiungiMacchina(new Macchina(tastiera.next(),
                System.currentTimeMillis()), 0);

        System.out.println("inserire targa");
        p.aggiungiMacchina(new Macchina(tastiera.next(),
                System.currentTimeMillis()), 1);

        System.out.println("inserire targa");
        p.aggiungiMacchina(new Macchina(tastiera.next(),
                System.currentTimeMillis()), 2);

        System.out.println("che macchina vuoi far uscire");
        long secondi = p.rimuoviMacchina(tastiera.next());
        System.out.println("sono passati " + secondi);
    }
}