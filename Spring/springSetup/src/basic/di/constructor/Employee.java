package basic.di.constructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	String firstName;
	String lastName;
	int id;
	Address address;
	Set tags;
	Map projectLocations;
	List projects;
	
	public Employee(Address address, Set tags, List projects, Map projectLocations){
		this.address=address;
		this.tags=tags;
		this.projects=projects;
		this.projectLocations = projectLocations;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Set getTags() {
		return tags;
	}
	public void setTags(Set tags) {
		this.tags = tags;
	}
	
	public Map getProjectLocations() {
		return projectLocations;
	}
	public void setProjectLocations(Map projectLocations) {
		this.projectLocations = projectLocations;
	}
	public List getProjects() {
		return projects;
	}
	public void setProjects(List projects) {
		this.projects = projects;
	}
	public String toString(){
		return "name:"+firstName+"\t lastName:"+lastName+"\t id:"+id+"\n"+
			   "city:"+address.city+"\t state:"+address.state+"\t country:"+address.country+"\t pincode:"+address.pincode;
	}
	
	
}
