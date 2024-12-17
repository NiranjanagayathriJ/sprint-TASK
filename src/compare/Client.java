package compare;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		Queue<Task> q=new PriorityQueue<>();
		Queue<Task>qcopy=new PriorityQueue<>(q); // copy of the queue
		q.add(new Task("ABC","abc",2,"Pending"));
		q.add(new Task("DEF","def",1,"Completed"));
		q.add(new Task("GHI","ghi",3,"Pending"));
		q.add(new Task("JKL","jkl",4,"Pending"));
		TaskManager manager=new TaskManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice:\n1.Adding Task\n2.Removing Task\n3.Status of Task\n4.Displaying all the Tasks\n5.Displaying the next Task\n6.Displaying All Completed Tasks");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			manager.addTask(new Task("XYZ","xyz",5,"Completed"));
		case 2:
			manager.removeTask(new Task("GHI","ghi",3,"Pending"));
		case 3:
			manager.setStatus(new Task("DEF","def",1,"Completed"));
		case 4:
			manager.displayAllTask();
		case 5:
			manager.displayNext();
		case 6:
			manager.displayAllCompleted();
		}
	}

}

class Task{
	private String title;
	private String description;
	private int priority;
	private String status;
	
	public Task(String title,String description,int priority,String status) {
		this.title=title;
		this.description=description;
		this.priority=priority;
		this.status=status;
	}
	//gettersetter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority=priority;
	}
	public String getStatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status=status;
	}
	public String toString() {
		return "Title: "+title+", Description: "+description+" Priority: "+priority+", Status: "+status;
	}
}

class TaskManager{
	private Task task;
	private Queue<Task>q;
	private Queue<Task>qcopy;
	public TaskManager() {
		this.task=task;
		this.q=new PriorityQueue<>();
	}
	//methods
	public void addTask(Task t){
		q.add(task);
	}
	public void removeTask(Task t){
		q.poll();
	}
	public void setStatus(Task t){
		if(q.contains(t))
			System.out.println("Status: Pending");
		else
			System.out.println("Status: Completed");
	}
	public void displayAllTask(){
		qcopy.forEach(e->System.out.println(e));
	}
	public void displayNext(){
		q.peek();
	}
	public void displayAllCompleted(){
		if(qcopy.equals(q)) {
			System.out.println(q);
		}
	}
}

class TaskSystem{
	TaskManager mgr;
	private Queue<Task>q=new PriorityQueue<>();
	
	TaskSystem(){
		this.q=q;
	}
	//gettersetter
	public Queue<Task> getQ(){
		return q;
	}
	public void setQ(Queue<Task> q){
		this.q=q;
	}
	
}
