package Commands;

import SuspectClasses.Suspect;

public class QuestionCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        if (args.length < 2) {
            System.out.println("Usage: question [suspect]");
            return;
        }
        String suspectName = args[1];
        Suspect suspect = context.getMansion().getSuspect(suspectName);
        if (suspect != null) {
            if (suspect.getCurrentRoom() == context.getMansion().getCurrentRoom()) {
                String statement = suspect.getStatement();
                System.out.println(statement);
                context.getJournal().addEntry(suspect.getName() + ": " + statement); // Add to journal
            } else {
                System.out.println("That suspect is not in this room.");
            }
        } else {
            System.out.println("Suspect not found.");
        }
    }
}

