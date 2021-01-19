package projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestProductInASeries
{
    public static void main(String[] args)
    {
        int[] integers = readNumbersFromFile("C:/Temp/ProjectEuler/Input.txt");
        long maxAdjacentProduct = maxAdjacentProduct(13, integers);
        System.out.println("max adjacent product: " + maxAdjacentProduct);

    }

    static long maxAdjacentProduct(int numberOfAjacent, int... integers)
    {
        long maxProduct = 0;
        for (int i = 0; i < integers.length-numberOfAjacent; i++)
        {
            long thisProduct = 1;
            for (int j = 0; j < numberOfAjacent; j++)
            {
                thisProduct *= integers[i+j];
            }
            if (maxProduct < thisProduct)
            {
                maxProduct = thisProduct;
            }
        }
        return maxProduct;
    }

    static int[] readNumbersFromFile(String filePath)
    {
        List<String> lines = null;
        try
        {
            lines = Files.readAllLines(Paths.get(filePath));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        List<Integer> integers = new ArrayList<>();
        for (String line: lines)
        {
            char[] charArray = line.toCharArray();
            Stream<Character> cStream = IntStream.range(0, charArray.length).mapToObj(i -> charArray[i]);
            cStream.forEach(c->integers.add(Integer.valueOf(c.toString())));
        }
        return  integers.stream().mapToInt(i->i).toArray();
    }


}
