import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) {
        Random random = new Random();

        // nextInt(10) antaa luvun 0–9; lisäämällä yhden saadaan 1–10.
        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int numero3 = random.nextInt(10) + 1;

        System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

        if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
            System.out.println("Voitit!");
        } else {
            System.out.println("Hävisit.");
        }
    }
}
