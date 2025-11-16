class UserMainCode
{
    public int secondLastDigitOf(int input1){
        // Write code here...
        input1 = Math.abs(input1);   // make positive
        if (input1 < 10)             // single digit number has no 2nd last digit
            return -1;

        return (input1 / 10) % 10;   // second last digit
    }
}
