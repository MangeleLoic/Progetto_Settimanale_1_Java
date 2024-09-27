import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il titolo per 'Traccia 1': ");
        String titoloAudio1 = scanner.nextLine();

        System.out.println("Inserisci la durata per 'Traccia 1': ");
        int durataAudio1 = scanner.nextInt();

        System.out.println("Inserisci il volume per 'Traccia 1': ");
        int volumeAudio1 = scanner.nextInt();

        RegistrazioneAudio audio1 = new RegistrazioneAudio(titoloAudio1, durataAudio1, volumeAudio1);


        System.out.println("Sta riproducendo 'Traccia 1':");
        audio1.play();


        scanner.nextLine();
        System.out.println("Inserisci il titolo per 'Traccia 2': ");
        String titoloAudio2 = scanner.nextLine();

        System.out.println("Inserisci la durata per 'Traccia 2': ");
        int durataAudio2 = scanner.nextInt();

        System.out.println("Inserisci il volume per 'Traccia 2': ");
        int volumeAudio2 = scanner.nextInt();


        RegistrazioneAudio audio2 = new RegistrazioneAudio(titoloAudio2, durataAudio2, volumeAudio2);


        System.out.println("Sta riproducendo 'Traccia 2' :");
        audio2.play();


        scanner.nextLine();
        System.out.println("Inserisci il titolo del video:");
        String titoloVideo = scanner.nextLine();

        System.out.println("Inserisci la durata del video:");
        int durataVideo = scanner.nextInt();

        System.out.println("Inserisci il volume del video:");
        int volumeVideo = scanner.nextInt();

        System.out.println("Inserisci la luminosità del video:");
        int luminositaVideo = scanner.nextInt();


        Video video = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);


        System.out.println("Sta riproducendo il video:");
        video.play();


        scanner.close();
    }
}
