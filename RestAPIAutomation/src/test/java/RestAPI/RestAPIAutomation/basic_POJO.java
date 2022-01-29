package RestAPI.RestAPIAutomation;

public class basic_POJO {
	// For Pojo declare all keys as Private 
private String FirstName;
private String LastName;
private String Id;
private String Designation;
private addressINFO_POJO[] address;



public addressINFO_POJO[] getAddress() {
	return address;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public String getDesignation() {
	return Designation;
}
public void setAddress(addressINFO_POJO[] address2) {
	// TODO Auto-generated method stub
	
}

}
