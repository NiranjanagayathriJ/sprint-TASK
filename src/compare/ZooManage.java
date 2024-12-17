package compare;
import java.util.*;
public class ZooManage {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        IZoo zoo = new Zoo();  // Create a zoo instance
	        
	        while (true) {
	            System.out.println("Enter choice:\n1.Adding animal to the zoo\n2.Removing animal from the zoo\n3.Count the number of animals\n4.Available animals in a species\n5.Available animals of a certain age ");
	            int choice = sc.nextInt();
	            sc.nextLine();  // Consume newline after integer input
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the unique ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();  // Consume newline
	                    System.out.println("Enter the Animal name: ");
	                    String name = sc.nextLine();
	                    System.out.println("Enter its Species: ");
	                    String species = sc.nextLine();
	                    System.out.println("Enter its age: ");
	                    int age = sc.nextInt();
	                    IAnimal animal = new Animal(id, species, name, age);
	                    zoo.addAnimal(animal);  // Add animal to the zoo
	                    break;
	                case 2:
	                    System.out.println("Enter the unique ID to remove:");
	                    int idToRemove = sc.nextInt();
	                    zoo.removeAnimal(idToRemove);  // Remove animal from the zoo
	                    break;
	                case 3:
	                    zoo.countAnimals();  // Display the total count of animals
	                    break;
	                case 4:
	                    System.out.println("Enter species to search for: ");
	                    sc.nextLine();  // Consume leftover newline
	                    String speciesToSearch = sc.nextLine();
	                    zoo.getAnimalsBySpecies(speciesToSearch);  // Get animals by species
	                    break;
	                case 5:
	                    System.out.println("Enter age to search for: ");
	                    int ageToSearch = sc.nextInt();
	                    zoo.getAnimalsByAge(ageToSearch);  // Get animals by age
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}

	interface IAnimal {
	    int getId();
	    String getSpecies();
	    String getName();
	    int getAge();
	    String toString();
	}

	class Animal implements IAnimal {
	    private int id;
	    private String species;
	    private String name;
	    private int age;

	    public Animal(int id, String species, String name, int age) {
	        this.id = id;
	        this.species = species;
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public String getSpecies() {
	        return species;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "Unique ID: " + id + " Name: " + name + " Age: " + age + " Species: " + species;
	    }
	}

	interface IZoo extends IAnimal {
	    void addAnimal(IAnimal animal);
	    void removeAnimal(int id);
	    void countAnimals();
	    void getAnimalsBySpecies(String species);
	    void getAnimalsByAge(int age);
	}

	class Zoo implements IZoo {
	    private List<IAnimal> list;

	    public Zoo() {
	        this.list = new LinkedList<>();
	    }

	    public List<IAnimal> getList() {
	        return list;
	    }

	    @Override
	    public void addAnimal(IAnimal animal) {
	        list.add(animal);
	        System.out.println("Animal added to the list:");
	        System.out.println(animal);
	    }

	    @Override
	    public void removeAnimal(int id) {
	        Iterator<IAnimal> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            IAnimal rem = iterator.next();
	            if (rem.getId() == id) {
	                iterator.remove();  // Remove the animal from the list
	                System.out.println("Animal with ID " + id + " has been removed.");
	                return;  // Exit after removing
	            }
	        }
	        System.out.println("No animal found with ID " + id);  // If no animal is found
	    }

	    @Override
	    public void countAnimals() {
	        System.out.println("List before counting: " + list);  // Debugging statement to show list contents
	        long count = list.stream().count();  // Use stream to count the animals
	        System.out.println("Total count of Animals: " + count);
	    }

	    @Override
	    public void getAnimalsBySpecies(String species) {
	        boolean found = false;  // Flag to check if we find any animal with the given species
	        for (IAnimal a : list) {
	            if (a.getSpecies().equalsIgnoreCase(species)) {
	                System.out.println(a);  // Print the animal if its species matches
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No animals found with species: " + species);
	        }
	    }

	    @Override
	    public void getAnimalsByAge(int age) {
	        boolean found = false;
	        for (IAnimal a : list) {
	            if (a.getAge() == age) {
	                System.out.println(a);  // Print the animal if its age matches
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No animals found with age: " + age);
	        }
	    }
	}

