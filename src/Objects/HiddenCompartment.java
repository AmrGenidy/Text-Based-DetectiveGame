package Objects;

public class HiddenCompartment extends GameObject {
    public HiddenCompartment() {
        super("compartment",
                "A hairline seam disrupts the desk’s mahogany veneer. " +
                        "A tiny keyhole glints under the lamplight.");
    }

    @Override
    public String examine() {
        return description ;
    }

    @Override
    public String deduce() {
        return  "The keyhole’s shape mirrors the pendant on Lady Eleanor’s necklace. " +
                "Inside, faint scratches mark the compartment’s interior." + "It might be hiding something that has not been found yet! ";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A faint seam in the desk suggests a hidden compartment.";
    }
}