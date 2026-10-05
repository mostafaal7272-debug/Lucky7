import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) {
        Random random = new Random();
        int rahat = 5;

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
        }
        System.out.println("Rahat loppuivat. Peli päättyy.");
    }
}
