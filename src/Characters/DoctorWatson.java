package Characters;

import java.util.Random;

import Places.Mansion;
import Places.Room;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class DoctorWatson {
    private Random random = new Random();
    private Room currentRoom;
    
    public Room getCurrentRoom() { return currentRoom; }
    public void setCurrentRoom(Room room) { currentRoom = room; }

    public void randomMove(Mansion mansion) {
        Map<String, Room> neighbors = currentRoom.getNeighbors();
        List<Room> roomList = new ArrayList<>(neighbors.values());
        roomList.add(currentRoom); // Allow staying in the same room
        if (!roomList.isEmpty()) {
            int index = random.nextInt(roomList.size());
            currentRoom = roomList.get(index);
        }
    }
    
    public void provideHint() {
         String[] hints = {
             "Review your clues carefully.",
             "Look for inconsistencies in the suspect statements.",
             "The location of evidence is key.",
             "Sometimes, the smallest detail reveals the truth."
         };
         System.out.println("Watson: " + hints[random.nextInt(hints.length)]);
    }
}
