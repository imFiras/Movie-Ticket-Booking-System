public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie(18, "Oppenheimer", "Thriller/Historical drama", "189 minutes");

        Theater theater1 = new Theater(11, 54,"Vox Cinema", "Town Square");

        Reservation reservation1 = new Reservation(11454, "12:30AM", 65, "Firas");

        Showtime showtime1 = new Showtime(12, "12:30AM", "Oppenheimer","Vox Cinema");

        TicketBookingSystem system = new TicketBookingSystem();
        system.addMovie(movie1);

        system.addTheater(theater1);
        system.addReservation(reservation1);
        system.addShowtime(showtime1);

        System.out.println("---");
        Movie movie2 = new Movie(20, "The Fabelmans", "Drama", "95 minutes");
        system.addMovie(movie2);
        system.movieList();
    }
}