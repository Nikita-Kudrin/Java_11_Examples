package sample.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class IOExample {
    private final Path filePath = Paths.get(Paths.get("").toAbsolutePath().toString(), "TestFile.txt");

    public void WriteTextIntoFile() throws IOException {
        var text = new String[]{"some text", "another line", "one more line"};

        // automatic resource closing
        try (var writer = new BufferedWriter(new FileWriter(filePath.toString()))) {
            for (var line : text) {
                writer.write(line);
                writer.newLine();
            }

            writer.flush();

            System.out.println("Text is written to the file " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadLinesFromFile() {
        try {
            System.out.println("Readed lines:");

            var lines = Files.lines(filePath)
                    .collect(Collectors.toList());
            for (var line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
