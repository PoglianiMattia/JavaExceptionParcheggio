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
        int index = 0;
        long secondi;
        for (Macchina macchina : parcheggio) {
            if (macchina != null) {
                System.out.println("In posizione " + index + " veicolo " + macchina.getTarga() +
                        " al timestamp " + macchina.getIngresso().getTime());
                if (macchina.getTarga().equals(exit)) {
                    macchina.setUscita(System.currentTimeMillis());
                    secondi = ( macchina.getUscita().getTime() - macchina.getIngresso().getTime())/1000;
                    System.out.println("sono passati " + secondi);
                    break;
                }
                index += 1;
            }
        }
        parcheggio[index]=null;
    }
}