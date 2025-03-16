package Places;

public class TurretRoom extends Room {
    public TurretRoom(String name, String description) {
        super(name, description);
    }
    
    @Override
    public String examine(String objectName) {
        if(objectName.equalsIgnoreCase("furniture")) {
            return "The dusty, old furniture fills the room with memories of times long past.";
        } else if(objectName.equalsIgnoreCase("window")) {
            return "The cracked window offers a panoramic view of the estate.";
        }
        return "There is nothing unusual about the " + objectName + ".";
    }
}

