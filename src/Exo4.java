import java.util.Arrays;

public class Exo4 {                 // classe ArrayUtils dans l'énoncé

    ////////////////////////////////////////////////////////////
    //                                                        //
    //                Tableaux - Exercices 1                  //
    //                                                        //
    ////////////////////////////////////////////////////////////

    // https://koor.fr/Java/Tutorial/java_tableaux.wp
    // https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array

    public static void fillTab(int[] tab) {

        // Remplis le tableau de valeurs aléatoires comprises entre 0 et 99

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
            // Math.random renvoyant un double compris entre 0 et 1
            // Je dois le cast en int pour qu'il puisse intégrer ton tableau
            // après l'avoir multiplié par 100
        }

        // https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#fill(int[],%20int)

        // Arrays.fill(tab, (int) (Math.random() * 100));
        // Ne fonctionnera pas car la valeur de Math.random
        // n'est déterminée qu'une seule fois

    }


    public static void printTab(int[] tab) {

        // Affiche le tableau sur une seule ligne
        System.out.println(Arrays.toString(tab));
    }

    public static int getMax(int[] tab) {

        // Retourne la valeur maximum du tableau

        int result = tab[0];

/*
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > result) {
                result = tab[i];
            }
        }

 */

        // Ou

        for (int i : tab) {
            if (i > result) {
                result = i;
            }
        }

        return result;
    }

    public static void permute(int[] tab, int i, int j) {

        // Permute l'emplacement de i et j dans le tableau

        int buffer = tab[i];
        tab[i] = tab[j];
        tab[j] = buffer;

    }

    ////////////////////////////////////////////////////////////
    //                                                        //
    //                Tableaux - Exercices 2                  //
    //                                                        //
    ////////////////////////////////////////////////////////////

    public static int sum(int[] tab) {

        // 1. Retourne la somme

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            result += tab[i];
        }

        return result;
    }

    public static int average(int[] tab) {

        // 2. Retourne la moyenne

        return (sum(tab) / tab.length);
    }

    public static void supToAverage(int[] tab) {

        // 3. Affiche les valeurs supérieurs à la moyenne (ne retourne rien)

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > average(tab)) {
                System.out.println(tab[i]);
            }

        }

    }

    public static int numberOfMaxValue(int[] tab) {

        // 4. Retourne le nombre d'occurences de la valeur maximum (Version O(2n) et O(n))

        // https://marcarea.com/weblog/2019/01/21/complexite-algorithmique-et-notation-grand-o
        // https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(int[])

        // Malheureusement je ne comprend pas exactement ce qui est demandé en fin d'énoncé.

        // Visiblement, selon la taille du tableau, la rapidité avec laquelle une recherche
        // est effectué varie en fonction de l'algorythme utilisé, ce qui est logique.

        // En JS durant un exercice par exemple, nous coupions successivement
        // un tableau ordonné en deux pour limiter les tours de boucle.

        // Içi rien ne précise que le tableau en entrée est ordonné.
        // Je pourrai utilisé la méthode Arrays.sort(tab) mais j'ignore son comportement
        // et serait bien incapable de déterminer sa durée d'exécution.
        // Dans le cas où il y aurait une boucle parcourant l'ensemble du tableau pour
        // remettre les valeurs en ordre, il n'y aurait aucun gain (bien au contraire)
        // à ordonner le tableau puis appliqué ma solution précédement vue en JS
        // (autant déterminer directement durant la première boucle si oui ou non chaque
        // valeur est la plus grande et compter les occurences).

        int result = 0;
        int buffer = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > buffer) {
                buffer = tab[i];
                result = 1;
            }
            else if (tab[i] == buffer) {
                result++;
            }

        }

        return result;
    }

    public static int [] fusion(int [] x, int [] y) {

        // crée et retourne un nouveau tableau qui est la concaténation des 2 tableaux


        // Ma première solution :

/*
        int [] result = Arrays.copyOf(x, (x.length + y.length));

        for (int i = (x.length); i < (result.length); i++) {
            result[i] = y[i - x.length];
        }

        return result;
*/

        // La solution améliorée par IntelliJ
        // faisant appel à la méthode System.arraycopy

        int [] result = Arrays.copyOf(x, (x.length + y.length));

        if (result.length - x.length >= 0)
            System.arraycopy(y, x.length - x.length, result, x.length, result.length - x.length);

        return result;
    }

    ////////////////////////////////////////////////////////////
    //                                                        //
    //                Tableaux - Exercices 3                  //
    //                                                        //
    ////////////////////////////////////////////////////////////

    public static int [] add(int [] pTab, int pValeurNouvelle) {

        // Retourne un tableau avec une nouvelle valeur ajoutée

        int [] buffer = {pValeurNouvelle};
        return fusion(pTab, buffer);
    }

    public static int [] remove1(int [] pTab, int pIndiceASupprimer) {

        // Supprime un élément du tableau

        int [] result = new int [pTab.length - 1];
        System.arraycopy(pTab, 0, result, 0, pIndiceASupprimer);
        System.arraycopy(pTab, pIndiceASupprimer + 1, result, pIndiceASupprimer, result.length - pIndiceASupprimer);
        return result;
    }


    public static int [] remove2(int [] pTab, int pIndiceASupprimer) {

        int [] result = new int [pTab.length - 1];
        int buffer = pTab.length;

        if (buffer == pIndiceASupprimer) {

        }
        /*
        for (int i = 0; i < buffer; i++) {
            if(i != pIndiceASupprimer) {
                result[i] = pTab[i];
            }
                else {
                    result[i] = pTab[i];
                    buffer--;
                }
        }
        */

        return result;
    }
}


