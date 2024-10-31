class Computer
{
    //since we dont need anything from matter, in return, we gave void.
    public void PlayMusic()
    {
        System.out.println("Playing Music...");
    } 

    //since we used return with a string we have to sue string in here.
    public String GetmePen(int cost)
    {
        if (cost >= 10)
        {
            return "Pen";
        }

        //I dont need to even mention else, if previous statemnt has return, 
        //when its true it autoamticlaly reutrn somnthing breaking out of condditons.
        // So I can only write return "Nothing..."

        else
        {
            return "Nothing...";
        }
    }      
}

public class Methods
{
    public static void main(String a[])
    {
        int num = 1;

        // This is the line we create the object, obj is refferenace variable
        Computer obj = new Computer();

        //now we can use obj to call
        obj.PlayMusic();

        //Since it has return value, we need to aplly it here too.
        String str = obj.GetmePen(num);

        //we need to also print to str to see its value.
        System.out.println(str);
    }   
}