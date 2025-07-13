package Threads;
class AB extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("This is my Execution");
        }    }
}
public class Threads_code2 extends Thread{

    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("This is my Program");
        }
    }
    public static void main(String[] args) {

        Threads_code2 thr = new Threads_code2();
        AB obj1 = new AB();
        thr.start();
        obj1.start();

    }

}
