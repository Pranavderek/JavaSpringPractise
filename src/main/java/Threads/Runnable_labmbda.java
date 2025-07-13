package Threads;

public class Runnable_labmbda
{
    public static void main(String[] args) {

        // creating a lambda expression by creating a r1 object

        Runnable r1 = () ->
        {
            for(int i=1;i<=5;i++) {
                System.out.println("Printing");
                try
                {
                    Thread.sleep(10);
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        };

        // creating a lambda expression by creating a r2 object
        Runnable r2 = () ->
        {
            for(int i=0;i<=10;i++) {
                System.out.println("Java");
                try
                {
                    Thread.sleep(10);
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(r1);  // creating a thread and passing arguments and passing the parameter of the objects
        Thread t2 = new Thread(r2);

        t1.start(); // initializing the objects
        t2.start();

    }
}
