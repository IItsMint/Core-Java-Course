public class Logical
{
    public static void main(String[] args)
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        //ctrl alt - ||
        boolean result = x>y || a>b;

        boolean z =! result;

        System.out.println(result);

        System.out.println(z);
        //veya
        System.out.println(!result);
    }
}