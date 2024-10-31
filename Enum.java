// Status is type of it and it is class
//but you can not eextend enum.
enum Status
{
    //all those thing here are objects. Named constans
    Running, Failed, Pending, Success;
}
public class Enum
{
    public static void main(String[] args) 
    {
        //we can only use status that we maentioend above nothing else.
        Status s = Status.Success; 
        System.out.println(s);
        //this line prints the Success index number in above
        System.out.println(s.ordinal());
        //if we want to see al of the status,
        Status[] ss = Status.values();
        for(Status n : ss)
        System.out.println(n+" "+n.ordinal());

        ////////////////////////////////////
        
        Status x = Status.Pending; 

        if (x == Status.Running)
        {
            System.out.println("Good to go");
        }

        else if (x == Status.Failed)
        {
            System.out.println("Başaramadık");
        }

        else if (x == Status.Pending)
        {
            System.out.println("give me a sec");
        }

        else
        {
            System.out.println("Tall Grande Venti Bitti Gitti...");
        }
    }
}
