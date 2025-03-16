package Commands;

import Places.Room;

public class EnterCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        if(args.length < 2) {
            System.out.println("Usage: enter [room]");
            return;
        }
        String roomName = args[1];
        Room entered = context.getMansion().enterRoom(roomName);
        if(entered != null) {
            // Move suspects/Watson first
            context.getMansion().updateMovements(context.getWatson());
            System.out.println(entered.getDescription());
            System.out.println(context.getMansion().getOccupantsDescription(context.getWatson()));
        } else {
            System.out.println("Room not found or inaccessible.");
        }
    }
}

