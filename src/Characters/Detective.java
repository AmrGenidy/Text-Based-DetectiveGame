package Characters;

public class Detective {
    private String name;
    private String rank; // "Junior Investigator" or "Senior Investigator"
    private int deduceCount; // Track deduction usage

    public Detective(String name) {
        this.name = name;
        this.rank = "Junior Investigator"; // Start as Junior Investigator
        this.deduceCount = 0; // Initialize deduction count to 0
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getDeduceCount() {
        return deduceCount;
    }

    public void incrementDeduceCount() {
        deduceCount++;
        if (deduceCount > 3) { // Demote after 3 deductions
            rank = "Junior Investigator";
        }
    }

    public void resetDeduceCount() {
        deduceCount = 0;
        rank = "Senior Investigator"; // Reset rank when starting fresh
    }

    public void promote() {
        rank = "Senior Investigator";
    }

    public void demote() {
        rank = "Junior Investigator";
    }
}