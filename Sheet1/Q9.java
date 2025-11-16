

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6)
    {
        // Read only region end

        int[] numbers = {input1, input2, input3, input4, input5};
        int count = 0;

        for (int num : numbers) {
            if (input6.equals("even") && num % 2 == 0) {
                count++;
            } else if (input6.equals("odd") && num % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}