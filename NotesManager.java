import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NotesManager {
    private static final String FILE_NAME = "notes.txt";

    // Add Note (Append Mode)
    public void addNote(Note note) throws IOException {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(note.getFormattedNote() + System.lineSeparator());
        }
    }

    // Read All Notes
    public List<String> readNotes() throws IOException {
        List<String> notes = new ArrayList<>();

        File file = new File(FILE_NAME);
        if (!file.exists()) return notes;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                notes.add(line);
            }
        }
        return notes;
    }

    // Delete Specific Note
    public void deleteNote(int index) throws IOException {
        List<String> notes = readNotes();

        if (index < 0 || index >= notes.size()) {
            System.out.println("Invalid note number!");
            return;
        }

        notes.remove(index);

        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            for (String note : notes) {
                fw.write(note + System.lineSeparator());
            }
        }
        System.out.println("Note deleted successfully!");
    }

    // Edit Specific Note
    public void editNote(int index, String newContent) throws IOException {
        List<String> notes = readNotes();

        if (index < 0 || index >= notes.size()) {
            System.out.println("Invalid note number!");
            return;
        }

        Note updatedNote = new Note(newContent);
        notes.set(index, updatedNote.getFormattedNote());

        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            for (String note : notes) {
                fw.write(note + System.lineSeparator());
            }
        }
        System.out.println("Note updated successfully!");
    }
}
