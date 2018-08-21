/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
/*
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
*/
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new Hash<String, Room>();
    }



    public void setExits(Room north, Room east, Room south, Room west) 
    {
        exits.put
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            exits.put("north", north);
        if(east != null)
            exits.put("east", east);
        if(south != null)
            exits.put("south", south);
        if(west != null)
            exits.put("west", west);
/*
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;*/
    }
   
    /**
      * Retorna uma descrição das saidas da sala, 
      * por exemplo, "Exits: north west".
      * @return Uma descrição das saidas disponíveis.
      */
    public Room getExits(String direction) 
    {
        return exits.get(direction);
/*
        if(direction.equals("north"))
            return northExit;
        if(direction.equals("east"))
            return eastExit;
        if(direction.equals("south"))
            return southExit;
        if(direction.equals("west"))
            return westExit;
        return null;*/
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }


    /**
     * Retorna uma descrição das saídas da sala,
     * por exempo, "Exits: north west".
     * @return Uma descrição das salas disponíveis.
     */
    public String getExitString(){return "";}

}
