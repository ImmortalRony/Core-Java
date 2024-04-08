package collection;

import java.util.Objects;

public class Students {
	String sname;
	int sid;
	int std;
	
	public Students(String sname, int sid, int std) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student name :"+sname+" student id : "+sid+" standard: "+std;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid, sname, std);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return sid == other.sid && Objects.equals(sname, other.sname) && std == other.std;
	}
	
}
