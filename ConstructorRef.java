import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// we want to make student object based on the name
class Student2
{
    private String name;
    private int age;

    public Student2() {
    }
    // we want sutdents at least have a name so used single parametrized constructor.
    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //getters setters ı çağırmak ve dışarıya götürmek için.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // we need toString to print this. Or  differentiate.


    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ConstructorRef
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kaan", "Berkay", "Bekir", "Can", "Mustafa", "Baris");
        List<Student2> students = new ArrayList<>();

        //everytime this loop runs, it will create a new student object.
        //
        /*
                for (String name : names)
        {
            students.add(new Student2(name));
        }
         */


        //we can do these things with StreamApi.

        students = names.stream()
                        /*
                        .map(name -> new Student2(name))
                        */
                        .map(Student2::new)//instead of above we can use Constructor Referance like this.
                        .toList();
        System.out.println(students);

    }
}
