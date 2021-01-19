package projecteuler;

public class Palindrome
{
    public static void main(String[] args)
    {
        int maxPalindrome = 0;
        for (int i = 100; i < 1000; i++)
        {
            for (int j = 100; j < 1000; j++)
            {
                int product = i * j;
                if (product == revertInt(product) && product > maxPalindrome)
                {
                    maxPalindrome = product;
                }
            }
        }
        System.out.println(maxPalindrome);
    }

    static int revertInt(int input)
    {
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();
        return Integer.parseInt(input1.toString());
    }

}
