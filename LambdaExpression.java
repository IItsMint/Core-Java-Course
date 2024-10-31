//since we only have one matter, we make this FunctionalInterface by using annotations.
// lamba expression only works with functional interface !!!

@FunctionalInterface
interface A
{
    // void show(int i);
    int add(int i, int j);
}

public class LambdaExpression 
{
    public static void main(String[] args) 
    {
        /*
         A obj = new A() 
        {
            
                public void show()
                {
                    System.out.println("in show");
                }
            
        };  

         This is normal way of making object but hence we only  have one matter in interface we can use lambda expression like this...

         */

        //with lambda expressio nwe can say like it is your duty to complete my sentence.
        //if your interface expression does not contian integer value, you have to make this ( i,  j) paranthesis empty!
        /* 

        A obj = ( i,  j) ->                  
            {
                System.out.println("in show"+" "+i+" "+j);
            };

        if you want to return someting it changes a little. You have to g et rid of {} these and turned i+j into statement.  
         */

        A obj = ( i,  j) ->                  
        
                i+j;
                     
        int result = obj.add(5,10); 
        System.out.println(result);
    }
}
