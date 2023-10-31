package movies;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Gandhi", "Richard Attenborough", Movie.enumGenre.DRAMA, 191, 1982, 8.3);
        Movie movie2 = new Movie("Thor", "Kenneth Branagh", Movie.enumGenre.ACCION, 115, 2011, 7.0);

        System.out.println(movie1);
        System.out.println();
        System.out.println(movie2);
        System.out.println();
        System.out.println("La pelicula " + movie1.getName() + " es epica: " + movie1.esPeliculaEpica());
        System.out.println("La pelicula " + movie2.getName() + " es epica: " + movie2.esPeliculaEpica());
        System.out.println();
        System.out.println("La pelicula " + movie1.getName() +
                " y la pelicula " + movie2.getName() + " son similares: " + movie1.esSimilar(movie2));
    }
}
