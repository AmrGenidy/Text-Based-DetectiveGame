package Commands;

import java.util.Scanner;
import SuspectClasses.Suspect;

public class AddCaseCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter case title: ");
        String title = scanner.nextLine();
        System.out.print("Enter case description: ");
        String description = scanner.nextLine();
        System.out.print("Enter list of suspects (comma-separated): ");
        String suspectList = scanner.nextLine();
        System.out.print("Enter main location: ");
        String location = scanner.nextLine();
        System.out.print("Enter severity (1-10): ");
        int severity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter special requirements: ");
        String specialReq = scanner.nextLine();

        CaseFile newCase = new CaseFile(title, description, location, severity, specialReq);
        context.getMansion().addCase(newCase);
        System.out.println("New Case Added Successfully!");
    }
}

