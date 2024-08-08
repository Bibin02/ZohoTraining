import java.util.*;

public class DataHandlerDAO{
	
	private DataHandlerDAO(){}

	// Load Data from File
	static{

	}
	
	public static Biller fetchBiller(String id, int pin){
		Iterator <Biller> b_iterator = SuperMarketData.billers.iterator();
		while (b_iterator.hasNext()) {
			Biller biller = b_iterator.next();
			System.out.println((id+pin).hashCode());
			if ((id+pin).hashCode() == biller.hash) {
				return biller;
			}
		}
		return null;
	}
	
	public static boolean addBillerInDB(Admin admn, Biller biller){
		if (admn != null) {
			return SuperMarketData.billers.add(biller);
		}
		System.out.println("Only Admins can Do it.");
		return false;
	}
	
	public static boolean deleteBillerFromDB(Admin admn, String id, int pin){
		if (admn != null) {
			Iterator <Biller> b_iterator = SuperMarketData.billers.iterator();
			while (b_iterator.hasNext()) {
				Biller biller = b_iterator.next();
				if ((id+pin).hashCode() == biller.hash) {
					return SuperMarketData.billers.remove(biller);
				}
			}System.out.println("Can't find a record");
			return false;
		}
		System.out.println("Only Admins can Do it.");
		return false;
	}
	
	public static boolean updateGroceriesInDB(Admin admn, Scanner scan){
		if (admn != null) {
			System.out.println("Enter the Grocery item : ");
			String item = scan.nextLine();
			System.out.println("Enter stock came : ");
			int number = scan.nextInt();
			System.out.println("Enter Prize : ");
			int prize = scan.nextInt();

			Groceries g = Update_or_CreateGroceriesInDB(item, number, prize, item+" : Description");
			// Item not found
			if (g != null) {
				SuperMarketData.groceries.add(g);
			}
			// if null then the item is updated.
			return true;
		}
		System.out.println("Only Admins can Do it.");
		return false;
	}

	static Groceries Update_or_CreateGroceriesInDB(String item, int number, int prize, String desc) {
		Iterator <Groceries> g_iterator = SuperMarketData.groceries.iterator();
		while (g_iterator.hasNext()) {
			Groceries grocery = g_iterator.next();
			if (grocery.name.equals(item)) {
				grocery.stock += number;
				return null;
			}
		}
		return new Groceries(item, number, prize, desc);
	}

	public static boolean createCustomerRecord(Biller biller, Scanner scan) {
		if (biller != null) {
			System.out.println("Enter Details of the customer.");
			System.out.println("1.Name");
			System.out.println("2.Phone No.");
			Customer customer = new Customer(scan.nextLine(), scan.nextInt());
			SuperMarketData.customers.add(customer);
			return customer.getThingsBought(scan);
		}
		System.out.println("Only Billers / Admins can Do it.");
		return false;
	}

	public static int getGroceriesInDB(String item_name) {
		int stock = 0;
		Iterator <Groceries> g_iterator = SuperMarketData.groceries.iterator();
		while (g_iterator.hasNext()) {
			Groceries grocery = g_iterator.next();
			if (grocery.name.equals(item_name)) {
				return grocery.stock;
			}
		}
		return stock;
	}

	public static int getPrize(String item_name) {
		int prize = 0;
		Iterator <Groceries> g_iterator = SuperMarketData.groceries.iterator();
		while (g_iterator.hasNext()) {
			Groceries grocery = g_iterator.next();
			if (grocery.name.equals(item_name)) {
				return grocery.prize;
			}
		}
		return prize;
	}
	
}

// Final class to prevent inheriting.
final class SuperMarketData{
	// All data are protected
	protected static String marketname = "Annachi";
	protected static List<Biller> billers = new ArrayList<>();
	protected static List<Groceries> groceries = new ArrayList<>();
	protected static List<Customer> customers = new ArrayList<>();
}

class Customer{
	String name;
	int ph;
	TB thingsBought;
	
	Customer(String name, int ph){
		this.name = name;
		this.ph = ph;
	}

	boolean getThingsBought(Scanner scan) {
		boolean kill = false;
		TB item = new TB();
		do {
			System.out.println("To continue press 1\nTo Generate Bill press 2");
			switch (scan.nextLine()) {
				case "1":
					System.out.println("Enter Item , Quantity");
					String item_name = scan.nextLine();
					int item_count = scan.nextInt();
					int item_present = DataHandlerDAO.getGroceriesInDB(item_name);
					if (item_present > 0) {
						if (item_count <= item_present) {
							item.put(item_name, item_count, DataHandlerDAO.getPrize(item_name) * item_count);
						}
						else{
							System.out.println("Only "+item_present+" Stocks Available");
							break;
						}
					}
					else{
						System.out.println("No such item found in inventory");
					}
					break;

				case "2":
					printCustomerDetails();
					item.printBill();
					kill = true;
					break;

				default:
					System.out.println("Provide valid option.");
					break;
			}
			
		} while (!kill);
		
		return true;
	}

	private void printCustomerDetails() {
		System.out.println("Customer Name : "+this.name);
		System.out.println("Customer Phone number : "+this.ph);
	}
}

class Groceries{
	String name;
	int stock;
	int prize;
	String description;
	
	Groceries(String name, int stock, int prize, String description){
		this.name = name;
		this.stock = stock;
		this.prize = prize;
		this.description = description;
	}
}

class TB{
	String item;
	int quantity;
	int totalMRP;
	List <TB> list;

	void put(String item, int quantity, int totalMRP){
		TB row = new TB();
		row.item = item;
		row.quantity = quantity;
		row.totalMRP = totalMRP;
		
		this.list.add(row);
	}
	
	void printBill(){
		Iterator <TB> item_iterator = list.iterator();
		System.out.println("ITEM\tQUANTITY\tPRIZE\tTOTAL AMOUNT");
		int sum = 0;
		while (item_iterator.hasNext()) {
			TB row = item_iterator.next();
			sum += row.totalMRP;
			System.out.println(row.item+"\t"+row.quantity+"\t"+row.totalMRP/row.quantity+"\t"+row.totalMRP);
		}
		System.out.println("\nGrand Total : $"+sum);
	}
}