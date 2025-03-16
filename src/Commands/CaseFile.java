package Commands;

public class CaseFile {
    private String title;
    private String description;
    private String location;
    private int severity;
    private String specialRequirements;

    public CaseFile(String title, String description, String location, int severity, String specialRequirements) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.severity = severity;
        this.specialRequirements = specialRequirements;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    // Additional getters can be added if needed
}

