package AbstractTasks;

	import java.util.Scanner;

	public class bonusCheck {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a[] = new String[3];

	        // Loop to input data 10 times
	        for (int j = 0; j < 10; j++) {
	            System.out.println("Enter your Name, Years of Experience (in numbers), Designation (A1/A2):");

	            // Input for the array
	            for (int i = 0; i < 3; i++) {
	                a[i] = sc.next();
	            }

	            int bonus = 0; // Resetting bonus for each entry

	            // Bonus calculation based on conditions
	            if (a[1].equals("2") && (a[2].equals("A1") || a[2].equals("A2"))) {
	                bonus = 1500;
	            } else if (a[1].compareTo("2") > 0 && a[1].compareTo("6") < 0 && a[2].equals("A1")) {
	                bonus = 3000;
	            } else if (a[1].compareTo("2") >= 0 && a[1].compareTo("6") < 0 && a[2].equals("A2")) {
	                bonus = 2500;
	            } else if (a[1].compareTo("10") > 0) {
	                bonus = 4500;
	            } else {
	                bonus = 2200; // Default bonus
	            }

	            System.out.println("Your Bonus: " + bonus);
	        }
	        sc.close(); // Close the scanner
	    }
	}


