import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReverseFile {
    public static void doIt(String inputFile, String outputFile) throws IOException {
        Path input = Paths.get(inputFile);
        List<String> lines = Files.readAllLines(input, StandardCharsets.UTF_8);
        FileWriter writer = new FileWriter(outputFile);
        for(int i = lines.size()-1; i>=0;i--){
            writer.write(new StringBuilder(lines.get(i)).reverse().toString());
            writer.write("\n");
            writer.flush();
        }

    }

    public static void main(String[] args){
        try {
            doIt("input.txt","output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
