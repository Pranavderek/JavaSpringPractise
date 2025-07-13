package Threads;
class first extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++) {
            System.out.println("Printing the values of the class First....");
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
class second extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++) {
            System.out.println("Printing the values of the class Second....");
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Thread_priority
{
    public static void main(String[] args)
    {
        // creating the objects of the threads class created and executing them
        first f1 = new first();
        second s1 = new second();

        // getting the priority of the string
        System.out.println(f1.getPriority());  // by default, we get the priority as 5
        System.out.println(s1.getPriority());  // by default, we get the priority as 5


        // now we are setting the priority of the string value
        // as we are updating the priority of the threads there is a chance that during the execution the code may
        // break, so we are writing the priority changes in a try catch block
        try
        {
            f1.setPriority(Thread.MAX_PRIORITY);  // This methode helps in give the thread the maximum priority
            s1.setPriority(Thread.MIN_PRIORITY);  // This methode helps in give the thread the minimum priority

            // after making the priority we are printing the priority values

            System.out.println(f1.getPriority());  // this statement will help us to print the priority value
            System.out.println(s1.getPriority());
        }
        catch(Exception e)  // if we find any exception flowing in the code we use this block to print the exception message
        {
            System.out.println(e.getMessage());
        }

        // calling the objects and starting the thread operation
        f1.start();
        s1.start();

        // end of program

    }
}
