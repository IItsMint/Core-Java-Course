// This is my class, my class name is Calculator
class Calculator
{

    //this is variable, this how i can specify what object knows
    int a;
    //we make it public to acces it from everywhere
               //add is my method, what object do
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    } 

    /////////////////////////////////////////////////////////////////////////////////////////////////// 
    /*From this section we are implementing Method overlading here.
    we can have same method name for more than one, which leads to method overloading. The thing is their inside definitons should be different.*/

    public int add(int n1, int n2, int n3)
    {
        int r = n1 + n2;
        return r;
    }
        public double add(double n1, int n2)
    {
        double r = n1 + n2;
        return r;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////
    
}

public class ClassObjectCalculator
{
    public static void main(String a[])
    {
        //primitive variables since they used int float double...
        int num1=4;
        int num2=5;

        
        /*Calculator is the class name we are going to make object fromm this class, imagine like it is type*/
        /*calc is the refference variable name*/
        /* In order to create new object, we used new Calculator();*/
        /* the second Calculator is to acces methods of this calss, which is design*/

        Calculator calc = new Calculator();

       double result = calc.add(num1,num2);
       System.out.println(result);

    }
}