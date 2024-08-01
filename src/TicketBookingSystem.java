import java.util.ArrayList;

public class TicketBookingSystem {
    private ArrayList<Movie> movies;
    private ArrayList<Showtime> showtimes;
    private ArrayList<Theater> theaters;
    private ArrayList<Reservation> reservations;

    public TicketBookingSystem()
    {
        this.movies = new ArrayList<>();
        this.showtimes = new ArrayList<>();
        this.theaters = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addMovie(Movie movie)
    {
        movies.add(movie);
        System.out.println("Movie Added! " + movie.getTitle());
    }

    public void addShowtime(Showtime showtime)
    {
        showtimes.add(showtime);
        System.out.println("Showtime Added! " + showtime.getTime());
    }

    public void addTheater(Theater theater)
    {
        theaters.add(theater);
        System.out.println("Theater Added! " + theater.getName());
    }

    public void addReservation(Reservation reservation)
    {
        reservations.add(reservation);
        System.out.println("Reservation Added! " + reservation.getReservationId() + ", Customer name: " + reservation.getCustomerName());
    }

    public void movieList()
    {
        System.out.println("list of movies: ");
        for(Movie m : movies)
        {
            System.out.println(m.getTitle());
        }
    }
}

