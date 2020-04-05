import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }
    public int compareTo(Student st) {
        int v = Double.valueOf(this.cgpa).compareTo(st.cgpa);
        if(v != 0) {
            return -v; // negative value of v because its a descending list
        }
        int n = this.name.compareTo(st.name);
        if(n != 0) {
            return n;
        }
        int i=Integer.valueOf(this.id).compareTo(st.id);
        return i;
    }
 }

 class Priorities {
    Priorities() {}
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).contains("SERVED")) {
                if (queue.size() > 0) {
                     queue.poll();
                }
            }
            else {
                String[] data = events.get(i).split(" ");
                Student tempStudent = new Student(Integer.parseInt(data[3]), data[1], Double.valueOf(data[2]));
                queue.add(tempStudent);
            }
        }
        List<Student> result = new ArrayList<>();
        while (queue.size() > 0) {
            result.add(queue.poll());
        }
        return result;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
