//

class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    //With thsi command you can try to ovverride, it shows you the spelling mistake, Matter names must be equal.
    /*
     *   public void showTheDataWhichBelongToThisClass() there is no s in belongs
     */
    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in B show");
    }
}
 
public class Annotation 
{
    public static void main(String[] args) 
    {
        
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
