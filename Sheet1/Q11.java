public class Q11 {
     public int factorial(int input1){
      

        if (input1 < 0)
            return -1; 

        int fact = 1;

        for (int i = 1; i <= input1; i++) {
            fact = fact * i;
        }

        return fact;
    }
    
}
