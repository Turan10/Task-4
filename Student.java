//Task 1
import java.util.ArrayList;

public class Student {

        private String name;
        private ArrayList<Courses> courses;

        public Student(String name) {
            courses = new ArrayList<>();
            this.name = name;
        }

        public void addCourse(Courses course) {
            this.courses.add(course);
        }

    @Override

    public String toString() {
        return "Student{" + "name= " + name + ", courses=" + courses + "}";
    }
    }