package repetidosarray;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 2, 1, 30, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2};

        RepetidosArray repetidosArray = new RepetidosArray(array);
        repetidosArray.run();
    }
}
