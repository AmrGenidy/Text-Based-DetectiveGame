package Commands;

import Messages.Letter;
import Places.Room;

public class StartCaseCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        // Display the case description
        Letter letter = new Letter();
        letter.displayCaseDescription();

        // Print the main entrance (Foyer) description
        Room currentRoom = context.getMansion().getCurrentRoom();
        System.out.println(currentRoom.getDescription());

        // Print occupants in the room
        System.out.println(context.getMansion().getOccupantsDescription(context.getWatson()));
    }
}