public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*
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

        // test fonction multiplication

        System.out.println(MesMaths.multiplication5for(3));
        System.out.println(MesMaths.multiplication5while(3));
        System.out.println(MesMaths.multiplication5do(3));

        MesMaths.run();
    }
    */

        // Exo 3 :

        // Question 1 :
        System.out.println("Question : 1\n");
        System.out.println(Exo3.sansE("On ne fait pas d'omelette sans casser des oeufs"));
        System.out.println("\n--------------------------------------------");

        // Question 2 :
        System.out.println("Question : 2\n");
        System.out.println(Exo3.nombreDeA("On ne fait pas d'omelette sans casser des oeufs"));
        System.out.println("\n--------------------------------------------");

        // Question 3 :
        System.out.println("Question : 3\n");
        System.out.println(Exo3.reverse("Toto"));
        System.out.println("\n--------------------------------------------");

        // Question 4 :
        System.out.println("Question : 4\n");
        System.out.println(Exo3.nombreDeMajuscule("Il Y A Normalement 8 Majuscules Dans Cette Phrases."));
        System.out.println("\n--------------------------------------------");

        // Question 5 :
        System.out.println("Question : 5\n");
        System.out.println(Exo3.supprimerVoyelle("ici nous avons une phrase de test sans majuscule"));
        System.out.println("\n--------------------------------------------");

        // Question 6 :
        System.out.println("Question : 6\n");
        System.out.println(Exo3.majusculeVersMinuscule("CECI EST UNE PHRASE DE TEST TOUTE EN MAJUSCULE"));
        System.out.println("\n--------------------------------------------");

        // Question 7 :
        System.out.println("Question : 7\n");
        System.out.println(Exo3.plusGrandCharDeLaChaine("mais quel sera le plus grand caractere?"));
        System.out.println("\n--------------------------------------------");

        // Question 8 :
        System.out.println("Question : 8\n");
        System.out.println(Exo3.deleteBlankAtBegining("      toto en vacances"));
        System.out.println("\n--------------------------------------------");

        // Question bonus 1 :
        System.out.println("Question bonus 1 :\n");
        System.out.println("|" + Exo3.deleteBlankAtBeginingAndEnd("  totoen vacance  ") + "|");
        System.out.println("\n--------------------------------------------");

        // Question bonus 2 :
        System.out.println("Question bonus 2 :\n");

        String palindromeTest1 = "kazazak";
        String palindromeTest2 = "kazzak";
        String palindromeTest3 = "bonjour";

        System.out.println("Est-ce que " + '"' + palindromeTest1 + '"' + " est un palindrome?");
        System.out.println(Exo3.estUnPalindrome(palindromeTest1) + "\n");

        System.out.println("Est-ce que " + '"' + palindromeTest2 + '"' + " est un palindrome?");
        System.out.println(Exo3.estUnPalindrome(palindromeTest2) + "\n");

        System.out.println("Est-ce que " + '"' + palindromeTest3 + '"' + " est un palindrome?");
        System.out.println(Exo3.estUnPalindrome(palindromeTest3) + "\n");

        System.out.println("\n--------------------------------------------");

        // Question bonus 3 :
        System.out.println("Question bonus 3 :\n");
        System.out.println();
        System.out.println("\n--------------------------------------------");

    }
}
