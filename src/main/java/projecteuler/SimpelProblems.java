package projecteuler;

import java.math.BigInteger;

public class SimpelProblems
{
    public static void main(String[] args)
    {
        System.out.println("Sum of multiples of 3 and 5 between 0 and 1000 = " + multiplesOf3and5Beween0And(1000));
        System.out.println("Sum of even valued fibonacci numbers under 4000000 = " + sumOfEvenFibonacciTermsUnder(4000000));
        System.out.println("Largest prime factor of 600851475143  = " + calcLargestPrimeFactorOf(600851475143L ));// =  6857, but takes some time
        System.out.println("Largest prime factor of 600851475143  = " + solutionFromWeb(600851475143L ));// =  6857, but takes some time
        long nthPrime = findNthPrime(10001);
        System.out.println("nthPrime: "+ nthPrime);

    }

    private static int sumOfEvenFibonacciTermsUnder(int upperLimit)
    {
        int sum = 0;
        int fibo1 = 1;
        int fibo2 = 2;
        int temp = 0;
        while (fibo1 < upperLimit)
        {
            if (fibo1%2 == 0)
            {
                sum += fibo1;
            }
            temp = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = temp;
        }
        return sum;
    }

    private static int multiplesOf3and5Beween0And(long upperLimit)
    {
        int sum = 0;
        for (int i = 1; i < upperLimit; i++)
        {
            if (i%3==0 || i%5==0)
            {
                sum += i;
            }
        }
        return sum;
    }

    private static long calcLargestPrimeFactorOf(long number)
    {
        long divider = 2;
        long currentNumber = number;
        long largestPrimeFactor = 2;
        while (divider < (number +1 )/ 2 )
        {
            if (currentNumber%divider == 0)
            {
                largestPrimeFactor = divider;
                currentNumber = currentNumber/divider;
            }
            else
            {
                divider = divider+1;
            }
        }
        return largestPrimeFactor;
    }

    protected static boolean isPrime(long number)
    {
        for (long i = 2; i < number/2 + 1; i++)
        {
            if (number%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    private static int solutionFromWeb(long number)
    {
        BigInteger big = new BigInteger("" + number);
        int max = 0;
        for (int i = 100; i < 9999999; i++)
        {
            if ((new BigInteger(i * i + "").compareTo(big) < 0) && isPrime(i))
            {
                if (big.mod(new BigInteger(i + "")).compareTo(BigInteger.ZERO) == 0)
                {
                    max = i;
                    System.out.println(max);
                }
            }
        }
        return max;
    }


    static long findNthPrime(int n)
    {
        int counter = 1;
        int currentNumber = 1;
        while (counter <= n)
        {
            if (isPrime(++currentNumber))
            {
                counter++;
            }
        }
        return currentNumber;
    }

}
