package collection;

import java.util.Objects;

public class Customer1 {
	String cname;
	int cno;
	String city;
	public Customer1(String cname, int cno, String city) 
	{
		this.cname = cname;
		this.cno = cno;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer name :"+cname+ ", Contact no.:"+cno+ ", City :"+city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, cname, cno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer1 other = (Customer1) obj;
		return Objects.equals(city, other.city) && Objects.equals(cname, other.cname) && cno == other.cno;
	}
	
	
	
	

}
