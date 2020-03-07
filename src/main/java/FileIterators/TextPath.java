package FileIterators;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TextPath {

    public TextPath() {}

    public Path getPath() {
        return Paths.get(System.getProperty("user.home"), "FindAnAnimalLog.txt");
    }
}
