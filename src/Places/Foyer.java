package Places;

public class Foyer extends Room {
    public Foyer(String name, String description) {
        super(name, description);
    }
    
    @Override
    public String examine(String objectName) {
        if(objectName.equalsIgnoreCase("chandelier")) {
            return "The massive crystal chandelier casts dancing light on the floor.";
        } else if(objectName.equalsIgnoreCase("portraits")) {
            return "The portraits of the Blackwood family seem to watch you closely.";
        }
        return "You see nothing unusual about the " + objectName + ".";
    }
}

