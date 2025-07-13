package Exceptions;

class underage extends Exception
{
    public underage(String value)
    {
        super(value);
    }
}

class above_age extends Exception
{
    public above_age(String value)
    {
        super(value);
    }
}

class Validation
{
    static void ValidateAge(int age) throws  underage,above_age
    {
        if(age<18)
        {
            throw new underage("Invalid age if the user");
        } else if (age>60)
        {
            throw new above_age("Not Valid when age is greater than 60");
        } else {
            System.out.println("This is a valid age for voting");
        }
    }
}
public class Throws_keyword
{
    public static void main(String[] args)
    {
        try {
            // Example usage
            Validation.ValidateAge(64);
        } catch (underage e) {
            System.out.println(e);
        } catch (above_age e) {
            System.out.println(e);
        }
    }
}
