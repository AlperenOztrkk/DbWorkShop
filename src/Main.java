
public class Main {

	public static void main(String[] args) {
		Canal canal =new Canal(1,"Banka");
		CorporateCustomer customer1 = new CorporateCustomer();
		customer1.setCanal(canal);
		customer1.setCustomerNumber("252522");
		customer1.setId(40);
        customer1.setTaxNumber(25);
	
		
		//<Customer customer2=new Adresses(40,"Kaleyazı mah. Akpınar/Kırşehir",new CorporateCustomer("Alperen .AS",40));
		System.out.println(customer1.getCustomerNumber());
		System.out.println(customer1.getId());
		System.out.println(customer1.getCanal().getName());
	
		
	

	}

}
