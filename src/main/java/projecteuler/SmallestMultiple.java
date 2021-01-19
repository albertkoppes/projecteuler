package projecteuler;

import static projecteuler.LCM.LCM;

public class SmallestMultiple
{
    public static void main(String[] args)
    {
        System.out.println("smallest common multiple from 1 to 20: " +
            getSmallestCommonMultiple(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    }

    static long getSmallestCommonMultiple(long... numbers)
    {
        long lcm = 0;
        if (numbers.length == 1)
        {
            return numbers[0];
        }
        else if (numbers.length > 1)
        {
            lcm = LCM(numbers[0], numbers[1]);
            for (int i = 2; i < numbers.length; i++)
            {
                lcm = LCM(numbers[i], lcm);
            }
        }
        return lcm;
    }

}
