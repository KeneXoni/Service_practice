public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        // Add students
        service.addStudent(1, new Student("Spike", "Beast", "one", 90));
        service.addStudent(2, new Student("Neo", "Keanu", "one", 85));
        service.addStudent(3, new Student("Agent H", "Chris", "two", 75));

        // Calling methods
        System.out.println("Find a name 'Spike': " + service.findByName("Spike"));
        System.out.println("Find last name 'Keanu': " + service.findByLastname("Keanu"));
        System.out.println("Find a group 'one': " + service.findByGroup("one"));
        System.out.println("Find a estimate 75: " + service.findByMarks(75));
    }
}
