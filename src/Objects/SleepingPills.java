package Objects;

public class SleepingPills extends GameObject {
    public SleepingPills() {
        super("pills",
                "A small glass vial labeled 'Morphine.' " +
                        "Half the pills are missing.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return "Dr. Graves' medical bag contained this vial. " +
                "Enough to sedate Sir Reginald before the murder.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A vial of pills rolls under a chair, its label smudged.";
    }
}