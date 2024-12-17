package compare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CourseServiceMain{
	//private int n;
	//private String input;
	private Map<String, String> courierMap;
	public CourseServiceMain() {
		//this.n=n;
		//this.input=input;
		this.courierMap=new HashMap<>();
	}

	public Map<String,String> getCourierMap(){
		return courierMap;
	}
	public void setCourierMap(Map<String,String> courierMap) {
		this.courierMap=courierMap;
	}
	
	public int findTheCountOfCuriersBasedOnTheCourierType(String couriertype) {
		long count=courierMap.values().stream().filter(type->type.equalsIgnoreCase(couriertype.trim())).count();
		return (int) (count>0? count:-1);
		}
	
	public List<String> findCourierIdsBasedOnTheCourierType(String courierType){
		return (List<String>) courierMap.entrySet().stream().filter(set->set.getValue().equalsIgnoreCase(courierType.trim()))
				.map(Map.Entry::getKey).collect(Collectors.toList());
	}
	
}

public class DashingDelivery {

	public static void main(String[] args) {
		Map<String,String> courierMap=new HashMap<>();
		CourseServiceMain service=new CourseServiceMain();
		Scanner sc=new Scanner(System.in);
		String input="";
		System.out.println("Enter number of records to be added");
		int n=sc.nextInt();
		System.out.println("Enter the records (Courier Id: Courier type)");
		for(int i=0;i<=n;i++) {
			input=sc.nextLine(); 
			//sc.nextLine();
			String[] parts=input.split(":");
			if(parts.length==2)
				service.getCourierMap().put(parts[0].trim(),parts[1].trim());
		}
		System.out.println("Enter the Courier type to be searched");
		String searchType=sc.nextLine().trim();
		int count=service.findTheCountOfCuriersBasedOnTheCourierType(searchType);
		if(count>0)
			System.out.println("The records based on "+searchType+" are "+count);
		else
			System.out.println("No records were found for "+searchType);
		
		System.out.println("Enter the Courier type to identify the Courier Ids");
		String str=sc.nextLine().trim();
		List<String> courierIds=service.findCourierIdsBasedOnTheCourierType(str);
		if(!courierIds.isEmpty()) {
			System.out.println("Records based on the "+str+" are ");
		courierIds.forEach(System.out::println);
		}else
			System.out.println("No Courier Ids were found for the "+str);
		
	}

}

