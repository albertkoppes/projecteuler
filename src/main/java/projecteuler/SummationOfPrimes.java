package projecteuler;

public class SummationOfPrimes
{
    public static void main(String[] args)
    {
        System.out.println("sum of primes under two million: " + getSummationOfPrimesUpto(2000000));
    }
    static long getSummationOfPrimesUpto(long number )
    {
        long sum = 0;
        long currentNumber = 2;
        while (currentNumber < number)
        {
            if (SimpelProblems.isPrime(currentNumber))
            {
                sum += currentNumber;
            }
            currentNumber += 1;
        }
        return sum;
    }

}
