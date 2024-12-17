package practiceSun;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LibraryServiceMain {

	private Map<String,String> bookMap;
	
	public LibraryServiceMain() {
		this.bookMap=new HashMap<>();
	}
	
//gettersetter
	public Map<String,String> getbookMap(){
		return bookMap;
	}
	public void setbookMap(Map<String,String> bookMap) {
		this.bookMap=bookMap;
	}
	
//methods
	public int countBooksByCategory(String category) {
		long count=bookMap.values().stream().filter(p->p.equalsIgnoreCase(category.trim())).count();
		return (int) (count>0?count:-1);
		
	}
	public List<String> findBooksByCategory(String category){
		return (List<String>) bookMap.entrySet().stream().filter(set->set.getValue().equalsIgnoreCase(category.trim()))
				.map(Map.Entry::getKey).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> bokMap=new HashMap<>();
		LibraryServiceMain lib=new LibraryServiceMain();
		Scanner sc=new Scanner(System.in);
		String input="";
		System.out.println("Enter the number of books to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the book records (Book ID: Category):");
		for(int i=0;i<=n;i++) {
			input=sc.nextLine();
			String[] parts=input.split(":");
			if(parts.length==2)
				lib.getbookMap().put(parts[0].trim(),parts[1].trim());
		}
			System.out.println("Enter the category to be searched:");
			String search=sc.nextLine().trim();
			int count=lib.countBooksByCategory(search);
			if(count>0)
				System.out.println("The records based on "+search+" are "+count);
			else
				System.out.println("NOT FOUND");
			
			System.out.println("Enter the category to identify the Book IDs:");
			String str=sc.nextLine().trim();
			
			List<String> bookId=lib.findBooksByCategory(str);
			if(!bookId.isEmpty()) {
				System.out.println("The Book IDs in the "+str+" category are ");
				bookId.forEach(System.out::println);
			}else{
				System.out.println("NOT FOUND");
			}
			
		}
	

}
