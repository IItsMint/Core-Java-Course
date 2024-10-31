/* 
 * Dont forget java can not implement packages to the main, it gaves error, so be carefull !!
*/

public class Main 
{
    public static void main(String a[]) 
    {
        System.out.println("Welcome to Quiz App");

        QuestionService service = new QuestionService();

        //This line calls the method name displayQuestions.
        service.displayQuestions();
        service.printScore();

        
    }

}
