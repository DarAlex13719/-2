public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        //Демонстрация
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));

        System.out.println();
        System.out.println(intsCalc.mult(2, 7));
        System.out.println(intsCalc.pow(6, 4));
    }
}