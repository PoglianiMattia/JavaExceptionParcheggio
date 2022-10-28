import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner tastiera = new Scanner(System.in);

        Macchina parcheggio[] = new Macchina[10];

        System.out.println("inserire targa");
        parcheggio[0]= new Macchina(tastiera.next(), System.currentTimeMillis());
    }
}