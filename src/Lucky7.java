import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random arpoja = new Random();

        System.out.print("Paljonko rahaa haluat pelata? ");
        int rahat = lukija.nextInt();
        lukija.nextLine();

        while (rahat > 0) {
            rahat = rahat - 1;

            int numero1 = arpoja.nextInt(10) + 1;
            int numero2 = arpoja.nextInt(10) + 1;
            int numero3 = arpoja.nextInt(10) + 1;
            System.out.println("Numerot: " + numero1 + " " + numero2 + " " + numero3);

            int seiskat = 0;
            if (numero1 == 7) seiskat++;
            if (numero2 == 7) seiskat++;
            if (numero3 == 7) seiskat++;

            if (seiskat == 1) {
                rahat = rahat + 3;
                System.out.println("Voitit 3 euroa!");
            } else if (seiskat == 2) {
                rahat = rahat + 5;
                System.out.println("Voitit 5 euroa!");
            } else if (seiskat == 3) {
                rahat = rahat + 7;
                System.out.println("Voitit 7 euroa!");
            } else {
                System.out.println("Ei voittoa.");
            }

            System.out.println("Rahaa jäljellä: " + rahat + " euroa");
            if (rahat > 0) {
                System.out.print("Pelataanko uudestaan? Enter = kyllä, e = ei: ");
                String vastaus = lukija.nextLine();
                if (vastaus.equals("e")) {
                    break;
                }
            }
        }

        System.out.println("Peli loppui.");
    }
}
