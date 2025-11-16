import java.io.*;
import  java.util.*;

class Q5
{
    public int sumOfLastDigits(int input1, int input2){
        // Write code here...
        int last1 = Math.abs(input1 % 10);
        int last2 = Math.abs(input2 % 10);

        return last1 + last2;
    }
}
