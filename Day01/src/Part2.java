import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part2 {

    public static void main(String[] args) throws IOException {
        int runningTotal = 0;
        List<String> lines = Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "\\src\\input.txt"));
        for (String line : lines) {
            int value = Integer.parseInt(line);
            while (true) {
                value = (value / 3) - 2;
                if (value > 0) {
                    runningTotal += value;
                } else {
                    break;
                }
            }
        }

        System.out.println(runningTotal);
        System.out.println("Done!");

    }
}
