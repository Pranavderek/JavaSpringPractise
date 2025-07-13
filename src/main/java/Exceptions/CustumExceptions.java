package Exceptions;

class ArrayException extends Exception
{
    public ArrayException(String message)
    {
        super(message);
    }
}

public class CustumExceptions
{
    public static void main(String[] args) {

        int[] array = new int[5];
    try
    {
        System.out.println(array[8]);
        throw new ArrayException("This is an error for out of bound");
    }
    catch(Exception e)
    {
        System.out.println("The exception we got is: "+e);
    }

    }
}
