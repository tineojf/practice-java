package articulos;

public class Main {
    public static void main(String[] args) {
        String[] palabras = {"Física", "Espacio", "Tiempo"};
        Articulo articulo1 = new Articulo("La teoría de la relatividad", "Albert Einstein",
                palabras, "Revista de Física", 1905,
                "La teoría de la relatividad especial, es una teoría física basada en dos principios fundamentales");
        System.out.println(articulo1);
    }
}
