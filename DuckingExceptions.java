class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}

public class DuckingExceptions 
{
    static
    {
        System.out.println("Class Loaded...");
    }

    //we can use throws ClassNotFoundException for classes since main will handle it 
    public static void main(String[] args) //Dont use throws ClassNotFoundException for main, because jvm will handle it and basically it is stop code running. 
    {
        A obj = new A();
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            //we can track entire method calls.
            e.printStackTrace();
        }
    }
    
}
