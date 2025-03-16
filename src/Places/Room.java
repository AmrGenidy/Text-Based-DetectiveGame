package Places;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Objects.GameObject; // Import the GameObject class

public abstract class Room {
    protected String name;
    protected String description;
    protected Map<String, Room> neighbors;
    protected Map<String, GameObject> objects; // Store objects in the room

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.neighbors = new HashMap<>();
        this.objects = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    // Add an object to the room
    public void addObject(String name, GameObject object) {
        objects.put(name.toLowerCase(), object);
    }

    // Enhanced getDescription() to list objects
    public String getDescription() {
        StringBuilder sb = new StringBuilder(description);

        // Add object snippets
        if (!objects.isEmpty()) {
            sb.append("\n\nNotable features:");
            for (GameObject obj : objects.values()) {
                sb.append("\n- ").append(obj.getDescriptionSnippet());
            }
        }

        // Add exits
        if (!neighbors.isEmpty()) {
            sb.append("\n\nExits:");
            for (String dir : neighbors.keySet()) {
                sb.append(" ").append(dir).append(" (" + neighbors.get(dir).name + ")");
            }
        }

        // Add object list with proper separation
        if (!objects.isEmpty()) {
            sb.append("\n\nObjects present:");
            List<String> objectNames = new ArrayList<>(objects.keySet());
            sb.append(" ").append(String.join(", ", objectNames));
        }

        return sb.toString();
    }


    public String getDeduction(String objectName) {
        if (this instanceof Study && objectName.equalsIgnoreCase("drawer")) {
            return "The forced drawer suggests someone was searching for something valuable.";
        } else if (this instanceof DiningHall && objectName.equalsIgnoreCase("contract")) {
            return "The crumpled contract hints at financial disputes involving Sir Reginald.";
        } else if (this instanceof DrawingRoom && objectName.equalsIgnoreCase("armchairs")) {
            return "A faint scent of perfume lingers on the armchairs, suggesting recent use.";
        }
        return null; // No additional clue for this object
    }

    // Retrieve an object by name (case-insensitive)
    public GameObject getObject(String objectName) {
        return objects.get(objectName.toLowerCase());
    }

    public abstract String examine(String objectName);

    // Restored getNeighbor method
    public Room getNeighbor(String direction) {
        return neighbors.get(direction.toLowerCase());
    }

    // Restored setNeighbor method
    public void setNeighbor(String direction, Room room) {
        neighbors.put(direction.toLowerCase(), room);
    }

    // Get all neighbors (useful for random movement logic)
    public Map<String, Room> getNeighbors() {
        return neighbors;
    }

    // Find a room by name among neighbors
    public Room getRoomByName(String roomName) {
        for (Room r : neighbors.values()) {
            if (r.name.equalsIgnoreCase(roomName)) {
                return r;
            }
        }
        return null;
    }
}