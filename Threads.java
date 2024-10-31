
//we have a concept of multitasking, and we are either dividing small things.
//we have a cocnept of threads for this. 
//Multipile threads can be running at the same time.
//they are lightweight and can share resources.
//they are smallest unit i can work with.

//to work with matter/method naems must be run!

class Hi extends Thread
{
    public void run()
    {
        for (int i = 0; i<100;i++)
        {
        System.out.println("Hi");
        //lets print them one hi one hello format we need delays.
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }            
        }

    }
}

class Hello extends Thread
{
    public void run()
    {
        for (int i = 0; i<100;i++)
        {
        System.out.println("Hello");
        //again ading delay for better compile result.
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }            
        }

    }
}

public class Threads
 {
    public static void main(String[] args) 
    {
        Hi obj = new Hi();
        Hello obj1 = new Hello();
        /*
         * or we can set priority by usinng obj.setPririty(1-10);
         * 
         */
        //to make these items threads, we can basically extend their class to threads.
        //and isntead of method names we use start.
        obj.start();
        //agai nwe are addign delay to start with gap.
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        obj1.start();

        /*
        //normally this is sequential means, i do what first comes till finish than move to next task.    
        obj.show();
        obj1.show();         
         */
        

    }
}
