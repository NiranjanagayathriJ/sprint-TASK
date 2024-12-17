package hashTable;

public class StoredColStudent {
	private String key;
	private CollegeStudent obj;
	
	public StoredColStudent(String key, CollegeStudent obj) {
		this.key=key;
		this.obj=obj;
	}
	//getter
	public String getkey() {
		return key;
	}
	public CollegeStudent getCollegeStudent() {
		return obj;
	}
	public String toString() {
		return "StoredColStudent [key="+key+" obj="+obj.getName()+"]";
	}

}
