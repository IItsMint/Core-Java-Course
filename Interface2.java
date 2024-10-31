//we use either abstrac or interface with this, we can make our object not dependet in between two calsses. !!!
//so we can make obj
interface  Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, colmpile, run: Faster");
    }
}

//you can not select laptop or desktop, by writing Laptop lap here you are forcing your self to laptop.
/* 
class Developer
{
    public void devApp(Laptop lap)
*/
// Basically you make developer dependandt on laptop, but developer depended on computer so, we need abstract class here.

class Developer
{
    public void devApp(Computer lap)
    //eventhough developer needs lap it comes from abstract class hence we can make obj from dekstop. 
    //Which means it is now not dependent in between two classes we can youse either or even both classes at the same time.
    {
        lap.code();
    }
}


public class Interface2 
{
public static void main(String[] args) 
{
    //we can make refference on parent class, object of sub class
    //now we make interface refference
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer kaan = new Developer();
    kaan.devApp(lap);
    kaan.devApp(desk);
}    
}
