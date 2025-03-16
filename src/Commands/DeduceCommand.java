package Commands;

import Objects.GameObject;
import Places.Room;

public class DeduceCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        if (args.length < 2) {
            System.out.println("Usage: deduce [object]");
            return;
        }

        String objectName = args[1].toLowerCase();
        Room currentRoom = context.getMansion().getCurrentRoom();
        GameObject obj = currentRoom.getObject(objectName); // Get the object

        if (obj != null) {
            String clue = obj.deduce(); // Get the deeper clue
            System.out.println("Deduction: " + clue);
            context.getJournal().addEntry("Clue: " + clue); // Add to journal
            context.getDetective().incrementDeduceCount(); // Track usage
            System.out.println("Deductions used: " + context.getDetective().getDeduceCount());
        } else {
            System.out.println("No such object in this room.");
        }
    }
}