package Places;
import Objects.*;

public class ClaraRoom extends Room {
    public ClaraRoom(String name, String description) {
        super(name, description);
        addObject("diary", new ClarasDiary());
    }

    @Override
    public String examine(String objectName) {
        GameObject obj = objects.get(objectName.toLowerCase());
        if (obj != null) {
            return obj.examine();
        }
        return "There is nothing special about the " + objectName + ".";
    }
}