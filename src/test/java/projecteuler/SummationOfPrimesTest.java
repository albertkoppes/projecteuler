package projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SummationOfPrimesTest
{
    @Test
    void testSummationOfPrimes()
    {
        Assertions.assertEquals(17, SummationOfPrimes.getSummationOfPrimesUpto(10));

    }

}