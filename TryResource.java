import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResource

{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int num = 0;
        
        //with this style try resource, you dont have to close resource manually.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }
/*
        // finally is god for multple object created
        finally
        {
            br.close();

            //it wil lexecute the finall block doee4snt matter if the try encoutners with exception or not.
            System.out.println("Bye");
        }
  */

    }
}
