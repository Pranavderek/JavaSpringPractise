package Exceptions;

public class VariousCatchBlocks_2
{
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int nums[] = new int[5];

        try
        {
            b = a/b;
            System.out.println("The divison operation we are doing is : "+b);
            System.out.println(nums[1]);
            System.out.println(nums[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The Exception we are getting is:"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("The Exception is "+e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("The code Runs Good....");
    }
}
