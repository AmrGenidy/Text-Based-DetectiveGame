package Commands;

import Characters.Detective;
import Characters.DoctorWatson;
import Places.Mansion;

public class GameContext {
    private Mansion mansion;
    private Detective detective;
    private DoctorWatson watson;
    private Journal journal;
    private TaskList taskList;
    
    public GameContext(Mansion mansion, Detective detective, DoctorWatson watson, Journal journal) {
        this.mansion = mansion;
        this.detective = detective;
        this.watson = watson;
        this.journal = journal;
        this.taskList = new TaskList();
    }
    
    public Mansion getMansion() {
        return mansion;
    }
    public Detective getDetective() {
        return detective;
    }
    public DoctorWatson getWatson() {
        return watson;
    }
    public Journal getJournal() {
        return journal;
    }
    public TaskList getTaskList() { return taskList;}
}

