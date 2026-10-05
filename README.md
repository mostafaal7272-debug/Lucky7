# Lucky7

Java-harjoitus: kolme numeroa arvotaan väliltä 1–10. Pelaaja valitsee aloitusrahat, ja kierros maksaa euron. Yksi seitsemän tuo 3 €, kaksi 5 € ja kolme 7 €. Peli päättyy, kun rahat loppuvat tai pelaaja valitsee lopetuksen.

## Käynnistys

Avaa tämän kansion terminaali ja suorita:

```text
javac -d bin src/Lucky7.java
java -cp bin Lucky7
```

Ohjelma kysyy ensin aloitusrahat kokonaisina euroina. Kunkin kierroksen jälkeen Enter jatkaa peliä ja `e` lopettaa. Esimerkiksi 5 € aloitusrahalla ja numerot 7, 2, 7: kierros vie 1 €, kaksi seiskaa tuo 5 €, joten saldo on 9 €.

Lähdekoodi on tiedostossa `src/Lucky7.java`. Käännetyt `.class`-tiedostot syntyvät `bin`-kansioon, jota ei lisätä GitHubiin. Git-historiassa on kolme tehtävän vaiheita kuvaavaa committia.
