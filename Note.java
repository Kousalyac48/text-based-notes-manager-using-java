import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {

    private String content;
    private String timestamp;

    public Note(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
    public String getFormattedNote() {
        return timestamp + " | " + content;
    }
}
