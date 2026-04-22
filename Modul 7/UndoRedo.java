import java.util.Scanner;
import java.util.Stack;

public class UndoRedo { 
    
    Stack<String> undoStack = new Stack<>(); 
    Stack<String> redoStack = new Stack<>(); 
    
    public void action(String command) { 
        System.out.println("Action: " + command); 
        undoStack.push(command); 
        redoStack.clear(); 
        UndoRedo.print(undoStack, redoStack); 
    }  
     
    public void undo() {
        if (undoStack.isEmpty())
            System.out.println("Nothing to undo.");
        else { //Tambahkan isi else Undo
            String cmd = undoStack.pop();
            redoStack.push(cmd);
            System.out.println("Undo: " + cmd);
        }
        UndoRedo.print(undoStack, redoStack);
    }

    public void redo() {
        if (redoStack.isEmpty())
            System.out.println("Nothing to redo.");
        else { //Tambahkan isi else Redo
            String cmd = redoStack.pop();
            undoStack.push(cmd);
            System.out.println("Redo: " + cmd);
        }
        UndoRedo.print(undoStack, redoStack);
    }
    
    //Modifikasi method dibawah ini
    public static void print(Stack<String> undoSt, Stack<String> redoSt) {
        System.out.print("Stack Undo : ");
        for (String s : undoSt)
            System.out.print(s + " ");
        System.out.println();

        System.out.print("Stack Redo : ");
        for (String s : redoSt)
            System.out.print(s + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        UndoRedo app = new UndoRedo();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Ketikkan teks sebagai command.");
            System.out.println("Ketik U untuk melakukan Undo");
            System.out.println("Ketik R untuk melakukan Redo");
            System.out.println("Ketik X untuk mengakhiri program.");
            System.out.print("Command: ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("x")) break;
            if (command.equalsIgnoreCase("u")) { app.undo(); } 
            else if (command.equalsIgnoreCase("r")) { app.redo(); } 
            else app.action(command);
        }

        scanner.close();
        System.out.println("Program selesai.");

    }
    
}