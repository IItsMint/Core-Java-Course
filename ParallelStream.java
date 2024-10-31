import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream 
{
    public static void main(String[] args) 
    {
        List<Integer> nums = new ArrayList<>(10_000);

        Random rng = new Random();

        for(int i=1;i<=10_000;i++)
        {
            nums.add(rng.nextInt(100)); //we are setting upper bound to 100
        }

        //lets set timer to see their differences.
        long startSeq = System.currentTimeMillis();

        //lets apply filter
        int sum1 = nums.stream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum(); 
        long endSeq =  System.currentTimeMillis();         

            /*
             insted of reduce we can also do reduce
            .reduce(0, (c,e) -> c+e); //c and e are names c stands for carry.
             */

        //setting 2nd timer
        long startPara = System.currentTimeMillis();

        //Lets Apply parallelStream
        //we can sue parallel stream only if there isnt dependent values and sorting. 
            int sum2 = nums.parallelStream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum(); 
        long endPara = System.currentTimeMillis();

        System.out.println(sum1+" "+sum2);
        System.out.println("Seq: "+(endSeq-startSeq)+" "+ "parallel: "+(endPara-startPara));
        
    }
}