public class Video extends ElementoMultimediale {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public Video(String titolo, int durata) {
        super(titolo, durata);
        this.volume = 5;
        this.luminosita = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        if (luminosita < 10) {
            luminosita++;
            System.out.println("Luminosità aumentata a: " + luminosita);
        } else {
            System.out.println("Luminosità già al massimo.");
        }
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
            System.out.println("Luminosità diminuita a: " + luminosita);
        } else {
            System.out.println("Luminosità già al minimo.");
        }
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }


    @Override
    public void play() {
        String titolo = super.getTitolo();
        int durata = super.getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
    }
}
