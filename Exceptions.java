
public class Exceptions 
{
    public static void main(String[] args) 
    {
        
        int i = 0; 
        int j= 0;
        int nums [] = new int [5];

        //you should only use try and catch for the critical statements.
        //it is trying to executre the block
        try 
        {
             j = 18/i;

        }
        //catch block only executed in case of exception otherwise it is skipped.
        catch(Exception e)
        {
            System.out.println("Somethign went wrong..." +" Because: "+ e);
        }

        //we can make multiple try statements since as soon as try statement cathes the exception it jump outs from the try statement.
        try 
        {
            System.out.println(nums[1]);
            //idnex number of 5 means 6th element but aour array defined 5 elements.
             System.out.println(nums[5]);
        }

        //catch block only executed in case of exception otherwise it is skipped.
        catch(Exception e)
        {
            System.out.println("Somethign went wrong..." +" Because: "+ e);
        }

        //value of j was zero from the scratch so it is printing that.
        System.out.println(j);
        // as soon as exception happens the compiler stops the code from running so we cant see or do the rest. To fix this we can use try and cats statments
        System.out.println("Bye...");

        /*
        
         * For Expeciton Handling part you can make like one try statement and many catch statements like
                
        try 
        {
            System.out.println(nums[1]);
            //idnex number of 5 means 6th element but aour array defined 5 elements.
             System.out.println(nums[5]);
        }
         catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }

         catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit...");
        }

        //parrent class will be at the bottom though !
         catch(Exception e)
        {
            System.out.println("unkown error: "+e);
        }

         */

    }
}
