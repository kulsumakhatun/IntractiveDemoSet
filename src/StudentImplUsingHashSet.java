import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImplUsingHashSet {
    public static void main(String[] args) {

        StudentImplUsingHashSet studentImplUsingHashSet = new StudentImplUsingHashSet();
       Set <Student> students = studentImplUsingHashSet.createSet();
        studentImplUsingHashSet.display(students);
        boolean result = studentImplUsingHashSet.removeByRollNumber(students,12);
        if (result){
            System.out.println("Student Deleted");
        } else {
            System.out.println("Student not Found");
        }
        studentImplUsingHashSet.display(students);


    }

    public Set <Student> createSet(){
        Set<Student>  students = new HashSet<>();
        students.add(new Student("Vaibhav",12,100));
        students.add(new Student("Ramesh",20, 80));
        students.add(new Student("Suresh", 25,70));
        return students;
    }

    public void display(Set<Student> student){
        Iterator <Student> iterator = student.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public boolean removeByRollNumber(Set<Student> students, int rollNo){
        boolean response = false;
        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getRollNo() == rollNo){
                iterator.remove();
                response = true;
                break;
            }
        }

        return response;

    }
}
