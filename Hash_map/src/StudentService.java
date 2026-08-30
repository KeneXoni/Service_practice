import java.util.*;

public class StudentService {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(int id, Student student) {
        students.put(id, student);
    }

    public Student findByName(String name) {
        for (Student s : students.values()) {
            if (s.getName().equalsIgnoreCase(name)) {                                              //compares two strings
                return s;
            }
        }
        return null;
    }

    public Student findByLastname(String lastname) {
        for (Student s : students.values()) {
            if (s.getLastname().equalsIgnoreCase(lastname)) {
                return s;
            }
        }
        return null;
    }

    public List<Student> findByGroup(String group) {                        //returns a list of all objects
        List<Student> result = new ArrayList<>();
        for (Student s : students.values()) {
            if (s.getGroup().equalsIgnoreCase(group)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Student> findByMarks(int marks) {
        List<Student> result = new ArrayList<>();
        for (Student s : students.values()) {
            if (s.getMarks() == marks) {
                result.add(s);
            }
        }
        return result;
    }
}
