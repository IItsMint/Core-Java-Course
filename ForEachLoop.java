class Student
{
    int rollno;
    int marks;
    String name;
}


public class ForEachLoop
{
    public static void main (String a[])
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Kaan";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Berkay";
        s2.marks =78;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Bekir";
        s3.marks = 98;

        //Lets make them Array
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        

        //Lets make Enhanced (For Each) Loop, with this we dont need to know array length it goes one by one
        for(Student st:students)
        {
            System.out.println(st.name+": "+st.marks);
        }
        

    }
}