
public class IndividualCustomer extends Customer {
 private String firtName;
 private String LastName;
 private String nationalIdentitiy;
public IndividualCustomer() {
	super();
}
public IndividualCustomer(String firtName, String lastName, String nationalIdentitiy) {
	super();
	this.firtName = firtName;
	LastName = lastName;
	this.nationalIdentitiy = nationalIdentitiy;
}
public String getFirtName() {
	return firtName;
}
public void setFirtName(String firtName) {
	this.firtName = firtName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getNationalIdentitiy() {
	return nationalIdentitiy;
}
public void setNationalIdentitiy(String nationalIdentitiy) {
	this.nationalIdentitiy = nationalIdentitiy;
}

}
