public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio audio1 = new RegistrazioneAudio("Traccia 1", 5, 7);

        RegistrazioneAudio audio2 = new RegistrazioneAudio("Traccia 2", 3);

        System.out.println("Sta riproducendo: ");
        audio1.play();

        System.out.println("Sta riproducendo::");
        audio2.play();



    }
}
