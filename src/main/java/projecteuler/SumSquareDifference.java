package projecteuler;

public class SumSquareDifference
{
    public static void main(String[] args)
    {
        long result =  squareSubUpto(100) - sumSquaresUpto(100);
        System.out.println("result: " + result);
    }
    static long sumSquaresUpto(int number)
    {
        long sum = 0;
        for (int i = 1; i <= number; i++)
        {
            sum += (long)i * i;
        }
        return sum;
    }

    static long squareSubUpto(int number)
    {
        long sum = 0;
        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        return sum * sum;
    }

}
