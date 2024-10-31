//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args) throws IOException
    {
        //what is the class of println, the class of println is PrintStream.
        System.out.println("Enter a number: ");

        //we can use either like this 
        /*
        InputStreamReader in = new InputStreamReader(System.in);
        //we will pass the value that is created in InputStreamReader
        BufferedReader bf = new BufferedReader(in);     
         int num = Integer.parseInt(bf.readLine());
        System.out.println(num);    
        bf.close();               
        */

        //or like this
       
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

        



    }
}
