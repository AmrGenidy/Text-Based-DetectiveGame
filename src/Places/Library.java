package Places;

public class Library extends Room {
    public Library(String name, String description) {
        super(name, description);
    }
    
    @Override
    public String examine(String objectName) {
        if(objectName.equalsIgnoreCase("bookshelves")) {
            return "The bookshelves are filled with dusty tomes and secrets of the past.";
        } else if(objectName.equalsIgnoreCase("balcony")) {
            return "The wrought-iron balcony offers a view of the overgrown gardens.";
        }
        return "There is nothing remarkable about the " + objectName + ".";
    }
}

