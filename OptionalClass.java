import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class OptionalClass 
{
    public static void main(String[] args) 
    {
        List<String> names = Arrays.asList("Kaan", "Berkay", "Bekir","Mustafa","Can","Baris");

        //we are using Optional to get rid of NUll Point Exception.
       Optional <String>  name = names.stream()
            .filter(str -> str.contains("ş"))
            .findFirst();//opnly gives you the first value that contains.
          //.orElse("Not Found"); //we can use it like this but we need to change bootom to name, and delete optional and <> not string !
        System.out.println(name.orElse("Not Found"));//with orElse, we can print emssage isnteaad of error when it cant find any value according to filter.
    }
}
