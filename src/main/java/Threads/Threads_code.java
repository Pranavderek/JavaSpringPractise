package Threads;

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Java Programing");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("best language");
        }
    }
}

public class Threads_code
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}
