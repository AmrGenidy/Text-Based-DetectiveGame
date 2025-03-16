package Commands;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
        initializeTasks();
    }

    // Initialize static tasks
    private void initializeTasks() {
        tasks.add("1. Check the final exam questions using (final exam) command and try to answer them while investigating.");
        tasks.add("2. Question suspects to gather their statements and uncover inconsistencies.");
        tasks.add("3. Examine the crime scene (Study) for evidence.");
        tasks.add("4. Search other rooms for additional clues and objects.");
        tasks.add("5. Use the 'deduce' command on objects to uncover deeper insights but don't overuse it because it will decrease your rank .");
        tasks.add("6. Add important clues to your journal using 'journal add [note]'.");
        tasks.add("7. Review your collected clues with the 'journal' command.");
        tasks.add("8. Ask Dr. Watson for hints using 'ask watson'.");
        tasks.add("9. Solve the case by answering the final exam questions ('final exam').");
    }

    // Display all tasks
    public void displayTasks() {
        System.out.println("Investigation Guide:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}