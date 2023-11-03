package atletas;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Alejandro", 9.55);
        atleta1.correr400m();
        Atleta atleta2 = new Atleta("Anthony", 9.28);
        atleta2.correr400m();
        Atleta atleta3 = new Atleta("Diego", 9.53);
        atleta3.correr400m();
        Atleta atleta4 = new Atleta("Gilmar", 9.29);
        atleta4.correr400m();

        System.out.println();
        System.out.println(Atleta.getSeleccion());
        System.out.println();
        
        System.out.println(atleta1);
        System.out.println(atleta2);
        System.out.println(atleta3);
        System.out.println(atleta4);

        System.out.println();
        System.out.println(Atleta.getTimeTeam());
    }
}
