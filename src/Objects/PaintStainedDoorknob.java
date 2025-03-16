package Objects;

public class PaintStainedDoorknob extends GameObject {
    public PaintStainedDoorknob() {
        super("doorknob",
                "A brass doorknob smeared with dried blue paint.");
    }

    @Override
    public String examine() {
        return description + "The paint is partially smudged, as if transferred from gloved hands. " +
                "No fingerprints mark the surface.";
    }

    @Override
    public String deduce() {
        return   "The paint is partially smudged, as if transferred from gloved hands. " +
                "No fingerprints mark the surface.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A paint-stained doorknob glints faintly in the dim light.";
    }
}