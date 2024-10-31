enum Laptop
{
    //this is a constructor we are passing a value.
    Mackbook(2000), XPS(2200), Surface(), ThinkPad(1800);

    private int price;
    //we need defualt constructor for unkown prices.
    private Laptop() {
    }

    private Laptop(int price) {
        this.price = price;
    }

  //in order to see the prices we need to sue getters and setters.
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    
}

public class Enum2 
{
    public static void main(String[] args) 
    {
      //  Laptop lap = Laptop.Mackbook;
      //  System.out.println(lap+": "+lap.get);

      for(Laptop lap : Laptop.values())
      {
        System.out.println(lap+": "+lap.getPrice()+"$");
      }
        
    }
}
