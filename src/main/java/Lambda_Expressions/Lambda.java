package Lambda_Expressions;

@FunctionalInterface
interface cars
{
    public void add(int a,int b);
}

public class Lambda
{

    public static void main(String[] args) {

        cars c = (a,b) ->
        {
            System.out.println("Hello:"+(a+b));
        };

        c.add(2,4);

    }
}

// key points to remember

// 1. lambda expression is a functional interface
// 2. lambda expression is an interface with only one abstract method
// 3. lambda expression only works with functional interface

