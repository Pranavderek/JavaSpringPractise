package Threads;


class abc
{
    public void print()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Java");
        }
    }
}
class xyz
{
    public void print()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Java Programing");
        }
    }
}

public class Regular_loop_code
{
    public static void main(String[] args)
    {
        abc obj1 = new abc();
        xyz obj2 = new xyz();

        obj1.print();
        obj2.print();

    }
}
