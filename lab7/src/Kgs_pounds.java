public class Kgs_pounds {

    public static void main(String[] args) {
        final double POUNDS_PER_KG = 2.2;

        System.out.printf("%-12s%-8s%-8s%-12s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        for (int kgs = 1, lbs = 20; kgs <= 199 && lbs <= 515; kgs += 2, lbs += 5) {
            double pounds = kgs * POUNDS_PER_KG;
            double kilograms = lbs / POUNDS_PER_KG;
            System.out.printf("%-12s%-8.2f%-8s%-12.2f\n", kgs, pounds, lbs, kilograms);
        }

    }

}
