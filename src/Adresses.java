
public class Adresses extends Customer {
    private int id ;
    private String adressDetail;
    private Customer customer;
	public Adresses() {
		super();
	}
	public Adresses(int id, String adressDetail, Customer customer) {
		super();
		this.id = id;
		this.adressDetail = adressDetail;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdressDetail() {
		return adressDetail;
	}
	public void setAdressDetail(String adressDetail) {
		this.adressDetail = adressDetail;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
