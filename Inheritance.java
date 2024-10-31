// Eventhough we did not write class  here we wrote it in another file and with compile, we obtained .class file
//we can create a new object from a class file

// it can be interwiev quesiton !!!! java does not support multiple inheritance !!!!!!!!!!!!!

import other.tools.SciCalc;

public class Inheritance
{
    public static void main(String a[]) 
    {
       SciCalc obj = new SciCalc();
       int r1 = obj.add(4,5);
       int r2 = obj.sub(7,3); 
       int r3 = obj.multi(4,5);
       int r4 = obj.div(7,3); 
       double r5 = obj.power(4,2);

       System.out.println(r1+" "+r2+" "+ r3+" "+r4+" "+r5);
    }
}


//If we made class overlading, and want to use both of the classes for the  same method name, we can use this(); and super(); comömands.
//this makes use the whole class with the same name while super use the parent (extend) class.

//we can override the methods, every obj wants so print itself, so we can overwrite them by selecting the obj from what we want.