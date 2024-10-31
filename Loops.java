public class Loops
{
    public static void main (String a[])
    {

        // While Loop

        int i = 1;

        while(i<=4)
        {
            System.out.println("While Loop " + i);

            int j=1;

            while(j<=3)
            {
                System.out.println("Nested Loop");
                j++;
            }
            i++;
        }

        System.out.println("Bye " +i );

        // Do While Loop
        /* 
        Eventhough the loop condidion is ended when the value si equal to or bigger than 4,
        the checking process done after priting. Hence with this style even your condition is false you can print once.
        */
        int x =500;

        do
        {
            System.out.println("Do While Loop "+x);
            x++;
        }
        while(x<=4);

        //For Loop
        /* First we check intiger l value than condiiton than do the paranthesisi than increment the value and now we only check if condiiton is met if not do phrantesisi and incmrernet*/

        for(int l=1;l<=5;l++)
        {
            System.out.println("Day " + l);

            for(int j=1;j<=9;j++)
            {
                System.out.println(" "+ (j+8) + "-" + (j+9));
            }
        }

    }
}