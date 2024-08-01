public class Movie {
    private int movieId;
    private String title, duration, genre;

    public Movie(int movieId, String title, String genre, String duration)
    {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public void setMoiveId(int movieId)
    {
        this.movieId = movieId;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public int getMovieId()
    {
        return movieId;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getDuration()
    {
        return duration;
    }

    @Override
    public String toString()
    {
        return "Movie ID: "+ movieId + ", Movie title: "+ title + ", Movie genre: "+ genre + ", Movie duration: "+ duration;
    }
}
