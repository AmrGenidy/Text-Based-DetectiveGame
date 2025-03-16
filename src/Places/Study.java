package Places;
import Objects.*;

public class Study extends Room {
    public Study(String name, String description) {
        super(name, description);
        // Add each object ONCE with a UNIQUE lowercase key
        addObject("perfume", new PerfumeScent());
        addObject("letter", new TornLoveLetter());
        addObject("compartment", new HiddenCompartment());
        addObject("statue", new UniqueStatue());
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