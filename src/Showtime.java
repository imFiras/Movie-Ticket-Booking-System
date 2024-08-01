public class Showtime {
    private int showtimeId;
    private String movie, time, theater;

    public Showtime(int showtimeId, String time, String movie, String theater)
    {
        this.showtimeId = showtimeId;
        this.time = time;
        this.movie = movie;
        this.theater = theater;
    }

    public void setShowtimeId(int showtimeId)
    {
        this.showtimeId = showtimeId;
    }

    public void settime(String time)
    {
        this.time = time;
    }

    public void setMovie(String movie)
    {
        this.movie = movie;
    }

    public void setTheater(String theater)
    {
        this.theater = theater;
    }

    public int getShowtimeId()
    {
        return showtimeId;
    }

    public String getTime()
    {
        return time;
    }

    public String getMovie()
    {
        return movie;
    }

    public String getTheater()
    {
        return theater;
    }

    @Override
    public String toString()
    {
        return "Showtime ID: "+ showtimeId + ", Movie: "+ movie + ", Movie time: "+ time + ", theater: "+ theater;
    }
}
