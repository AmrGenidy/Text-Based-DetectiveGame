package Commands;

public class TaskCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        context.getTaskList().displayTasks();
    }
}