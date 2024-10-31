 //you can make custom exceptions by definign new class that is extending to exception parrent class.
 
 class Hallucinations extends Exception
 {
    public Hallucinations(String string)
    {
        //we are calling super class to print custom made error message in the pranthesis.
        super(string);
    }
 }   
 

public class Throw 
{
    public static void main(String[] args) 
    {
        
        int i = 20; 
        int j= 0;
       
      
        try 
        {
             j = 18/i;
             //if denominator is higher than the nominator it gives you 0. Now we can make that output defualt as well by handling process. 
             //we can thorw the exception and catach block will catch it.
             /*
              if(j==0)
                throw new ArithmeticException("I dont want to print zero");
                //in phrantehesisi you can print the messaj yo uwant to print like e.             
              */

             if(j==0)
                throw new Hallucinations("Stop hallucinating...");
                //in phrantehesisi you can print the messaj yo uwant to print like e.

        }
        /*
         catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("thats the default output." + e);
        }
                
         */
        //lets try to handle it by not providing error by making divided by 1.
        catch(Hallucinations e)
        {
            j = 18/1;
            System.out.println("thats the default output." +" "+ e);
        }
        
        catch(Exception e)
        {
            System.out.println("Somethign went wrong..." +" Because: "+ e);
        }

        
        System.out.println(j);
        
        System.out.println("Bye...");

    
    }
}


