package projecteuler;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LargeSum
{
    public static void main(String[] args) throws IOException
    {
        List<String> lines = Files.readAllLines(Path.of("C:/Temp/ProjectEuler/Input3.txt"));
        List<BigInteger> numbers = new ArrayList<>();
        lines.forEach(line->numbers.add(new BigInteger(line)));
        Utils.printObjectArray("numbers: " + numbers);
        BigInteger total = BigInteger.ZERO;
        for (BigInteger bInt : numbers)
        {
            total = total.add(bInt);
        }
        System.out.println(total);
        String subString = total.toString().substring(0,10);
        System.out.println(subString);


    }


}
