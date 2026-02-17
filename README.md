# 📝 Notes Manager App (Java File I/O)

## 📌 Project Overview
This is an Text-Based Notes Management Application developed using Java.
The application allows users to create, edit, delete, and view notes with persistent file storage.

The project demonstrates File I/O operations, Exception Handling, OOP concepts, and Logging mechanisms.

---

## 🎯 Objective
To understand and implement:
- FileReader
- FileWriter
- BufferedReader
- Exception Handling
- try-with-resources
- Exception Propagation
- Logging System

---

## 🛠 Tools Used
- Java (JDK 8+)
- VS Code
- Terminal / Command Prompt

---

## 📂 Project Structure

NotesApp/
│
├── Note.java
├── NotesManager.java
├── LoggerUtil.java
├── Main.java
├── notes.txt
└── error.log

---

## 🚀 Features

✔ Add new note (Append Mode)  
✔ View all saved notes  
✔ Edit specific note  
✔ Delete specific note  
✔ Timestamp for each note  
✔ Exception logging into error.log  
✔ Uses try-with-resources  
✔ Proper exception handling  

---

## 💡 Key Concepts Used

| Concept | Implementation |
|---------|---------------|
| FileWriter | Writing notes |
| BufferedReader | Reading notes |
| Append Mode | FileWriter(FILE_NAME, true) |
| Overwrite Mode | FileWriter(FILE_NAME) |
| try-with-resources | Auto-close files |
| Exception Propagation | throws IOException |
| Logging | Custom LoggerUtil class |
| OOP | Multiple classes |

---

## ▶️ How to Run

1️⃣ Compile:
javac *.java

2️⃣ Run:
java Main

---

## 🖥 Sample Output

===== NOTES APP =====
1. Add Note
2. View Notes
3. Edit Note
4. Delete Note
5. Exit

---


## 🏆 Learning Outcome

After completing this project, I learned:
- How to persist data using files
- How Java handles checked exceptions
- How exception propagation works
- How to implement logging mechanism
- Best practices for file handling in Java
