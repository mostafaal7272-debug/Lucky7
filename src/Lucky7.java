import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner lukija = new Scanner(System.in);
        int rahat;

        while (true) {
            System.out.print("Paljonko rahaa otat mukaan (vähintään 1 €)? ");
            if (!lukija.hasNextLine()) return;
            try {
                rahat = Integer.parseInt(lukija.nextLine().trim());
                if (rahat >= 1) break;
            } catch (NumberFormatException virhe) {
                // Kysytään uudelleen, jos syöte ei ole kokonaisluku.
            }
            System.out.println("Anna positiivinen kokonaisluku.");
        }

        while (rahat >= 1) {
            rahat--; // Yksi kierros maksaa yhden euron.
            int numero1 = random.nextInt(10) + 1;
            int numero2 = random.nextInt(10) + 1;
            int numero3 = random.nextInt(10) + 1;

            System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

            int seiskat = 0;
            if (numero1 == 7) seiskat++;
            if (numero2 == 7) seiskat++;
            if (numero3 == 7) seiskat++;

            if (seiskat > 0) {
                int voitto = 2 * seiskat + 1; // 1 → 3 €, 2 → 5 €, 3 → 7 €.
                rahat += voitto;
                System.out.println("Voitit " + voitto + " €!");
            } else {
                System.out.println("Hävisit.");
            }
            System.out.println("Rahaa jäljellä: " + rahat + " €\n");

            if (rahat == 0) {
                System.out.println("Rahat loppuivat. Peli päättyy.");
                return;
            }

            while (true) {
                System.out.print("Haluatko pelata uudestaan? Enter = kyllä, e = lopeta: ");
                if (!lukija.hasNextLine()) return;
                String vastaus = lukija.nextLine().trim();
                if (vastaus.isEmpty()) break;
                if (vastaus.equalsIgnoreCase("e")) {
                    System.out.println("Kiitos pelaamisesta! Rahaa jäi " + rahat + " €.");
                    return;
                }
                System.out.println("Paina Enter jatkaaksesi tai kirjoita e lopettaaksesi.");
            }
        }
    }
}
