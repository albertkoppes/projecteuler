package projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class LargestProductInAGrid
{
    private LargestProductInAGrid()
    {
    }

    private static int[][] readNumbersInGrid(String filePath) throws IOException
    {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        int[][] array = new int[lines.size()][20];
        int i=0;
        for (String line : lines)
        {
            int j = 0;
            try (Scanner scanner = new Scanner(line))
            {
                while (scanner.hasNext())
                {
                    array[i][j++] = Integer.parseInt(scanner.next());
                }
            }
            i++;
        }
        return array;
    }

    static int getMaxProduct(int adjacent, int[][] array)
    {
        int maxProduct = 0;
        for (int i = 0; i < array.length - adjacent; i++)
        {
            for (int j = 0; j < array[0].length - adjacent; j++)
            {
                int productHorizontal = array[i][j]*array[i][j+1]*array[i][j+2]*array[i][j+3];
                int productVertical = array[i][j]*array[i+1][j]*array[i+2][j]*array[i+3][j];
                int productDiagonal1 = array[i][j]*array[i+1][j+1]*array[i+2][j+2]*array[i+3][j+3];
                int productDiagonal2 = array[i+3][j]*array[i+2][j+1]*array[i+1][j+2]*array[i][j+3];
                int thisMax = Math.max(Math.max(Math.max(productDiagonal1, productDiagonal2), productHorizontal), productVertical);
                if (maxProduct < thisMax)
                {
                    maxProduct = thisMax;
                }
            }
        }
        return maxProduct;

    }
}
