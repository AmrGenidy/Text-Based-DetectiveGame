package Commands;

public class CommandFactory {
    public static Command getCommand(String commandName) {
        switch(commandName.toLowerCase()) {
            case "look":
                return new LookCommand();
            case "move":
                return new MoveCommand();
            case "examine":
                return new ExamineCommand();
            case "question":
                return new QuestionCommand();
            case "journal":
                return new JournalCommand();
            case "deduce":
                return new DeduceCommand();
            case "final":
                return new FinalExamCommand();
            case "ask":
                return new AskWatsonCommand();
            case "help":
                return new HelpCommand();
            case "add":
                return new AddCaseCommand();
            case "tasks": // Add support for the "tasks" command
                return new TaskCommand();
            default:
                return null;
        }
    }
}

