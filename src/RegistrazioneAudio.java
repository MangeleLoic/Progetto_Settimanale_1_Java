public class RegistrazioneAudio extends ElementoMultimediale {
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo, durata);
        this.volume = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
        String titolo = super.getTitolo();
        int durata = super.getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    public void alzaVolume() {
        volume++;
        String titolo = super.getTitolo();
        int durata = super.getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }


    @Override
    public void play() {
        String titolo = super.getTitolo();
        int durata = super.getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}

