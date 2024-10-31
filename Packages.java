//.* means import evertying on that package/folder
import other.tools.*;
// or we can use the class that extends to his parrent
//import other.tools SciCalc;

public class Packages 
{
    public static void main(String a[]) 
    {
            SciCalc obj = new SciCalc();
            Calc obj1 = new Calc();

           obj1.add(5,6);
            // obj.power(4, 2);
            //we can assign either values that will be saved in class or we can see the print value that is rolling in that time after one turn it cant give the value
            //so we used obj1.n1 and obj.n2
            System.out.println(obj1.n1+ obj1.n2+" "+obj.power(4,2));
            

    }

}
