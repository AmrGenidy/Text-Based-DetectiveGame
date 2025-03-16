package Objects;

public abstract class GameObject {
    protected String name;
    protected String description;
    protected boolean examined = false;

    public GameObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public abstract String examine();

    // Deeper clue revealed by deduction
    public abstract String deduce();
    public abstract String getDescriptionSnippet();
}