package Exceptions;

import java.sql.SQLOutput;

public class Exceptions_code_1
{
    public static void main(String[] args) {

       int a = 10;
       int b = 0;

       try
       {
           b = a / b;
       }
       catch(Exception e)
        {
            System.out.println("Something is missing....");
            System.out.println("System error message :"+e);
        }

        System.out.println("The Final value is: "+b);
        System.out.println("Execution completed successfully.....");

    }
}
