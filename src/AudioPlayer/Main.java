package AudioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        System.out.println(filePaths.length);

        // How to play audio with Java (.wav, .au, .aiff)
//        ArrayList<String> songList = new ArrayList<>();
//        String filePath = "src\\AudioPlayer\\Tracks\\Jungle Trip - Quincas Moreira.wav";
//        String filePath2 = "src\\AudioPlayer\\Tracks\\O Canto Do Galo - Quincas Moreira.wav";
//        File file = new File(filePath);
//        File file2 = new File(filePath2);

        File tracksFolder = new File("src\\AudioPlayer\\Tracks");
        File[] filePaths = tracksFolder.listFiles();
        int presentSong = 0;

        try(Scanner scanner = new Scanner(System.in)) {
            assert filePaths != null;
            try(AudioInputStream stream = AudioSystem.getAudioInputStream(filePaths[presentSong])){
    //            System.out.println(stream2);
                Clip clip = AudioSystem.getClip();
                clip.open(stream);
                boolean isON = true;
                char choice;


                System.out.println("""
                        *****************************
                        Welcome to the Audio Player
                        *****************************
                        """);

                while (isON){
                    System.out.print("""
                            *****************************
                            Choose an action from the
                            following list:
                            *****************************
                            """);
                    System.out.println("""
                            P = Play
                            S = Stop
                            R = Reset
                            Q = Quit
                            F = Forward
                            B = Backward
                            L = List of Songs
                            C = Choose song
                            """);

                    System.out.print("Type in your choice: ");
                    choice = scanner.next().toUpperCase().charAt(0);

                    switch (choice){
                        case 'P' -> clip.start();
                        case 'S' -> clip.stop();
                        case 'R' -> clip.setMicrosecondPosition(0);
                        case 'Q' -> {
                            clip.close();
                            isON = false;
                        }
                        case 'F' -> {
                            clip.close();
                            if (presentSong < filePaths.length - 1){
                                ++presentSong;
                            }

                            AudioInputStream nextStream = AudioSystem.getAudioInputStream(filePaths[presentSong]);
                            clip.open(nextStream);
                            clip.start();
                        }
                        case 'B' -> {
                            clip.close();
                            if (presentSong > 0){
                                --presentSong;
                            }
                            AudioInputStream nextStream = AudioSystem.getAudioInputStream(filePaths[presentSong]);
                            clip.open(nextStream);
                            clip.start();
                        }
                        case 'L' -> {
                            System.out.println("****** This is your playlist ******");
                            int n = 1;
                            for (File file : filePaths){
                                String string = file.toString();
                                System.out.println(n++ + ". " + string.substring(string.lastIndexOf('\\') + 1, string.lastIndexOf('.')));
                            }
                        }
                        case 'C' -> {
                            clip.close();
                            try {
                                System.out.print("Write a number from the Playlist: ");
                                int songNumber = scanner.nextInt() - 1;
                                AudioInputStream nextStream = AudioSystem.getAudioInputStream(filePaths[songNumber]);
                                clip.open(nextStream);
                                clip.start();
                            }catch (IndexOutOfBoundsException e){
                                System.out.println("This number does not exist in the playlist");
                            }catch (InputMismatchException e){
                                System.out.println("You must write a number");
                            }

                        }
                    }
                }
            }
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("File is not supported");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find file");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access Audio Resource");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Good buy!");
        }

    }
}