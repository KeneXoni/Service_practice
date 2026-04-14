public class Student {
    private String name;
    private String lastname;
    private String group;
    private int marks;

    public Student (String name, String Lastname, String group, int marks) {
        this.name = name;
        this.lastname = Lastname;
        this.group = group;
        this.marks = marks;

    }
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public String getGroup(){
        return group;
    }
    public int getMarks(){
        return marks;
    }
    @Override
    public String toString(){
        return name + " " + lastname + " | Group: " + group + " | Marks: " + marks;
    }
}
