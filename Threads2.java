
//we can maek threads with runnables as well.
//runnable calss does not havethread methods we need to creat them.

/*
class Hoi implements Runnable
{
    public void run ()
    {
        for (int i = 0; i<5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
} 
 */


 /*
 class Henlo implements Runnable
{
    public void run ()
    {
        for (int i = 0; i<5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
 
  */

public class Threads2
{
    public static void main(String[] args) 
    {
        //since we used runnable and implementes above the code changes a little.
        //lets implement lambda expressions. First we need to make anoynmous
        //if these class use only once it is more sense to make them anoymous sicne it reduces the amopunt of used lines.
        Runnable obj1 = () ->
        {
            for (int i = 0; i<5;i++)
            {
                System.out.println("Hi");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        ;

        Runnable obj2 = () ->
        {
            for (int i = 0; i<5;i++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        ;
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
    
}
