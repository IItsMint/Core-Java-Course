import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class ArrayLists 
{
    public static void main(String[] args) 
    {
        //in colleciton values coems like a object not integer to fix it we are usinng <> and wiritng the type
        //so that we dont get excetion if we add wrogn element like "5", and try to do opertaion like *2 to it.
        //I naddition if yoo uwantto work with idnex numbers instead of colelciton we can use list.
        Collection <Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for (int n: nums)
        {
        System.out.println(n*2);            
        }

        List <Integer> nums1 = new ArrayList<Integer>();
        nums1.add(6);
        nums1.add(5);
        nums1.add(8);
        nums1.add(2);
        
        //we are priting the index number 2 here
        System.out.println(nums1.get(2));

        //we are pritnign the which index number has value 5
        System.out.println(nums1.indexOf(5));
        System.out.println("");
        //it is not following the sequance or sorted because it is set. 
        //Also we cannot use idnex numbers.
        Set <Integer> nums2 = new HashSet <Integer>();
        nums2.add(62);
        nums2.add(54);
        nums2.add(82);
        nums2.add(21);
        
        for (int m: nums2)
        {
        System.out.println(m);     
        }

        System.out.println("");
        //with tree set we can sort values
        Set <Integer> nums3 = new  TreeSet <Integer>();
        nums3.add(62);
        nums3.add(54);
        nums3.add(82);
        nums3.add(21);
        

        
        for (int h: nums3)
        {
        System.out.println(h);            
        }
                
        System.out.println("");

         //we can use Iterator too insted of for loop.

         Iterator <Integer> values = nums3.iterator();

         while(values.hasNext())
         {
            System.out.println(values.next());
         }
        
    }
}