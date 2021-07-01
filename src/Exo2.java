public class Exo2 {

    public static void main(String[] args) {
        // Question 1

        System.out.println("Question : 1\n");

        System.out.println("Monsieur X a 21 ans, est-il majeur?");
        boolean monsieurX = MesMaths.estMajeur(21);
        if (monsieurX) {
            System.out.println("Oui, il est majeur.");
        } else System.out.println("non, il est mineur.");

        System.out.println("\nMadame Y a 15 ans, est-elle majeure?");
        boolean madameY = MesMaths.estMajeur(15);
        if (madameY) {
            System.out.println("Oui, elle est majeure.");
        } else System.out.println("non, elle est mineure.");

        System.out.println("\n--------------------------------------------");

        // Question 2

        System.out.println("Question : 2\n");

        System.out.println("Est-ce que 3.71 est positif, négatif ou nul?\n");
        MesMaths.signe(3.71);

        System.out.println("Est-ce que 4.78 est positif, négatif ou nul?\n");
        MesMaths.signe(-4.78);

        System.out.println("Est-ce que 0 est positif, négatif ou nul?\n");
        MesMaths.signe(0);

        System.out.println("\n--------------------------------------------");

        // Question 3

        System.out.println("Question : 3\n");

        // Question 4

        System.out.println("Question : 4\n");

        // Question 5

        System.out.println("Question : 5\n");

        // Question 6

        System.out.println("Question : 6\n");

        // Question 7

        System.out.println("Question : 7\n");

        // Question 8

        System.out.println("Question : 8\n");

        // Question 9

        System.out.println("Question : 9\n");

    }

}
