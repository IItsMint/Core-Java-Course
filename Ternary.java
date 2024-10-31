public class Ternary
{
    public static void main(String a[])
    {
        int n =54;
        int result = 0;

        /*
        if(n%2==0)
        result = 10;

        else
        result =20;
        */

       //We can implement these statements into one line with Ternary Operator.

        // ?:
        // after ? if = true statement comes, afteer : statement else comes
        
        result = n%2==0 ? 10 : 20;

        System.out.println(result);

    }
}