public class Calc {
    public static void main(String[] args) {
        Math math = new Math();
        boolean x = math.isEven(3);
        System.out.println("Czy liczba jest parzysta? " + x);
        boolean y = math.isOdd(3);
        System.out.println("Czy liczba jest nieparzysta? " + y);
        double a = math.circleField(3.33);
        System.out.println("Pole koła wynosi: " + a);
        int b = math.power(3);
        System.out.println("Wynik równa się: " + b);
    }
}
