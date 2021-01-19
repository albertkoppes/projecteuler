package projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LargestProductInASeriesTest
{
    @Test
    void testMaxProduct()
    {
        int[] integers = LargestProductInASeries.readNumbersFromFile("C:\\Development\\IdeaProjects\\puzzels\\projecteuler\\src\\test\\java\\projecteuler\\Input.txt");
        assertEquals(5832, LargestProductInASeries.maxAdjacentProduct(4, integers));
    }

}