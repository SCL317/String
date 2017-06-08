package spring_first;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {
	private String name;
	private String address;
	private String memo;
	
	public String toString() {
		return "Users[name="+name+",address="+address+",momo="+memo+"]";
	}

}
