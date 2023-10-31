package articulos;

public class Articulo {
    private String titulo;
    private String autor;
    private String[] palabrasClave;
    private String nombrePublicacion;
    private int year;
    private String resumen;

    // Constructor
    public Articulo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Articulo(String titulo, String autor, String[] palabrasClave, String nombrePublicacion, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClave = palabrasClave;
        this.nombrePublicacion = nombrePublicacion;
        this.year = year;
    }

    public Articulo(String titulo, String autor, String[] palabrasClave, String nombrePublicacion, int year, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClave = palabrasClave;
        this.nombrePublicacion = nombrePublicacion;
        this.year = year;
        this.resumen = resumen;
    }

    // To String
    @Override
    public String toString() {
        String listaPalabrasClave = "";
        for (int i = 0; i < this.palabrasClave.length; i++) {
            listaPalabrasClave += this.palabrasClave[i] + ", ";
        }

        return "Articulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Palabras clave: " + listaPalabrasClave + "\n" +
                "Nombre de la publicacion: " + this.nombrePublicacion + "\n" +
                "Año: " + this.year + "\n" +
                "Resumen: " + this.resumen + "\n";
    }
}
