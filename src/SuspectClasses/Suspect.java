package SuspectClasses;

import java.util.Random;

import Places.Mansion;
import Places.Room;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import java.util.*;


public abstract class Suspect {
    protected String name;
    protected String statement;
    protected String clue;
    protected Room currentRoom;
    protected Random random = new Random();
    
    // Allowed room names for suspect movement.
    public static final Set<String> ALLOWED_ROOMS = new HashSet<>(Arrays.asList(
        "DiningHall", "DrawingRoom", "Study", "Foyer", "SecondFloorHallway", "Library", "TurretRoom"
    ));
    
    public Suspect(String name, String statement, String clue) {
        this.name = name;
        this.statement = statement;
        this.clue = clue;
    }
    
    public String getName() { return name; }
    public String getStatement() { return statement; }
    public String getClue() { return clue; }
    
    public Room getCurrentRoom() { return currentRoom; }
    public void setCurrentRoom(Room room) { currentRoom = room; }
    
    // Updated randomMove method similar to DoctorWatson's.
    public void randomMove(Mansion mansion) {
        Map<String, Room> neighbors = currentRoom.getNeighbors();
        List<Room> allowedNeighbors = new ArrayList<>();
        allowedNeighbors.add(currentRoom); // Allow staying in the same room
        for (Room r : neighbors.values()) {
            if (ALLOWED_ROOMS.contains(r.getName())) {
                allowedNeighbors.add(r);
            }
        }
        if (!allowedNeighbors.isEmpty()) {
            int index = random.nextInt(allowedNeighbors.size());
            currentRoom = allowedNeighbors.get(index);
        }
    }
}
