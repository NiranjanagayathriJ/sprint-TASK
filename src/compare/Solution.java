package compare;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
     public int compareTo(Student S) {
           
            int comparecgpa = Double.compare(S.getCGPA(), this.getCGPA());
            if(comparecgpa!=0) {
                return comparecgpa;
            }
         
         int ncomp = this.getName().compareTo(S.getName()); 
         if(ncomp!=0) {
             return ncomp ;
         }
         
         return Integer.compare(S.getID(), this.getID());
            
        }
    }


class Priorities {
    public List<Student> getStudents(List<String> events) {
        Queue<Student> queue = new PriorityQueue<>();
    
    

        List<Student> students = new ArrayList<>();

        for (String event : events) {
            String[] eventDetails = event.split(" ");

            if ("ENTER".equals(eventDetails[0])) {
                String name = eventDetails[1];
                double cgpa = Double.parseDouble(eventDetails[2]);
                int id = Integer.parseInt(eventDetails[3]);
                queue.offer(new Student(name, cgpa, id));
            } else if ("SERVED".equals(eventDetails[0])) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }

        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}



