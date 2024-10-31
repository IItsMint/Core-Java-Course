
public class Arrays
{

    public static void main(String a[])
    {

        /*
        This seciton creates a array size 4 and makes all values to zero.
        int nums[]= new int[4];

        we can assign values one by one
        nums[0]=3;
        nums[1]=7;
        nums[2]=2;
        */

        int nums[] = {3,7,2,4};

        //we can change the arrays values later with declaration
        nums[1]=6;

        for(int i=0;i<=3;i++)
        {
        System.out.println(nums[i]);
        System.out.println();
        }
        
        /* Lets create multi diamensional arrays..*/
        //3 for rows 4 for each rows have arrays ize of 4.

        int noms[][] = new int[3][4];

        //lets give random values to these 3d array
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<4;y++)
            {
                //math random is digit values like 0.1 0.2 so we multiply them with 100 andtheir trtpye is double so we need to change themn int to make type casting.
                //burada bir tuş var ne odluğunu öğren math yada random ın içsüütne tıkalayıp içine girip nasıl kullanılması gerketiğnii gösteriyordu.
                 noms[x][y] = (int)(Math.random()*10);              
            } 
        }

        //outter loop is for the rows.
        for(int x=0;x<3;x++)
        {
            //this nested loop is for the line values inside each row
            for(int y=0;y<4;y++)
            {
                System.out.print(noms[x][y]+" ");                
            }
            System.out.println();
        }

        System.out.println();
        //lets make enhanced for loop
        for(int c[]:noms)
        {
            for(int b: c)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }


    }

}