public class Pythag {
    public double calculateHypotenuse(double leg1, double leg2) {
        return Math.sqrt(leg1*leg1 + leg2*leg2);
    }
    public static void main(String[] args) {
        Pythag p = new Pythag();
        System.out.println(p.calculateHypotenuse(3,4));
    }
}