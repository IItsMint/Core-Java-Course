class Mobile
{
    //These variavbles are called Instance Varaible
    String brand;
    //If we want to make any variable common to all the object, we turned them into static.
    static String name;
    int price;

    public void show ()
    {
        //If you create a variable inside a matter that is called Local Variable
        System.out.println(brand + ": " + price + ": "+ name);
    }

}

public class Static 
{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        //Since we turned  name to static they are out of the object and becoem emmeber of the class sos we turned them into class.
         Mobile.name = "SmartPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        //Since we turned  name to static they are out of the object and becoem emmeber of the class sos we turned them into class.
        Mobile.name = "SmartPhone";

        //Eventhough we just chagned the obj1's value we made name variable in to common with using static so obj2 will beh changed automatically.
        //Since we turned  name to static they are out of the object and becoem emmeber of the class sos we turned them into class.
      Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
    
}
