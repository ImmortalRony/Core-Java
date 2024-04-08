package collection;

import java.util.Objects;

public class Accounts {
	String name;
	int acno;
	 int ifsc;
    String pswd;
    String city;
   int  bal;
	int cno;
	public Accounts(String name, int acno, int ifsc, String pswd, String city, int bal, int cno) {
		this.name = name;
		this.acno = acno;
		this.ifsc = ifsc;
		this.pswd = pswd;
		this.city = city;
		this.bal = bal;
		this.cno = cno;
	}
	@Override
	public String toString() {
		return "Name :"+name+ "  Account no. : "+acno+ "  IFSC code : "+ifsc+ "  Password : "+pswd +"  City : " +city+"  Contact no.: "+cno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(acno, bal, city, cno, ifsc, name, pswd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounts other = (Accounts) obj;
		return acno == other.acno && bal == other.bal && Objects.equals(city, other.city) && cno == other.cno
				&& ifsc == other.ifsc && Objects.equals(name, other.name) && Objects.equals(pswd, other.pswd);
	}
	
	

}
