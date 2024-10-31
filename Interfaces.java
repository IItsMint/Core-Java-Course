interface  A extends X
{
    //in interfaces eventhough you didn't make them public, they become public it is a must.
    // also they become abstract automatically as well.
    //interfaces acts like im telling you the methods it is your job to implement.
     void show();
     void config();

    // all the variables inside interface by default final and static.!!
     int age = 26;
     String area = "Türkiye";
}
interface X
{
    void run();
}

// in interface, 1 class can implement more than one interface. However we cant do that in abstract.
class B implements  A,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("running...");
    }
}

public class Interfaces
{
    public static  void main (String[] args)
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        obj.run();

        // we can not change its value since it is final by defualt.
        //A.area = "Ankara";
        System.out.println(A.area);

    }
}
