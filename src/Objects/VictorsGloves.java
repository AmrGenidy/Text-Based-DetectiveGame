package Objects;

public class VictorsGloves extends GameObject {
    public VictorsGloves() {
        super("gloves",
                "Paint-stained gloves lie discarded, the fingertips worn thin. " +
                        "Blue oil pigment cakes the seams.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return "The paint matches the stain on the study doorknob. " +
                "Victor was here earlier—but the gloves show no blood.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "Paint-stained gloves lie discarded on a workbench.";
    }
}