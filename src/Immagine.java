public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int durata, int luminosita) {
        super(titolo, durata);
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        System.out.println("Visualizzazione immagine: " + getTitolo());
    }

    public int getLuminosita() {
        return luminosita;
    }


    public void show() {
        String titolo = super.getTitolo();
        int durata = super.getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "*".repeat(luminosita));
        }
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
}

