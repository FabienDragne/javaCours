import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {

/*

        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("//                                                        //");
        System.out.println("//                                                        //");
        System.out.println("//                    Exo 1 :                             //");
        System.out.println("//                                                        //");
        System.out.println("//                                                        //");
        System.out.println("////////////////////////////////////////////////////////////\n");

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

        System.out.println("\n--------------------------------------------\n");

        // Question 2

        System.out.println("Question : 2\n");

        System.out.println("Est-ce que 3.71 est positif, négatif ou nul?\n");
        MesMaths.signe(3.71);

        System.out.println("Est-ce que 4.78 est positif, négatif ou nul?\n");
        MesMaths.signe(-4.78);

        System.out.println("Est-ce que 0 est positif, négatif ou nul?\n");
        MesMaths.signe(0);

        System.out.println("\n--------------------------------------------\n");

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

/*
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("//                                                        //");
        System.out.println("//                                                        //");
        System.out.println("//                    Exo 2 : Les boucles                 //");
        System.out.println("//                                                        //");
        System.out.println("//                                                        //");
        System.out.println("////////////////////////////////////////////////////////////\n");

        // Exo 3 :

        // Question 1 :
        System.out.println("Question : 1\n");
        System.out.println(Exo3.sansE("On ne fait pas d'omelette sans casser des oeufs"));
        System.out.println("\n--------------------------------------------\n");

        // Question 2 :
        System.out.println("Question : 2\n");
        System.out.println(Exo3.nombreDeA("On ne fait pas d'omelette sans casser des oeufs"));
        System.out.println("\n--------------------------------------------\n");

        // Question 3 :
        System.out.println("Question : 3\n");
        System.out.println(Exo3.reverse("Toto"));
        System.out.println("\n--------------------------------------------\n");

        // Question 4 :
        System.out.println("Question : 4\n");
        System.out.println(Exo3.nombreDeMajuscule("Il Y A Normalement 8 Majuscules Dans Cette Phrases."));
        System.out.println("\n--------------------------------------------\n");

        // Question 5 :
        System.out.println("Question : 5\n");
        System.out.println(Exo3.supprimerVoyelle("ici nous avons une phrase de test sans majuscule"));
        System.out.println("\n--------------------------------------------\n");

        // Question 6 :
        System.out.println("Question : 6\n");
        System.out.println(Exo3.majusculeVersMinuscule("CECI EST UNE PHRASE DE TEST TOUTE EN MAJUSCULE"));
        System.out.println("\n--------------------------------------------\n");

        // Question 7 :
        System.out.println("Question : 7\n");
        System.out.println(Exo3.plusGrandCharDeLaChaine("mais quel sera le plus grand caractere?"));
        System.out.println("\n--------------------------------------------\n");

        // Question 8 :
        System.out.println("Question : 8\n");
        System.out.println(Exo3.deleteBlankAtBegining("      toto en vacances"));
        System.out.println("\n--------------------------------------------\n");

        // Question bonus 1 :
        System.out.println("Question bonus 1 :\n");
        System.out.println("|" + Exo3.deleteBlankAtBeginingAndEnd("  totoen vacance  ") + "|");
        System.out.println("\n--------------------------------------------\n");

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

        System.out.println("\n--------------------------------------------\n");

        // Question bonus 3 :
        System.out.println("Question bonus 3 :\n");

        String passwordTest1 = "Bz123456";              // est valide
        String passwordTest2 = "x80056dBBce";           // est valide
        String passwordTest3 = "azerty123";             // est invalide
        String passwordTest4 = "zxGhCfDuiJkMl";         // est invalide

        System.out.println("Est-ce que " + '"' + passwordTest1 + '"' + " est un mot de passe valide?");
        System.out.println(Exo3.isPasswordValid(passwordTest1));

        System.out.println("Est-ce que " + '"' + passwordTest2 + '"' + " est un mot de passe valide?");
        System.out.println(Exo3.isPasswordValid(passwordTest2));

        System.out.println("Est-ce que " + '"' + passwordTest3 + '"' + " est un mot de passe valide?");
        System.out.println(Exo3.isPasswordValid(passwordTest3));

        System.out.println("Est-ce que " + '"' + passwordTest4 + '"' + " est un mot de passe valide?");
        System.out.println(Exo3.isPasswordValid(passwordTest4));

        System.out.println("\n--------------------------------------------\n");

*/

        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("//                                                        //");
        System.out.println("//                                                        //");
        System.out.println("//                    Exo 3 : Tableaux                    //");
        System.out.println("//                                                        //");
        System.out.println("//                                                        //");
        System.out.println("////////////////////////////////////////////////////////////\n");

        System.out.println("////////////////////////////////////////////");
        System.out.println("//                                        //");
        System.out.println("//              Exercices 1               //");
        System.out.println("//                                        //");
        System.out.println("////////////////////////////////////////////\n");

        int [] tabTest1 = new int[10];

        System.out.println("Exemple d'un tableau de 10 cases rempli de valeurs");
        System.out.println("comprises entre 0 et 99 :\n");

        Exo4.fillTab(tabTest1);

        System.out.println(tabTest1);
        // Ne renvoie pas le résultat escompté (l'affichage du tableau)
        // Mais le hashCode()
        // http://www.prados.fr/java/les-methodes-de-la-classe-objet/la-methode-hashcode

        System.out.println(Arrays.toString(tabTest1));
        // On utilisera la méthode Arrays.toString pour
        // l'affichage d'un tableau avec System.out.print

        System.out.println("\n           ---------------------           \n");

        System.out.println("Impression du tableau grâce à ma nouvelle fonction printTab : ");

        Exo4.printTab(tabTest1);

        System.out.println("\n           ---------------------           \n");

        System.out.println("Exemple de ma fonction getMax : ");
        System.out.println(Exo4.getMax(tabTest1));

        System.out.println("\n           ---------------------           \n");

        System.out.println("Exemple de ma fonction permute : ");
        System.out.println("tableau avant : ");
        System.out.println(Arrays.toString(tabTest1));

        Exo4.permute(tabTest1, 0, 1);

        System.out.println("tableau après : ");
        System.out.println(Arrays.toString(tabTest1));

        System.out.println();

        System.out.println("////////////////////////////////////////////");
        System.out.println("//                                        //");
        System.out.println("//              Exercices 2               //");
        System.out.println("//                                        //");
        System.out.println("////////////////////////////////////////////\n");

        System.out.println("Exemple de ma fonction sum qui additionne toutes");
        System.out.println("les valeurs d'un tableau entre elles : \n");

        System.out.println(Exo4.sum(tabTest1));

        System.out.println("\n           ---------------------           \n");

        System.out.println("Exemple de ma fonction average qui donne la moyenne");
        System.out.println("des valeurs d'un tableau : \n");

        System.out.println(Exo4.average(tabTest1));

        System.out.println("\n           ---------------------           \n");

        System.out.println("Exemple de ma fonction supToAverage qui renvoie");
        System.out.println("les valeurs d'un tableau supérieures à la moyenne : \n");

        Exo4.supToAverage(tabTest1);

        System.out.println("\n           ---------------------           \n");

        int [] tabTest2 = {1, 2, 3, 4, 10, 6, 7, 8, 10, 10};
        int [] tabTest3 = {1, 2, 3, 4,  5, 6, 7, 8,  9, 10};

        System.out.println("Exemple de ma fonction numberOfMaxValue : ");
        System.out.println(Exo4.numberOfMaxValue(tabTest2));
        System.out.println(Exo4.numberOfMaxValue(tabTest3));

        System.out.println("\n           ---------------------           \n");

        System.out.println("Exemple de ma fonction fusion : ");
        System.out.println(Arrays.toString(Exo4.fusion(tabTest2, tabTest3)));

        System.out.println();

        System.out.println("////////////////////////////////////////////");
        System.out.println("//                                        //");
        System.out.println("//              Exercices 2               //");
        System.out.println("//                                        //");
        System.out.println("////////////////////////////////////////////\n");

        System.out.println("Exemple de ma fonction add : ");
        System.out.println("(Ajout d'une case ayant pour valeur 5 au tableau tabTest2)");
        System.out.println(Arrays.toString(Exo4.add(tabTest2, 5)));

        System.out.println("\n           ---------------------           \n");

        System.out.println("Exemple de ma fonction remove1 : ");
        System.out.println("(retrait de l'index 4 du tableau tabTest2)");
        System.out.println(Arrays.toString(Exo4.remove1(tabTest2, 4)));

        System.out.println("\n");

        System.out.println("Exemple de ma fonction remove2 : ");
        System.out.println("(retrait de l'index 4 du tableau tabTest2)");
        System.out.println(Arrays.toString(Exo4.remove2(tabTest2, 4)));

        System.out.println("\n");

        int [] test = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9, 10};
        System.out.println("Exemple de ma fonction remove3 : ");
        System.out.println("(retrait de l'index 4 du tableau test)");
        System.out.println(Arrays.toString(Exo4.remove3(test, 5)));
     }
    
}
