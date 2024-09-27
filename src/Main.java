import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Scegli il tipo di elemento da creare (1: Audio, 2: Video, 3: Immagine): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci il titolo per 'Traccia " + (i + 1) + "': ");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci la durata per 'Traccia " + (i + 1) + "': ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume per 'Traccia " + (i + 1) + "': ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titoloAudio, durataAudio, volumeAudio);
                    elementi[i].play();
                    break;

                case 2:
                    System.out.println("Inserisci il titolo del video " + (i + 1) + ":");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci la durata del video:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume del video:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del video:");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    elementi[i].play();
                    break;

                case 3:
                    System.out.println("Inserisci il titolo dell'immagine " + (i + 1) + ":");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine:");
                    int luminositaImg = scanner.nextInt();
                    elementi[i] = new Immagine(titoloImmagine, 1, luminositaImg);
                    ((Immagine) elementi[i]).show();
                    break;

                default:
                    System.out.println("Elemento non valido");
                    i--;
                    break;
            }
        }

        System.out.println("--------MODIFICA LUMINOSITA E VOLUME DEGLI ELEMENTI GIA CREATI--------");

        boolean running = true;
        while (running) {
            System.out.println("Inserisci il numero dell'elemento da modificare (1-5) o 0 per terminare:");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Termina il programma.");
                running = false;
            } else if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elementoDaRiprodurre = elementi[scelta - 1];
                if (elementoDaRiprodurre != null) {
                    if (elementoDaRiprodurre instanceof Immagine) {
                        ((Immagine) elementoDaRiprodurre).show();
                        adjustLuminosita((Immagine) elementoDaRiprodurre, scanner);
                    } else {
                        elementoDaRiprodurre.play();
                        if (elementoDaRiprodurre instanceof Video) {
                            adjustLuminosita((Video) elementoDaRiprodurre, scanner);
                        }
                        if (elementoDaRiprodurre instanceof Video) {
                            adjustVolume((Video) elementoDaRiprodurre, scanner);
                        } else if (elementoDaRiprodurre instanceof RegistrazioneAudio) {
                            adjustVolume((RegistrazioneAudio) elementoDaRiprodurre, scanner);
                        }
                    }
                } else {
                    System.out.println("Elemento non ancora creato.");
                }
            } else {
                System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();
    }

    private static void adjustLuminosita(Video video, Scanner scanner) {
        boolean adjusting = true;
        while (adjusting) {
            System.out.println("Vuoi regolare la luminosità del video? (1: Aumenta, 2: Diminuisci, 0: Esci)");
            int sceltaLuminosita = scanner.nextInt();

            if (sceltaLuminosita == 0) {
                adjusting = false;
            } else if (sceltaLuminosita == 1) {
                video.aumentaLuminosita();
                System.out.println("Luminosità attuale: " + video.getLuminosita());
            } else if (sceltaLuminosita == 2) {
                video.diminuisciLuminosita();
                System.out.println("Luminosità attuale: " + video.getLuminosita());
            } else {
                System.out.println("Scelta non valida.");
            }
        }
    }

    private static void adjustLuminosita(Immagine immagine, Scanner scanner) {
        boolean adjusting = true;
        while (adjusting) {
            System.out.println("Vuoi regolare la luminosità dell'immagine? (1: Aumenta, 2: Diminuisci, 0: Esci)");
            int sceltaLuminosita = scanner.nextInt();

            if (sceltaLuminosita == 0) {
                adjusting = false;
            } else if (sceltaLuminosita == 1) {
                immagine.aumentaLuminosita();
                System.out.println("Luminosità attuale: " + immagine.getLuminosita());
            } else if (sceltaLuminosita == 2) {
                immagine.diminuisciLuminosita();
                System.out.println("Luminosità attuale: " + immagine.getLuminosita());
            } else {
                System.out.println("Scelta non valida.");
            }
        }
    }

    private static void adjustVolume(RegistrazioneAudio audio, Scanner scanner) {
        boolean adjusting = true;
        while (adjusting) {
            System.out.println("Vuoi regolare il volume dell'audio? (1: Aumenta, 2: Diminuisci, 0: Esci)");
            int sceltaVolume = scanner.nextInt();

            if (sceltaVolume == 0) {
                adjusting = false;
            } else if (sceltaVolume == 1) {
                audio.alzaVolume();
                System.out.println("Volume attuale: " + audio.getVolume());
            } else if (sceltaVolume == 2) {
                audio.abbassaVolume();
                System.out.println("Volume attuale: " + audio.getVolume());
            } else {
                System.out.println("Scelta non valida.");
            }
        }
    }

    private static void adjustVolume(Video video, Scanner scanner) {
        boolean adjusting = true;
        while (adjusting) {
            System.out.println("Vuoi regolare il volume del video? (1: Aumenta, 2: Diminuisci, 0: Esci)");
            int sceltaVolume = scanner.nextInt();

            if (sceltaVolume == 0) {
                adjusting = false;
            } else if (sceltaVolume == 1) {
                video.alzaVolume();
                System.out.println("Volume attuale: " + video.getVolume());
            } else if (sceltaVolume == 2) {
                video.abbassaVolume();
                System.out.println("Volume attuale: " + video.getVolume());
            } else {
                System.out.println("Scelta non valida.");
            }
        }
    }
}
