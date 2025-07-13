package Exceptions;

public class Throw_keyword
{
    public static void main(String[] args) {

        int[] nums = new int[5];
        int a = 20;
        int b = 0;
        try
        {
            int j = 0;
            System.out.println(nums[1]);
            System.out.println(nums[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The Array Out Of Bound Exception is : "+e);
        }
        try
        {
            b = a/b;
            System.out.println(b);
        }
        catch (Exception e)
        {
            System.out.println("The Exception we got in the division operation is : "+e);
        }

        System.out.println("The Code Works Perfectly.....");

    }

}
