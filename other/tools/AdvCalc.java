package other.tools;
// extends command is inheritance here, it inherrits class Calc's methods.
//AdvCalc is called sub class, Calc is called superclass
//Since we inherit only one class's method's this is called Single level Inheritance.
public class AdvCalc extends Calc
{
    public int multi (int n1, int n2)
    {
        return n1 * n2;
    }

    public int div (int n1, int n2)
    {
        return n1 / n2;
    }

}