class UserMainCode
{
    public int isMultiple(int input1, int input2){
        // Write code here...

        // if either parameter is zero, return 3
        if (input1 == 0 || input2 == 0)
            return 3;

        // exact multiple
        if (input1 % input2 == 0)
            return 2;

        // not a multiple
        return 1;
    }
}
