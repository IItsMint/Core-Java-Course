class A
{
    public void show()
    {
        System.out.println("in A Show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B Show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("in C Show");
    }
}
class D 
{
    public void show()
    {
        System.out.println("in D Show");
    }
}

public class DynamicDispatch 
{
    public static void main(String a[]) 
    {
        /*
         * Different object in different behaviour polymorphisim
         * So, we are not even sure obj.show which amtter of which class it will determined at run time
         * so it is called run time polymorphism
         * This concept called Dynamic Matter Dispatch since its dynmaic which matter it called we dont know
         */
        
         // we can only  have child object for the parrent !
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

       /* 

        This will not work since class D is not extend of A.
        obj = new D();
        obj.show();

        */
        
    }
}
