package collection;

public class Hotel1 {
	String name;
	String add;
	String ord1;
	
	public Hotel1(String name, String add, String ord1) {
		
		this.name = name;
		this.add = add;
		this.ord1=ord1;
		
	}

	@Override
	public String toString() {
		return "Name of Hotel :"+ name+ ", Address of hotel :"+add+", Order:"+ord1;
	}
	
	

}
