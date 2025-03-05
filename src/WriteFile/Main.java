package WriteFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "src/WriteFile/test.txt";
        String textContent = "I like cale soup!\nIt's reaaally gooood!!\nMake me cale soup!";
        String poem = """
                Rosor är röda
                Violer är blå
                Här ska du få känna på
                mina nunchakkas små
                """;

        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(poem);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}
