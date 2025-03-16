package Places;
import Objects.*;

public class VictorRoom extends Room {
    public VictorRoom(String name, String description) {
        super(name, description);
        addObject("gloves", new VictorsGloves());
    }

    @Override
    public String examine(String objectName) {
        GameObject obj = objects.get(objectName.toLowerCase());
        if (obj != null) {
            return obj.examine();
        }
        return "There is nothing unusual about the " + objectName + ".";
    }
}