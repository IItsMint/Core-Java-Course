class Human
{
    //since we make data  private, age can be only accesible to the same class.
    private int age;
    private String name;

    //Lets make constructor here, we need to use the same class name and it does not return anything
    //everytime that we create object constructor will be called.
    public Human() //since we dont have any values in the brackets its called default constructor, 
    {//but if we have parameters like public Human (int a, String n) this type will be called parameterized constructor.
      //these values will be assigned for the default values for the empty and new creations.
      age = 18;
      name = "John";
    }
    //if we dont create constructor java will create autoamtically with empty vcaleus thats why its called defualt.

    //both age and name are private but their methods arent.
    //so we can acces the mthorugh theri methods not direclty.
    public int getAge()
    {
      return age;
    }

    public String getName()
    {
      return name;
    }

    //now lets set their values, when setting value you dont get return any value so we use void.
    //we used this. to differnetiate between ages and names

    public void setAge(int age)
    {
      this.age = age;
    }

    public void setName(String name)
    {
      this.name = name;
    }

}

public class Encapsulations 
{
    public static void main(String a[]) 
    {
      Human obj = new Human();
      obj.setAge(25);
      obj.setName("Kaan"); 

      System.out.println(obj.getName() + " " + obj.getAge() );

    }
    
}
