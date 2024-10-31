/*
 * Java is not 100% object oriented. We have primitive types.
 * In java every primitive type, we are going to have a calss for it.
 * int -Integer
 * char-Character
 * double-Double
 * For every primitiva type we have a class for it.
 * They are increasing performance it is good for java.
 */


public class WrapperClasses 
{
    public static void main(String a []) 
    {
        //num is primitive variable,
        int num = 7;
        //while num1 is refferance variable.

        // this is called boxing we are boxing primitive value
        //Integer num1 = new Integer(num);

        //this is  called auto boxing. it is covnerted to object automatically.
        Integer num1 =num;

        //unboxing, we are getting value fro mobjhect type to primitive type
        //int num2 = num1.intValue();

        //this is called auuto unboxing
        int num2=num1;

        System.out.println(num2);

        String str ="12";

        //since str is a string we can to any mnath operation to it like * or /
        //but we can use wrapper class to make it.
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);

    }
    
}
