package spring_dao;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {
   
	private Long id;
	private String name;
	private String pass;
	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder(); 
		sb.append("[id=").append(id).append(",");
		sb.append("[name=").append(name).append(",");
		sb.append("[pass=").append(pass).append("]");
		return sb.toString();
	}
	
	
}
