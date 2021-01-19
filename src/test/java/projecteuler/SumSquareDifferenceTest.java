package projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumSquareDifferenceTest
{
    @Test
    void testSumSquareDifference()
    {
        assertEquals(385, SumSquareDifference.sumSquaresUpto(10));
        assertEquals(3025, SumSquareDifference.squareSubUpto(10));
    }

}