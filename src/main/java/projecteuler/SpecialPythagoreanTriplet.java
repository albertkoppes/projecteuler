package projecteuler;

public class SpecialPythagoreanTriplet
{

    public static void main(String[] args)
    {

        for (int a = 1; a < 1000; a++)
        {
            for (int b = 1; b < 1000; b++)
            {
                double sqrt = Math.sqrt(a * a + b * b);
                if ((sqrt % 1) == 0)
                {
                    int c = (int)Math.round(sqrt);
                    if (a + b + c == 1000)
                    {
                        System.out.println("" + a + " " + b + " " + c);
                        System.out.println(a * b * c);
                    }
                }

            }
        }
    }
}
