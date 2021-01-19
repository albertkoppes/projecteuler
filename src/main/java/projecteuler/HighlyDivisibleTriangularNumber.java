package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class HighlyDivisibleTriangularNumber
{
    public static void main(String[] args)
    {
        int number = 1;
        int currentTriangle = 1;
        while (getFactorsOf(currentTriangle).size() <= 500)
        {
            number += 1;
            currentTriangle = currentTriangle + number;
        }
        System.out.println("Highly divisible triangular number " + currentTriangle);
    }

    static List<Integer> getFactorsOf(int number)
    {
        List<Integer> factors = new ArrayList<>();
        for (int i=1; i<((number/2)+1); i++)
        {
            if (number%i == 0)
            {
                factors.add(i);
            }
        }
        return factors;
    }
}
