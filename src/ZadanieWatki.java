
public class ZadanieWatki {

    public static void tworzWatki() {
        TworzenieWatkow[] tab = new TworzenieWatkow[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = new TworzenieWatkow("Watek" + i);
            tab[i].start();
        }
    }
  

}
