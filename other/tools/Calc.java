package other.tools;

public class Calc
{
/*

 * Access Modifiers:
 * Private can be used in teh same class no where else.
 * Protected can be used in same class, same package, in the other package but sub class.
 * Public can be used eveywhere.
 * Default can be used in the same package
 
 */

//we made wrote public n1 n2 inorder to save the values that will be come from the main function from other packages/folders.
    public int n1;
    public int n2;
    public int add (int n1, int n2)
    {
        //we used this. so that both n1 wont be same, the n1 that coem from main funciton will be saved the above n1 line 7.
        this.n1=n1;
        this.n2=n2;

        return n1 + n2;
    }

    public int sub (int n1, int n2)
    {
        return n1-n2;
    }

}