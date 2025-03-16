package Commands;

public class JournalCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        context.getJournal().printEntries();
    }
}
