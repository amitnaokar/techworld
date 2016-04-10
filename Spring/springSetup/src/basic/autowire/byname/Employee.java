package basic.autowire.byname;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	String firstName;
	String lastName;
	int id;
	Address addressBean;
	Set tags;
	Map projectLocations;
	List projects;
	
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
	
	public Address getAddressBean() {
		return addressBean;
	}
	public void setAddressBean(Address addressBean) {
		this.addressBean = addressBean;
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
			   "city:"+ addressBean.city+"\t state:"+ addressBean.state+"\t country:"+ addressBean.country+"\t pincode:"+ addressBean.pincode;
	}
	
	
}
