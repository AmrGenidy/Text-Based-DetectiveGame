package Places;
import Objects.*;

public class DiningHall extends Room {
    public DiningHall(String name, String description) {
        super(name, description);
        addObject("boots", new MrsPoolesBoots());
        addObject("contract", new CrumpledContract());
    }

    @Override
    public String examine(String objectName) {
        GameObject obj = objects.get(objectName.toLowerCase());
        if (obj != null) {
            return obj.examine();
        }
        // Existing hardcoded checks (optional: remove once all objects are added)
        if (objectName.equalsIgnoreCase("table")) {
            return "The long table is set with fine china, though an eerie silence pervades the room.";
        }
        return "There is nothing unusual about the " + objectName + ".";
    }
}