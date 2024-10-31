//what is comparator = if you wantto specify on which logic you can sort.
//what is Comparable = give power to class to compare it object to it self.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int age;
    String name;

    //we have toString because we wantto print students as it is.

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    //we also use constructor, for instead of list of integers 
    //lets have list of students.

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    
}
public class ComparatorVsComparable 
{
    public static void main(String[] args) 
    {
        
        List <Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(32);
        nums.add(71);
        nums.add(29);

        //for sortign we can use collection
        Collections.sort(nums);

        //what if i want to sort them according to my logic
        //like sorting them according  to their second digit

        Comparator <Integer> com = new Comparator <Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)//to look for 2nd digit.
                    return 1; //means swap
                else
                    return -1; //means not swap
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);

        //lets create new list of students here

        System.out.println("");

        List <Student> stu = new ArrayList<>();
        stu.add(new Student(26, "Kaan"));
        stu.add(new Student(24, "Berkay"));
        stu.add(new Student(12, "Can"));
        stu.add(new Student(18, "Baris"));
        stu.add(new Student(20, "Mustafa"));

        //lets sort them according to thier ages.
        //lets apply also ternary and lambda expression.

        /*
        Comparator <Student> com2 = new Comparator <Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)//to look for 2nd digit.
                    return 1; //means swap
                else
                    return -1; //means not swap
            }
        };         
         */

         //it becomes way  shorter :)
         Comparator <Student> com2 = ( i,  j) ->
         {
           return i.age > j.age ?1:-1;
         };

        //if we want to use with only stu, we make the student implements Comparable <Student>
        //and add compateTo(Student that) matter, and moves if else stament inside of that matter.
        //dont forgetto change i and j to this and that respectively.

        Collections.sort(stu, com2);

        for(Student s: stu)
        {
            System.out.println(s);
        }
            

    }
}
