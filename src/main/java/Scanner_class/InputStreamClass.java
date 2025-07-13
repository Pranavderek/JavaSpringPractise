package Scanner_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// this defined the older version of creating the input object from the console and printing the
// values in the kernel

public class InputStreamClass
{
    public static void main(String[] args)  {

        System.out.println("Enter an integer");

        InputStreamReader is = new InputStreamReader(System.in);  // by this statement we are accessing the input stream value
        BufferedReader br = new BufferedReader(is); // the value is stored in a buffer reader and execution starts here
        System.out.println(br);
        int num = 0;  // declaring the value and making it by default initialization as 0

        // using try catch block to make execution smooth and throws errors.
        try
        {
            num = Integer.parseInt(br.readLine()); // the Num we get will be in string.so we are converting back to integer using this methode
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("The value is: "+num);

    }
}
