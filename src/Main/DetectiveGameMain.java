package Main;

import java.util.Scanner;

import Characters.Detective;
import Characters.DoctorWatson;
import Commands.*;
import Messages.Letter;
import Places.Mansion;
import Places.Room;
import SuspectClasses.DrJonathanGraves;
import SuspectClasses.LadyEleanorBlackwood;
import SuspectClasses.MissClaraHastings;
import SuspectClasses.MrHaroldWhitaker;
import SuspectClasses.MrsBeatricePoole;
import SuspectClasses.Suspect;
import SuspectClasses.VictorBlackwood;

import java.util.*;

//for the commit

public class DetectiveGameMain {
    public static void main(String[] args) {
        Mansion mansion = new Mansion();
        Detective detective = new Detective("Sherlock Holmes");
        DoctorWatson watson = new DoctorWatson();
        Journal journal = new Journal();

        // Add suspects to the mansion
        mansion.addSuspect(new LadyEleanorBlackwood());
        mansion.addSuspect(new VictorBlackwood());
        mansion.addSuspect(new MissClaraHastings());
        mansion.addSuspect(new DrJonathanGraves());
        mansion.addSuspect(new MrHaroldWhitaker());
        mansion.addSuspect(new MrsBeatricePoole());

        // Randomly assign each suspect to one of the allowed rooms
        List<Room> allowedRooms = mansion.getAllowedRooms();
        Random random = new Random();
        for (Suspect s : mansion.getSuspects()) {
            int index = random.nextInt(allowedRooms.size());
            s.setCurrentRoom(allowedRooms.get(index));
        }

        // Assign Dr. Watson to a random room
        List<Room> allRooms = new ArrayList<>(mansion.getAllRooms());
        int index = random.nextInt(allRooms.size());
        watson.setCurrentRoom(allRooms.get(index));

        GameContext context = new GameContext(mansion, detective, watson, journal);

        // Display the initial invitation
        Letter letter = new Letter();
        letter.displayInvitation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType 'start case' to begin the investigation.");

        while (true) {
            System.out.print("C:\\DetectiveGame> ");
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) continue;

            String[] tokens = input.split(" ");
            String commandName = tokens[0].toLowerCase();
            Command command = null;

            // Multi-word command handling
            if (input.toLowerCase().startsWith("journal add")) {
                command = new JournalAddCommand();
            } else if (input.toLowerCase().startsWith("final exam")) {
                command = new FinalExamCommand();
            } else if (input.toLowerCase().startsWith("add case")) {
                command = new AddCaseCommand();
            } else if (input.toLowerCase().startsWith("start case")) {
                command = new StartCaseCommand();
            } else if (input.toLowerCase().startsWith("ask watson")) {
                command = new AskWatsonCommand();
            } else {
                command = CommandFactory.getCommand(commandName);
            }

            if (command != null) {
                command.execute(tokens, context);
            } else {
                System.out.println("Unknown command. Type 'help' for a list of commands.");
            }

            // Update movements only if the command was a movement command
            if (commandName.equals("move") || commandName.equals("enter")) {
                context.getMansion().updateMovements(context.getWatson());
            }
        }
    }
}

