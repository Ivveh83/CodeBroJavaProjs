package AudioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // How to play audio with Java (.wav, .au, .aiff)

        String filePath = "src\\AudioPlayer\\Jungle Trip - Quincas Moreira.wav";
        File file = new File(filePath);

        try(AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Scanner scanner = new Scanner(System.in)
        ){
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            boolean isON = true;
            char choice;

            System.out.println("""
                    *****************************
                    Welcome to the Audio Player"
                    *****************************
                    """);

            while (isON){
                System.out.print("""
                        *****************************
                        Would you like to play, stop,
                        reset or quit the recording?
                        *****************************
                        """);
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Type in your choice: ");
                choice = scanner.next().toUpperCase().charAt(0);

                switch (choice){
                    case 'P' -> clip.start();
                    case 'S' -> clip.stop();
                    case 'R' -> clip.setMicrosecondPosition(0);
                    case 'Q' -> {
                        clip.close(); isON = false;
                    }
                }

//                if (choice.equals("play")){
//                    clip.start();
//                } else if (choice.equals("stop")) {
//                    clip.stop();
//                } else if (choice.equals("reset")) {
//                    clip.setMicrosecondPosition(0);
//                    System.out.println("Song starts over again");
//                } else if (choice.equals("quit")) {
//                    clip.close();
//                    isON = false;
//                }
//                else {
//                    System.out.println("Input choice not valid");
//                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find file");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
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
