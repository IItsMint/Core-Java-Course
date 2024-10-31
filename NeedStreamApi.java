import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class NeedStreamApi 
{
    public static void main(String[] args) 
    {
        List <Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //lets filter the values, we want to double the even values and add them to gether.
        int sum = 0;

        for (int n : nums)
        {
            if(n%2 == 0)
            {
                n = n*2;
                sum = sum +n;
            }
        }

        System.out.println(sum);

        //Lets Print all the elements
        System.out.println("Classic For Loop");
        for(int i = 0; i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }

        //Lets use Enhanced for Loop
        System.out.println("Enhanced For Loop");
        for (int n: nums)
        {
            System.out.println(n);
        }

        //Lets use For Each matter
        System.out.println("For Each Matter");
        nums.forEach(n -> System.out.println(n));
        //it will give you one value at a time you can save thtat in n, and say i wantto print this n.

        //////////////////////////////////////////////////////
        System.out.println("");


        /*
         * we can all do these steps into one line
         
        //lets use stream
        //stream provides lots of matters.
        //but we can onyl use stream once
        Stream <Integer> s1 = nums.stream();
    //    s1.forEach(n -> System.out.println(n));
        //it will give you error sicne stream can be used only once.
        //s1.forEach(n -> System.out.println(n));

        //lets usee filter in stream. Only print even values
        //we can create another stream but cannot create exxact samee stream more than once.
        Stream <Integer> s2 = s1.filter(n-> n%2==0);
    //    System.out.println(s2);
        
        //lets double the values
        Stream <Integer> s3 = s2.map(n -> n*2);
    //    System.out.println(s3);

        //lets use reduce function, this is give me the totoal
        int result = s3.reduce(0,(c,e) -> c+e);
         */

         //all those lines reduce to this :)
         int result = nums.stream()
            .filter(n -> n%2==0)
            .map(n->n*2)
            .reduce(0,(c,e) -> c+e);

        System.out.println(result);

        //lets sort them

    //if we wanttto also apply threads,we will use parallel stream
    //it will be faster but you shoudltn sue this with sorted.
        Stream<Integer> sortedValues = nums.parallelStream()
            .filter(n->n%2==0)
            .sorted();

        sortedValues.forEach(n -> System.out.println(n));
        
    }
}
