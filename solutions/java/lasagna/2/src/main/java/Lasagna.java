public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int x) {
        int resultado = expectedMinutesInOven() - x;
        return resultado;
    }

    public int preparationTimeInMinutes(int x) {
        return x  * 2;
    }

    public int totalTimeInMinutes(int x, int y) {
        return preparationTimeInMinutes(x) + y;
    }
}
