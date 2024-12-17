package collection;

import java.util.*;

public class Client {

		public static void main(String[] args) {
			Queue<Task> q=new PriorityQueue<>();
			//Queue<Task>qcopy=new LinkedList<>(q); // copy of the queue
			TaskManager manager=new TaskManager();
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("Enter the choice:\n1.Adding Task\n2.Removing Task\n3.Status of Task\n4.Displaying all the Tasks\n5.Displaying the next Task\n6.Displaying All Completed Tasks");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter task title: ");
				String title=sc.next();
				System.out.println("Enter task description: ");
				String description=sc.next();
				System.out.println("Enter task priority: ");
				int priority=sc.nextInt();
				System.out.println("Enter task status: ");
				String status=sc.next();
				
				Task task=new Task(title,description,priority,status);
				manager.addTask(task);
				break;
			case 2:
				manager.removeTask();
				break;
			case 3:
				manager.setStatus(sc);
				break;
			case 4:
				manager.displayAllTask();
				break;
			case 5:
				manager.displayNext();
				break;
			case 6:
				manager.displayAllCompleted();
				break;
			}
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
		public int compareTo(Task c) {
			
			return Integer.compare(this.priority, c.priority);
		}
	}

	class TaskManager{
		private Task task;
		TaskSystem system=new TaskSystem();
		public TaskManager() {
			this.task=task;	
		}
		//methods
		public void addTask(Task task){
			
			system.q.add(task);
			System.out.println("Task added: "+task);
		}
		public void removeTask(){
			int priority=Integer.MAX_VALUE;
			Task remove=null;
			for(Task t:system.q) {
				if(t.getPriority()<priority) {
					priority=t.getPriority();
					remove=t;
				}
				system.q.remove();
			}
			System.out.println("Task removed: "+system.q.remove());
		}
		public void setStatus(Scanner sc){
			System.out.println("Enter task title for status check: ");
			sc.nextLine();
			String statcheck=sc.nextLine();
			for(Task task:system.q) {
				if(task.getTitle().equalsIgnoreCase(statcheck)) {
					task.setstatus("Completed");
				}
			}
		}
		public void displayAllTask(){
			system.q.forEach(e->System.out.println(e));
		}
		public void displayNext(){
			Task next=system.q.peek();
			System.out.println("Display next: "+next);
		}
		public void displayAllCompleted(){
			for(Task t:system.q) {
				if("Completed".equals(t.getStatus())) {
					System.out.println(t.toString());
				}
			}
		}
	}

	class TaskSystem{
		 Queue<Task>q;
		TaskSystem(){
			this.q=new LinkedList<>();
		}
		}
	



