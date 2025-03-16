package Places;

public class LadyEleanorRoom extends Room {
    public LadyEleanorRoom(String name, String description) {
        super(name, description);
    }
    
    @Override
    public String examine(String objectName) {
        if(objectName.equalsIgnoreCase("decor") || objectName.equalsIgnoreCase("room")) {
            return "The room is lavishly decorated with opulent furnishings, fine draperies, and ornate details that reflect wealth and tradition.";
        }
        return "You see nothing unusual about the " + objectName + ".";
    }
}
