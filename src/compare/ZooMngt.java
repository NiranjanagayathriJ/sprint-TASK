package compare;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ZooMngt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Zoo zoo=new Zoo();
		while(true) {
		System.out.println("Enter choice:\n1.Adding animal to the zoo\n2.Removing animal from the zoo\n3.Count the number of animals\n4.Available animals in a species\n5.Available animals of a certain age ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the unique ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Animal name: ");
			String name=sc.nextLine();
			System.out.println("Enter it's Species: ");
			String species=sc.nextLine();
			System.out.println("Enter it's age: ");
			int age=sc.nextInt();
			IAnimal animal=new Animal(id,species,name,age);
			zoo.addAnimal(animal);
			break;
		case 2:
			System.out.println("Enter the unique ID:");
			id=sc.nextInt();
			zoo.removeAnimal(id);
			break;
		case 3:
			System.out.println("No. of Animals in the Zoo: "+zoo.countAnimals());
			break;
		case 4:
			System.out.println("Enter species: ");
			species=sc.nextLine();
			sc.nextLine();
			zoo.getAnimalsBySpecies(species);
			break;
		case 5:
			System.out.println("Enter age: ");
			age=sc.nextInt();
			zoo.getAnimalsByAge(age);
		}
		}
	}

}
interface IAnimal{

}

class Animal implements IAnimal{
	private int id;
	private String species;
	private String name;
	private int age;
	
	public Animal(int id,String species,String name,int age) {
		this.id=id;
		this.species=species;
		this.name=name;
		this.age=age;
	}
	//gettersetter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species=species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String toString() {
		return "Unique ID: "+id+" Name: "+name+" Age: "+age+" Species: "+species;
	}
}

interface IZoo{
	/*public void addAnimal(IAnimal animal);
	public void removeAnimal(int id);
	public int countAnimals();
	public List<IAnimal> getAnimalsBySpecies(String species);
	public void getAnimalsByAge();*/
}

class Zoo implements IZoo{
	private List<IAnimal> list;
	public Zoo() {
		list=new LinkedList<>();
	}
	
	public void addAnimal(IAnimal animal) {
		list.add(animal);
		System.out.println("Animal added to the list:");
		System.out.println(animal);
		System.out.println(list.toString());
	}
	public void removeAnimal(int id) {
		for(IAnimal rem:list) {
			if(((Animal)list).getId()==id)
				list.remove(rem);
		System.out.println("Animal to be removed from the List:"+rem);
		System.out.println(" Removed id "+id);
		return;
		
	}
	}
	public int countAnimals() {
	 return list.size();
	 //(int) list.stream().filter(p->p instanceof Animal).count();
	
	}
	public List<IAnimal> getAnimalsBySpecies(String species) {
		System.out.println("Animals of the species:");
		List<IAnimal> alist=new LinkedList<>();
		for(IAnimal a:list)
		{
			if(((Animal)a).getSpecies().equalsIgnoreCase(species))
			{
				alist.add(a);
			}
		}
		return alist;
		
	}
	public void getAnimalsByAge(int age) {
		Map<Integer,List<IAnimal>> map=new TreeMap<>();
		for(IAnimal a:list) {
			int age1=((Animal)a).getAge();
			if(map.containsKey(age1)) {
				map.get(age1).add(a);
			}
			else {
				List<String>r=new ArrayList<>();
				list.add(a);
				map.put(age1, list);
				System.out.println(list);
			}
		}
	
	}
	
	
}
