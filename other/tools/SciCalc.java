package other.tools;
//we have hierarcy here , AdvCalc is extnding to Calc too, so this is called Multi level Inheritance.

public class SciCalc extends AdvCalc
{
    public double power (int n1, int n2)
    {
        return Math.pow(n1,n2);
    }
    
}
