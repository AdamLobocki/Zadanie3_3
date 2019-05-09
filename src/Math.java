public class Math {

    void isEven(int a){
        boolean x = (a % 2 == 0);
        System.out.println("czy " + a + " jest parzysta?");
        System.out.println(x);

    }

    void isOdd(int a){
        boolean x = (a % 2 != 0);
        System.out.println("czy " + a + " jest nieparzysta?");
        System.out.println(x);

    }
    void circleField(double r){
        double p = r * r * 3.14;
        System.out.println("Pole koła równa się: " + p);
    }
void power(int x){
        int wynik = x*x;
    System.out.println(x + " do kwadratu równa się: " + wynik);
}

}
