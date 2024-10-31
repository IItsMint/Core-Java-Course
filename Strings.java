public class Strings
{
    public static void main(String a[])
    {
        String name = new String("Kaan");

        /*
        We can also create string like String name = "Kaan";
        */

       /*
       String s1="kaan";
       string s2="kaan";

        in heap memory we dont craeate 2nd obejct kaan again their adress will be same 
        both s1 and s2 i nstack ememory get the same adress from the heap memory.
        */

        //we can olny use string with + operation !!!
        System.out.println("Hello "+ name);

        //lets try to porint charachter at any index, from the string
        System.out.println("They character is: " + name.charAt(1));

        //lets concanate one more string without using + operation
        System.out.println(name.concat(" Ready"));

        // Lets Practice Different types of strings
        //This is Mutable aka changable string we can modify its value later on
        StringBuffer sb = new StringBuffer("Kaan");
        //lets print its capacitf to learn buffer size
        System.out.println(sb.capacity());
        // it has a capacity of 16 characters but if we define7add values into phrantesisi at line 30, its capacity that was 16 wwill be increased.
        
        //Capacity and lenght are two differnet things!
        System.out.println(sb.length());

        System.out.println(sb);
        //lets modify the string
        sb.append(" Ready!");
        
    
        //lets add string with this command
        sb.insert(0, "Java ");
         System.out.println(sb);

         //Lets delete a character from index number
         sb.deleteCharAt(2);
         System.out.println(sb);

    }
}