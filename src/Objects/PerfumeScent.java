package Objects;

public class PerfumeScent extends GameObject {
    public PerfumeScent() {
        super("perfume",
                "A floral aroma lingers near the study door—jasmine and bergamot. " +
                        "The scent grows stronger near Lady Eleanor’s quarters.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return "The perfume’s base note is faintly medicinal, masking a sharper odor.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A faint floral aroma lingers near the door.";
    }
}