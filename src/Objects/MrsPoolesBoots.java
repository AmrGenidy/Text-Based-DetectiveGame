package Objects;

public class MrsPoolesBoots extends GameObject {
    public MrsPoolesBoots() {
        super("boots",
                "Muddy boots rest by the door, their tread patterned with deep grooves. " +
                        "Fresh soil clings to the soles.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return   "The grooves match footprints beneath the study window. " +
                "The mud smells of damp earth from the garden.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "Muddy boots sit by the door, leaving tracks on the floor.";
    }
}