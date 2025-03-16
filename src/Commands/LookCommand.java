package Commands;

import Places.Room;

public class LookCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        Room current = context.getMansion().getCurrentRoom();
        System.out.println(current.getDescription());
        System.out.println(context.getMansion().getOccupantsDescription(context.getWatson()));
    }
}
