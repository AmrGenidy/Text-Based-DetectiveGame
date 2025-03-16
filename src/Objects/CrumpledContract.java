package Objects;

public class CrumpledContract extends GameObject {
    public CrumpledContract() {
        super("contract",
                "A business contract stamped 'VOID' in red ink. Sir Reginald’s signature " +
                        "crosses out a £20,000 payment to Harold Whitaker.");
    }

    @Override
    public String examine() {
        return description;
    }

    @Override
    public String deduce() {
        return  "The final clause states the debt dissolves upon Sir Reginald’s death. " +
                "The paper is creased, as if crushed in anger.";
    }

    @Override
    public String getDescriptionSnippet() {
        return "A crumpled document peeks out from a coat pocket, its edges charred.";
    }
}