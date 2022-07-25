
public class CorporateCustomer extends Customer {

  private String title; 
  private int taxNumber;
  
  public CorporateCustomer() {
	  super();
  }

public CorporateCustomer(String title, int taxNumber) {
	super();
	this.title = title;
	this.taxNumber = taxNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getTaxNumber() {
	return taxNumber;
}
public void setTaxNumber(int taxNumber) {
	this.taxNumber = taxNumber;
}
  
}
