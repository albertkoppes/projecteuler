package projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest
{
    @Test
    void testRevertInt()
    {
        Assertions.assertEquals(123, Palindrome.revertInt(321));
    }

}