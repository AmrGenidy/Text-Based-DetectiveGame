package Objects;

public class ClarasDiary extends GameObject {
    public ClarasDiary() {
        super("diary",
                "A leather-bound diary lies open, revealing a sketch of a small key. " +
                        "The pages are marked with dates from the past week.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return "The most recent sketch depicts a detailed key with an ornate bow, " +
                "its teeth matching the study door’s intricate lock.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A leather diary lies open on the desk, its pages fluttering slightly.";
    }
}