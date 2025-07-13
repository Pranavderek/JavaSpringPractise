package Threads;// In this code we have implements a special type of interface called Runnable
// previously we extend thread class and convert the objects into threads

// nut as we know java doesn't  support multiple inheritance we used an interface to implement runnable class


class ABA implements Runnable
{
    public void run() // we have written a run methode to execute the string
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Java");
        }
    }
}

class BC implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Programing");
        }
    }
}
public class Threads_Runnable_Keyword
{
    public static void main(String[] args) {

        Runnable obj1 = new ABA();  // firstly we have created objects of the class using the runnable interface
        Runnable obj2 = new BC();   // if we navigate inside the Runnable interface we can see a special methode called run

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        try
        {
            t1.setPriority(Thread.MAX_PRIORITY); // setting the priority of the threads
            t2.setPriority(Thread.MIN_PRIORITY);
        }
        catch(Exception e)  // make sure the execution won't fail due to changes in the functional interface
        {
            System.out.println(e.getMessage());
        }

        // starting the threads and executing the code from here
        t1.start();
        t2.start();
    }
}
