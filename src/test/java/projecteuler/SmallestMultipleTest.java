package projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestMultipleTest
{
    @Test
    void testLCM1to10()
    {
        Assertions.assertEquals(2520, SmallestMultiple.getSmallestCommonMultiple(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

}