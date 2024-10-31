//Using Threads and Mutation is now safe since they can be call at the same time which leads t data lost.
//we need to make only one thread get into method
class Counter
{
    int count;
    //we add synchronized so that only one thread can call at a time, leads to preventing data loss.
    public synchronized void  increment()
        {
            count++;
        }
    
}
public class Threads3 
{
    public static void main(String[] args) throws InterruptedException
    {
      Counter c = new Counter();

      //as we increase the number of the mutation, the lsot element increases for fixing this, we adda synchronized to method.
      Runnable obj1 = () ->
      {
        for (int i=0;i<10000;i++ )
        {
            c.increment();
        }
      };  
      
      Runnable obj2 = () ->
      {
        for (int i=0;i<10000;i++ )
        {
            c.increment();
        }
      };
      
      Thread t1 = new Thread(obj1);
      Thread t2 = new Thread(obj2);

      t1.start();
      t2.start();

      //join is allowing your main to wait to threads done their jobs.
      t1.join();
      t2.join();

      System.out.println(c.count);

    }
}
