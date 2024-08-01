public class Theater {
    private int theaterId, seatingCapacity;
    private String name;
    private String location;

    public Theater(int theaterId, int seatingCapacity, String name, String location)
    {
        this.theaterId = theaterId;
        this.seatingCapacity = seatingCapacity;
        this.name = name;
        this.location = location;
    }

    public void setTheaterId(int theaterId)
    {
        this.theaterId = theaterId;
    }

    public void setSeatingCapacity(int seatingCapacity)
    {
        this.seatingCapacity = seatingCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public int getTheaterId()
    {
        return theaterId;
    }

    public int getSeatingCapacity()
    {
        return seatingCapacity;
    }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    @Override
    public String toString()
    {
        return "Theater ID: "+ theaterId + ", Seating Capacity: "+ seatingCapacity + ", Cinema  Name: "+ name + ", Cinema location: "+ location;
    }
}
