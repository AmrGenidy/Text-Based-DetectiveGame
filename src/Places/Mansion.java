package Places;


import Objects.*;
import Characters.DoctorWatson;
import Commands.CaseFile;
import SuspectClasses.Suspect;

import java.util.*;

public class Mansion {
    private Room currentRoom;
    private Map<String, Room> rooms;
    private List<CaseFile> cases;
    private List<Suspect> suspects;

    public Mansion() {
        rooms = new HashMap<>();
        cases = new ArrayList<>();
        suspects = new ArrayList<>();

        // Create rooms.
        Room foyer = new Foyer("Foyer",
            "You are standing in the Grand Foyer of Blackwood Hall, a cavernous entry with towering ceilings. " +
            "A massive crystal chandelier illuminates the checkered marble floor. Portraits of the Blackwood family " +
            "line the walls, their eyes following your every move.");

        Room diningHall = new DiningHall("DiningHall",
            "You step into the Dining Hall. The long table is set with fine china, and faded tapestries depict hunting scenes. " +
            "A candelabra casts a soft glow over the room.");
        diningHall.addObject("boots", new MrsPoolesBoots());
        diningHall.addObject("contract", new CrumpledContract());

        Room drawingRoom = new DrawingRoom("DrawingRoom",
            "You enter the Drawing Room. Plush armchairs and a grand piano are arranged around a fireplace. " +
            "A bay window offers a view of the overgrown gardens.");

        Room study = new Study(
                "Study",
                "You step into the Study—the crime scene. Bookshelves line the walls, " +
                        "and a mahogany desk sits cluttered with papers. Ceremonial daggers hang " +
                        "above the fireplace, but one dagger is conspicuously missing. The drawer " +
                        "has been forced open, and a faint smell of perfume lingers." +
                        "There is something in the fireplace that is not totally burned." +
                        "A peculiar paint stain on the doorknob catches your eye."
        );
        study.addObject("perfume", new PerfumeScent());
        study.addObject("letter", new TornLoveLetter());
        study.addObject("compartment", new HiddenCompartment());
        study.addObject("statue", new UniqueStatue());
        study.addObject("doorknob", new PaintStainedDoorknob());

        Room library = new Library("Library",
            "You enter the Library, a two-story room filled with books. A wrought-iron balcony runs along the upper level, " +
            "and a spiral staircase leads up to the Turret Room.");

        Room secondFloor = new SecondFloorHallway("SecondFloorHallway",
            "Climbing the grand staircase from the Grand Foyer, you reach the second floor. " +
            "The hallway is lined with doors: Lady Eleanor’s room is the first on the left, Victor’s room is on the right, " +
            "and at the far end, Clara’s room is on the left. A narrow staircase leads up to the Turret Room.");

        Room turretRoom = new TurretRoom(
                "TurretRoom",
                "You are in the Turret Room. Dusty, old furniture fills the circular space, and a cracked window offers a panoramic view of the estate. " +
                        "On the floor, you notice some crumpled papers that emit a strong and pungent smell. They seem significant."
        );
        turretRoom.addObject("bills", new SleepingPills()); // Add the Sleeping Bills as an object


        // New bedrooms on second floor.
        Room ladyRoom = new LadyEleanorRoom("LadyEleanorRoom",
            "Lady Eleanor’s room is opulent, with lavish décor and rich fabrics.");

        Room victorRoom = new VictorRoom("VictorRoom",
            "Victor’s room is chaotic, with scattered canvases and paint-stained furnishings.");
        victorRoom.addObject("gloves", new VictorsGloves());

        Room claraRoom = new ClaraRoom("ClaraRoom",
            "Clara’s room is simple and modest, with minimal furnishings and a calm atmosphere.");
        claraRoom.addObject("diary", new ClarasDiary());

        // Set neighbors:
        // Foyer neighbors:
        foyer.setNeighbor("north", secondFloor);  // via grand staircase.
        foyer.setNeighbor("east", diningHall);
        foyer.setNeighbor("west", drawingRoom);

        // DiningHall neighbors:
        diningHall.setNeighbor("south", foyer);
        diningHall.setNeighbor("east", drawingRoom);
        diningHall.setNeighbor("west", study);  // private hallway to Study.

        // DrawingRoom neighbors:
        drawingRoom.setNeighbor("south", diningHall);
        drawingRoom.setNeighbor("north", study);
        drawingRoom.setNeighbor("east", library);

        // Study neighbors:
        study.setNeighbor("south", drawingRoom);
        study.setNeighbor("east", library);  // hidden door.
        study.setNeighbor("north", diningHall);

        // Library neighbors:
        library.setNeighbor("south", drawingRoom);
        library.setNeighbor("east", foyer);
        library.setNeighbor("west", turretRoom);  // spiral staircase.
        library.setNeighbor("north", study);  // hidden door.

        // SecondFloorHallway neighbors:
        secondFloor.setNeighbor("south", foyer);  // back via staircase.
        secondFloor.setNeighbor("up", turretRoom);  // narrow staircase.
        // Link bedrooms.
        secondFloor.setNeighbor("east", ladyRoom);
        secondFloor.setNeighbor("west", victorRoom);
        secondFloor.setNeighbor("north", claraRoom);

        // Set return directions for bedrooms.
        ladyRoom.setNeighbor("west", secondFloor);
        victorRoom.setNeighbor("east", secondFloor);
        claraRoom.setNeighbor("south", secondFloor);

        // TurretRoom neighbors:
        turretRoom.setNeighbor("down", secondFloor);
        turretRoom.setNeighbor("south", library);

        // Add rooms to map.
        rooms.put("Foyer", foyer);
        rooms.put("DiningHall", diningHall);
        rooms.put("DrawingRoom", drawingRoom);
        rooms.put("Study", study);
        rooms.put("Library", library);
        rooms.put("SecondFloorHallway", secondFloor);
        rooms.put("TurretRoom", turretRoom);
        rooms.put("LadyEleanorRoom", ladyRoom);
        rooms.put("VictorRoom", victorRoom);
        rooms.put("ClaraRoom", claraRoom);

        // Set initial room.
        currentRoom = foyer;
    }

