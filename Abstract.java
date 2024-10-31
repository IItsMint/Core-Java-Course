//if you have abstract matter, you have to make your class abstract as well.
abstract class Car
{
    //we are declaring a method we dont know how to impelemnet it but we know we need it
    //for later we can declaring use abstract keyword.
    //we didint defined the drive here, we declared it.
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic()
    {
        System.out.println("music playing...");
    }
}
//we need to override the abstract matter drive. we cannot make it drive1.
//also it is compulsary to implement all the abstact matters since fly isint here, this class turns to abstract as well.
abstract class WagonR extends Car
{

    public void drive()
    {
        System.out.println("Driving..");
    }
}
//since we can not create object from abstaract class we need new class for obj creation.
class updatedWagonR extends WagonR //this is a concrete class. So you can create obj of cocnrete class not abstract class !!
{
    public void fly()
    {
        System.out.println("Flying..");
    }
    
}
public class Abstract 
{
    public static void main(String a[]) 
    {
        //you can not create object of abstract class.
        //Car obj = new  Car();

        Car obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
