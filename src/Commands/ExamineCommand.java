package Commands;

public class ExamineCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        if(args.length < 2) {
            System.out.println("Usage: examine [object]");
            return;
        }
        String objectName = args[1];
        String observation = context.getMansion().getCurrentRoom().examine(objectName);
        System.out.println(observation);
    }
}

