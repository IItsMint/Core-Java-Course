class A
{
    public void show()
    {
        System.out.println("in A Show");

    }
    /*/
    //we dan only make inneer class static
    static class B 
    {
        public void show()
        {
            System.out.println("in B Show");
        }

    }
    */
}

class C extends A
{
    public void show()
    {
        System.out.println("in C Show");
    }
}

public class InnerClass 
{
public static void main(String a[]) 
{
    /*/
    A obj = new A();
    obj.show();

    //if you want to create object of B, we need to create obj of A first sine it is non stattic class.
    //or we can make inner class static.
    //if we didint make it static we should write like A.B obj1 = obj.new B();
    A.B obj1 = new A.B();
    obj1.show();
    */


    //lets try to override behaviour of show.
        A obj2 = new A()
    {
        //this style is you will design the obj according to thsi set of rulels not the abovegiven ones.
        //this is called inner class and there is no name for it so it refferes to anonymous inner class.
        //
        public void show()
        {
            System.out.println("in new Show");
        }
        
    };
    obj2.show();


}    
}
