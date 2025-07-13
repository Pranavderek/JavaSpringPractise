package Exceptions;

public class VariousCatchBlocks
{
    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int nums[] = new int[5];

        try
        {
            b = a/b;
            System.out.println(nums[4]);
            System.out.println(nums[6]);
        }
        // The bellow Exception is a ArrayOutOfIndexBound Exception which helps when an array is getting out of bound
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The Exception thrown 1 is : "+e);
        }
        // The bellow Exception is an   Exception which helps when an array is getting out of bound

        catch (ArithmeticException e)
        {
            System.out.println("The Exception Thrown 2 is:  "+e);
        }

        catch (Exception e)
        {
            System.out.println("The Error Message is : "+e);
        }
        System.out.println("The code works.....");
    }

}
