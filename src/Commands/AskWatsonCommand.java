package Commands;

public class AskWatsonCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        // Compare room names instead of instances
        if(context.getWatson().getCurrentRoom().getName().equals(context.getMansion().getCurrentRoom().getName()))
            context.getWatson().provideHint();
        else
            System.out.println("Dr. Watson is not in this room.");
    }
}
