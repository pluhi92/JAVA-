
public class toStringMethod {
    public static void main(String[] args) {

        Student s1 = new Student(11, "Peter");
        System.out.println(s1.toString());
    }
}

class Student {

    int age;
    String name;

    public Student(int age, String name) {     //alt+insert --> Constructor
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {                 //alt+insert --> toString
        return "Student {" +
                "age = " + age +
                ", name = '" + name + '\'' +
                '}';
    }
}


