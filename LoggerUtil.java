import java.io.FileWriter;
import java.io.IOException;

public class LoggerUtil {
    private static final String LOG_FILE = "error.log";
    public static void logError(Exception e) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            fw.write("ERROR: " + e.toString() + "\n");
        } catch (IOException ex) {
            System.out.println("Logging failed!");
        }
    }
}
