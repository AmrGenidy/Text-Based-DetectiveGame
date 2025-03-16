package Places;

public class SecondFloorHallway extends Room {
    public SecondFloorHallway(String name, String description) {
        super(name, description);
    }
    
    @Override
    public String examine(String objectName) {
        return "The hallway is lined with doors leading to the bedrooms. " +
               "Lady Eleanor’s room is to the east, Victor’s room is to the west, " +
               "and at the far end, Clara’s room is to the north. A narrow staircase " +
               "here leads up to the Turret Room.";
    }
}


