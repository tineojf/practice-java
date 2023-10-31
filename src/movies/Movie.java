package movies;

public class Movie {
    public enum enumGenre {ACCION, COMEDIA, DRAMA, SUSPENSO, OTRO}

    private final String name;
    private final String director;
    private final enumGenre genre;
    private final int duration;
    private final int year;
    private double rating;

    // Constructor
    public Movie(String name, String director, enumGenre genre, int duration, int year, double rating) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.duration = duration;
        this.year = year;
        this.rating = rating;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public enumGenre getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    private void setRating(double rating) {
        this.rating = rating;
    }

    // To String
    @Override
    public String toString() {
        return "Movie: " + this.name + "\n"
                + "Director: " + this.director + "\n"
                + "Genre: " + this.genre + "\n"
                + "Duration: " + this.duration + " min\n"
                + "Year: " + this.year + "\n"
                + "Rating: " + this.rating + "\n";
    }

    // Methods
    private boolean esPeliculaEpica() {
        return this.duration >= 180;
    }

    private String calcularValoracion() {
        if (this.rating >= 0 && this.rating <= 2) {
            return "Muy mala";
        } else if (this.rating > 2 && this.rating <= 5) {
            return "Mala";
        } else if (this.rating > 5 && this.rating <= 7) {
            return "Regular";
        } else if (this.rating > 7 && this.rating <= 8) {
            return "Buena";
        } else if (this.rating > 8 && this.rating <= 10) {
            return "Muy buena";
        } else {
            return "Valoración no válida";
        }
    }

    private boolean esSimilar(Movie movie) {
        return this.genre == movie.genre && this.rating == movie.rating;
    }
}
