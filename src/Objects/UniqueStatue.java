package Objects;

public class UniqueStatue extends GameObject {
    public UniqueStatue() {
        super("statue",
                "A bronze falcon perches on the shelf, its wings spread mid-flight. " +
                        "The base is worn smooth, as if frequently handled.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return "Pulling the handle reveals a hidden passage " +
                "connecting the study to the library.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A bronze statue sits between dusty books, its eyes gleaming.";
    }
}