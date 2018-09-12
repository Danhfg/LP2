import java.util.*;

public class Vehicle
{
    // A unique ID for this Vehicle.
    private String id;
    // The destination of this vehicle.
    private String destination;
    // The location of this vehicle.
    private String location;

    public Vehicle(String id)
    {
        this.id = id;
        destination = null;
    }
    
    /**
     * Return the ID of the Vehicle.
     * @return The ID of the Vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Set the intented location of the vehicle.
     * @param location The intended location.
     */
    public void setLocation(String location)
    {
        this.location = location;
    }    

    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
        if (destination == null) {
            return getID() + " at " + getLocation() + " without destination!";
        }
        return getID() + " at " + getLocation() + " headed for " +
               getDestination();
    }
}