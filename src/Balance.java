import java.time.LocalDate;

public class Balance {
	private int id;
	private LocalDate dateOfBalanceSheet;
	private Customer customer;
	private double cost;
	
	public Balance() {
		
	}

	public Balance(int id, LocalDate dateOfBalanceSheet, Customer customer, double cost) {
		super();
		this.id = id;
		this.dateOfBalanceSheet = dateOfBalanceSheet;
		this.customer = customer;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateOfBalanceSheet() {
		return dateOfBalanceSheet;
	}

	public void setDateOfBalanceSheet(LocalDate dateOfBalanceSheet) {
		this.dateOfBalanceSheet = dateOfBalanceSheet;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
