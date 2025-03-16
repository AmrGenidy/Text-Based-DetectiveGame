package Commands;

import Places.Room;

public class MoveCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        if(args.length < 2) {
            System.out.println("Usage: move [north|south|east|west]");
            return;
        }
        String direction = args[1];
        Room newRoom = context.getMansion().move(direction);
        if(newRoom != null) {
            // Move suspects/Watson first
            context.getMansion().updateMovements(context.getWatson());
            System.out.println(newRoom.getDescription());
            System.out.println(context.getMansion().getOccupantsDescription(context.getWatson()));
        } else {
            System.out.println("You can't move in that direction.");
        }
    }
}

