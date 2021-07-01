public class MesMaths {

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

