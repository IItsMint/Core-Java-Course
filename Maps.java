//when we work with list or array, you ened to use index value, 
//we can name to it. By, using keys and values.
//map is basically colleciton key and value.

import java.util.HashMap;
import java.util.Map;

public class Maps 
{
    public static void main(String[] args) 
    {
        Map <String, Integer> students = new HashMap<>();

        students.put("Kaan", 90);
        students.put("Bekir", 80);
        students.put("Berkay", 85);
        students.put("Gamze", 76);
        students.put("Mustafa", 100);
        students.put("Bariş", 65);
        students.put("can", 70);

        //keys cannot be repated, but values can be. So we will onbly see one Gamze.
        //keys are set, values are list.
        students.put("Gamze", 80);

        //we can spesify by student.get("Kaa"));
        //to obtain only Kaan's value
        System.out.println(students);
        //we can only pritn keys too
        System.out.println(students.keySet());

        //we can fetch the values like this.
       for(String key : students.keySet())
       {
        System.out.println(key +": "+ students.get(key));
       }; 

    }
}
