import java.util.Arrays;
import java.util.List;

public class MethodRef
{
     public static void main(String[] args)
     {
         List <String> names = Arrays.asList("Kaan", "Berkay","Bekir","Can","Mustafa","Baris");
         List <String> uNames = names.stream()

                 //.map(name -> name.toUpperCase())
                 //lets make method reference calling function inside function
                 .map(String::toUpperCase)// we are saying every element that are coming from map converted to uppercase
                 .toList();// for return stream into list format
         System.out.println(uNames);
     }
}
