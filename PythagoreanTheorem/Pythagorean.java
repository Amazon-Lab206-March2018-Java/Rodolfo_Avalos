public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double sideA = Math.pow(legA, 2);
        double sideB = Math.pow(legB, 2);
        double hypotenuse = Math.sqrt(sideA+sideB);
        return hypotenuse;
    }
}
