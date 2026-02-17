import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NotesManager manager = new NotesManager();

        int choice;

        do {
            System.out.println("\n===== ADVANCED NOTES APP =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Edit Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter note: ");
                        String content = sc.nextLine();
                        manager.addNote(new Note(content));
                        System.out.println("Note added!");
                        break;

                    case 2:
                        List<String> notes = manager.readNotes();
                        if (notes.isEmpty()) {
                            System.out.println("No notes found!");
                        } else {
                            System.out.println("\n--- Your Notes ---");
                            for (int i = 0; i < notes.size(); i++) {
                                System.out.println((i + 1) + ". " + notes.get(i));
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter note number to edit: ");
                        int editIndex = sc.nextInt() - 1;
                        sc.nextLine();
                        System.out.print("Enter new content: ");
                        String newContent = sc.nextLine();
                        manager.editNote(editIndex, newContent);
                        break;

                    case 4:
                        System.out.print("Enter note number to delete: ");
                        int deleteIndex = sc.nextInt() - 1;
                        manager.deleteNote(deleteIndex);
                        break;

                    case 5:
                        System.out.println("Exiting App...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (IOException e) {
                System.out.println("File operation error occurred!");
                LoggerUtil.logError(e);
            }

        } while (choice != 5);

        sc.close();
    }
}
