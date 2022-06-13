package class_practice;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	//생성자
	
	public Korean(String name,String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public Korean(String nation,String name, String ssn) {
		this.nation = nation;
		this.name = name;
		this.ssn =ssn;
	}
	
}
