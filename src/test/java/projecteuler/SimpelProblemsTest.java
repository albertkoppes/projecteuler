package projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import static projecteuler.SimpelProblems.isPrime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpelProblemsTest
{
    @Test
    void testPrimes()
    {
        Assertions.assertTrue(isPrime(29));
        Assertions.assertFalse(isPrime(1000));
        Assertions.assertFalse(isPrime(1000000));
        Assertions.assertFalse(isPrime(1000000000));
        Assertions.assertFalse(isPrime(600851475143L));
    }

    @Test
    void testFindNthPrime()
    {
        // 1,2,3,5,7,11,13,17
        Assertions.assertEquals(2, SimpelProblems.findNthPrime(1));
        Assertions.assertEquals(3, SimpelProblems.findNthPrime(2));
        Assertions.assertEquals(5, SimpelProblems.findNthPrime(3));
        Assertions.assertEquals(7, SimpelProblems.findNthPrime(4));
        Assertions.assertEquals(11, SimpelProblems.findNthPrime(5));
        Assertions.assertEquals(13, SimpelProblems.findNthPrime(6));
    }

}