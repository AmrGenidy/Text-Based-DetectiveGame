package Places;

public class DrawingRoom extends Room {
    public DrawingRoom(String name, String description) {
        super(name, description);
    }
    
    @Override
    public String examine(String objectName) {
        if(objectName.equalsIgnoreCase("piano")) {
            return "The grand piano stands silent, its keys untouched.";
        } else if(objectName.equalsIgnoreCase("armchairs")) {
            return "The plush armchairs are arranged invitingly around the fireplace.";
        }
        return "You see nothing unusual about the " + objectName + ".";
    }
}