    public Room getCurrentRoom() { return currentRoom; }

    public Room move(String direction) {
        Room next = currentRoom.getNeighbor(direction);
        if(next != null) {
            currentRoom = next;
            return currentRoom;
        }
        return null;
    }

    public Room enterRoom(String roomName) {
        Room room = rooms.get(roomName);
        if(room != null) {
            currentRoom = room;
            return currentRoom;
        }
        return null;
    }

    public void addCase(CaseFile newCase) { cases.add(newCase); }
    public void addSuspect(Suspect suspect) { suspects.add(suspect); }

    public Suspect getSuspect(String name) {
        for(Suspect s : suspects) {
            if(s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public List<Suspect> getSuspects() {
        return suspects;
    }

    public String getOccupantsDescription(DoctorWatson watson) {
        StringBuilder sb = new StringBuilder();
        List<String> occupants = new ArrayList<>();
        for(Suspect s : suspects) {
            // Compare room names instead of references
            if(s.getCurrentRoom().getName().equals(currentRoom.getName()))
                occupants.add(s.getName());
        }
        if(watson.getCurrentRoom().getName().equals(currentRoom.getName()))
            occupants.add("Dr. Watson");
        if(!occupants.isEmpty()){
            sb.append("\nOccupants: ");
            for(String occ : occupants)
                sb.append(occ).append(" ");
        }
        return sb.toString();
    }

    public void updateMovements(DoctorWatson watson) {
        // Move each suspect among allowed rooms.
        for(Suspect s : suspects) {
            s.randomMove(this);
        }
        // Move Dr. Watson (allowed to move anywhere).
        watson.randomMove(this);
    }


    public List<Room> getAllowedRooms() {
        List<Room> allowed = new ArrayList<>();
        for (Room r : rooms.values()) {
            if (Suspect.ALLOWED_ROOMS.contains(r.name)) {
                allowed.add(r);
            }
        }
        return allowed;
    }

    public Collection<Room> getAllRooms() {
        return rooms.values();
    }


}
