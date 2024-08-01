public class Reservation {
    private int reservationId, numberOfTickets;
    private String customerName, showtime;

    public Reservation(int reservationId, String showtime, int numberOfTickets, String customerName)
    {
        this.reservationId = reservationId;
        this.showtime = showtime;
        this.numberOfTickets = numberOfTickets;
        this.customerName = customerName;
    }
    public void setReservationId(int reservationId)
    {
        this.reservationId = reservationId;
    }

    public void setShowtime(String showtime)
    {
        this.showtime = showtime;
    }

    public void setNumberOfTickets(int numberOfTickets)
    {
        this.numberOfTickets = numberOfTickets;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public int getReservationId()
    {
        return reservationId;
    }

    public String getShowtime()
    {
        return showtime;
    }

    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    @Override
    public String toString()
    {
        return "Reservation ID: "+ reservationId + ", Ticket number: "+ numberOfTickets + ", The showtime: "+ showtime + ", Customer name: "+ customerName;
    }
}
