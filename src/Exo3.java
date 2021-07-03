// Ligne suivante utilisée pour un test sur la question 1
import java.util.ArrayList;
import java.util.Locale;

public class Exo3 {

    public static String sansE(String x) {

        // Question : 1
        // Retourne la phrase en entrée sans les 'e' ("j'aime les omelettes sans e")
        // Ne pas utiliser les fonctions de la classe String
        // à part le length() et le charAt()

        int numberOfE = 0;
        String result = "";

        for(int i = 0; i < x.length(); i++) {
            char compare = x.charAt(i);
            if((compare == 'e') || (compare == 'E')) {
                numberOfE++;
            } else {
                result += compare;
            }
        }

        // Tentative d'utilisation d'une liste pour
        // pouvoir ajouter des éléments à un tableau

        /*
                ArrayList result = new ArrayList(x.length());

        for(int i = 0; i < x.length(); i++) {
            char compare = x.charAt(i);
            if(compare != 'e')
            {
                result.add(compare);
            }
        }
         */

        return result;
    }

    public static int nombreDeA(String x) {

        // Question : 2
        // Retourne le nombre de 'a'

        int numberOfA = 0;

        for(int i = 0; i < x.length(); i++) {
            char compare = x.charAt(i);
            if((compare == 'a') || (compare == 'A')) {
                numberOfA++;
            }
        }

        return numberOfA;

    }

    public static String reverse(String x) {

        // Question : 3
        // Retourne la chaîne à l'envers "toto" -> "otot"

        String result = "";

        for(int i = x.length()-1; i >= 0; i--) {
            result += x.charAt(i);
        }

        return result;
    }

    public static int nombreDeMajuscule(String x) {

        // Question : 4
        // Compte le nombre de majuscule(s)
        // Utiliser : Character.isUppercase()

        int result = 0;

        for(int i = 0; i < x.length(); i++) {
            if(Character.isUpperCase(x.charAt(i))) {
                result++;
            }
        }

        return result;
    }

    public static String supprimerVoyelle(String x) {

        // Question : 5
        // Supprime les voyelles
        // (chaîne d'entrée en minuscule uniquement)

        String result = "";
        char trash = 'a';

        for(int i = 0; i < x.length(); i++) {
            char compare = x.charAt(i);
            switch(compare) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> trash = compare;
                default -> result += compare;
            }

        // J'ai du créer une variable char trash car je ne pouvais laisser
        // la case de mon switch sans instruction
        // ou alors j'aurai du noter toutes les consonnes (plus long)
        // en lieu et place des voyelles

        }

        return result;
    }

    public static String majusculeVersMinuscule(String x) {

        // Question : 6
        // Retourne la chaîne sans les majuscules

        // Ca c'était l'idée de base :
        // (caractère par caractère)

        /*
        String result = "";

        for(int i = 0; i < x.length(); i++) {
            result += Character.toLowerCase(x.charAt(i));
        }
         */

        // Mais finalement :

        return x.toLowerCase();

    }

    public static char plusGrandCharDeLaChaine(String x) {

        // Question : 7
        // Plus grand caractère de la chaîne
        // (chaîne d'entrée en minuscule uniquement)

        char result = x.charAt(0);
        char compare;

        for(int i = 1; i < x.length(); i++) {
            compare = x.charAt(i);
            if(result < compare) {
                result = compare;
            }
        }

        return result;
    }

    public static String deleteBlankAtBegining(String x) {

        // Question : 8
        // Retirer les espaces mais uniquement au début de la chaîne

        String result = "";
        boolean active = true;

        for(int i = 0; i < x.length(); i++) {
            if((x.charAt(i) == ' ') && active) {
            }                                               // Il y a sûrement plus élégant
            else if((x.charAt(i) != ' ') && active) {
                result += x.charAt(i);
                active = false;
            } else {
                result += x.charAt(i);
            }
        }
        return result;
    }

    public static String deleteBlankAtBeginingAndEnd(String x) {
        
        // Question bonus : 1
        // Retirer les espaces au début et à la fin (trim)
        // "  totoen vacance " -> "totoen vacance"

        return reverse(deleteBlankAtBegining(reverse(deleteBlankAtBegining(x))));

        // Ancienne version

        /*
        String buffer = deleteBlankAtBegining(x);
        int endBlankNumber = 0;
        String result = "";
        boolean active = true;

        while(active) {
        // La boucle while içi n'est pas indispensable
        // elle permet simplement à la boucle for en dessous de terminer plus tôt
            for(int i = (buffer.length()-1); i >= 0 ; i--) {
                if ((buffer.charAt(i) == ' ') && active) {
                    endBlankNumber++;
                } else if ((buffer.charAt(i) != ' ') && active) {
                    active = false;
                }
            }
        }

        for(int i = 0; i < (buffer.length() - endBlankNumber); i++) {
            result += buffer.charAt(i);
        }

         */

    }

    public static boolean estUnPalindrome(String x) {

        // Question bonus : 2
        // Indique si une chaîne est un palindrome

        String reversed = reverse(x);
        String buffer1 = "";
        String buffer2 = "";

        for(int i = 0; i < (x.length()/2); i++) {
            buffer1 += x.charAt(i);
            buffer2 += reversed.charAt(i);
        }

        return buffer1.equalsIgnoreCase(buffer2);

        // Ancien code
        /*
        boolean result = false;
        String buffer = "";
        String reverseBuffer = "";

        if((x.length()) % 2 == 0) {
            for(int i = 0; i < (x.length()/2); i++) {
                buffer += x.charAt(i);
            }
            for(int i = x.length()-1; i >= (x.length()/2); i--) {
                reverseBuffer += x.charAt(i);
            }
            result = buffer.equalsIgnoreCase(reverseBuffer);

        }

        if((x.length()) % 2 != 0) {
            for(int i = 0; i < (x.length()/2); i++) {
                buffer += x.charAt(i);
            }
            for(int i = x.length()-1; i >= (x.length()/2)+1; i--) {
                reverseBuffer += x.charAt(i);
            }
            result = buffer.equalsIgnoreCase(reverseBuffer);
        }

        return result;

         */
    }

    public static boolean isPasswordValid(String x) {

        // Question bonus : 3
        // Vérifie si une chaine est un mot de passe valide :
        // 8 chars min, 1 maj | min | chiffre

        Boolean oneLowerCaseCheck = false;
        Boolean oneNumberCheck = false;

        for(int i = 0; i < x.length(); i++) {
            if (Character.isLowerCase(x.charAt(i))) {
                oneLowerCaseCheck = true;
            }
            else if (Character.isDigit(x.charAt(i))) {
                oneNumberCheck = true;
            }
        }

        return (x.length() >= 8) && (nombreDeMajuscule(x) > 0) && oneLowerCaseCheck && oneNumberCheck;

    }

}
