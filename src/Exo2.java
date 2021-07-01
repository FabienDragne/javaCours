public class Exo2
{

    public static void main (String[] args)
    {
        // Question 1

        System.out.println("Question : 1\n");

        System.out.println("Monsieur X a 21 ans, est-il majeur?");
        boolean monsieurX = estMajeur(21);
        if(monsieurX)
        {
            System.out.println("Oui, il est majeur.");
        }
        else System.out.println("non, il est mineur.");

        System.out.println("\nMadame Y a 15 ans, est-elle majeure?");
        boolean madameY = estMajeur(15);
        if(madameY)
        {
            System.out.println("Oui, elle est majeure.");
        }
        else System.out.println("non, elle est mineure.");

        System.out.println("\n--------------------------------------------");

        // Question 2

        System.out.println("Question : 2\n");

        System.out.println("Est-ce que 3.71 est positif, négatif ou nul?\n");
        signe(3.71);

        System.out.println("Est-ce que 4.78 est positif, négatif ou nul?\n");
        signe(-4.78);

        System.out.println("Est-ce que 0 est positif, négatif ou nul?\n");
        signe(0);

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

    public static boolean estMajeur(int x)
    {
        return x >= 18;
    }

    public static void signe(double x)
    {
        if (x > 0)
        {
            System.out.println(x + " est positif.");
        }
            else if (x < 0)
        {
            System.out.println(x + " est négatif.");
        }
            else
        {
            System.out.println(x + " est nul.");
        }

    }

    public static int plusGrand2(int x, int y)
    {
        int result = y;

        if(y < x)
        {
            result = x;
        }

        return result;
    }

    public static int plusPetit2(int x, int y)
    {
        int result = y;

        if(x < y)
        {
            result = x;
        }

        return result;
    }

    public static int plusPetit3(int x, int y, int z)
    {
        int result = z;

        if((x < y) && (x < z))
        {
            result = x;
        }

        else if((y < x) && (y < z))
        {
            result = y;
        }

        return result;
    }

    public static int primePlusPetit3(int x, int y, int z)
    {
        return plusPetit2(plusPetit2(x,y),z);
    }

    public static int plusGrand3(int x, int y, int z)
    {
        int result = z;

        if((x > y) && (x > z))
        {
            result = x;
        }

        else if((y > x) && (y > z))
        {
            result = y;
        }

        return result;
    }

    public static boolean positifsOuPas(double x, double y, double z)
    {
        if((x > 0) || (y > 0) || (z > 0))
        {
            return true;
        }

        return false;
    }






}
