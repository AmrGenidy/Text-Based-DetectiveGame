package Objects;

public class TornLoveLetter extends GameObject {
    public TornLoveLetter() {
        super("letter",
                "A charred letter fragment bears the words: '...forgive me… your father " +
                        "will never accept us…' The ink is faded, the paper brittle.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return "Dated five years ago, addressed to Victor. " +
                "Sir Reginald forbade their relationship—an old grudge.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A torn letter smolders in the fireplace, its edges curling.";
    }
}