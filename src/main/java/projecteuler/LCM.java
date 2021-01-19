package projecteuler;

public class LCM
{
    /**
     * Calculate Lowest Common Multiplier
     * @param a
     * @param b
     */
    public static long LCM(long a, long b) {
        return (a * b) / GCF(a, b);
    }

    /**
     * Calculate Greatest Common Factor
     */
    public static long GCF(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return (GCF(b, a % b));
        }
    }
}