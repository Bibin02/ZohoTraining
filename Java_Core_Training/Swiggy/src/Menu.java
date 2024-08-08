import java.util.*;
import java.util.regex.*;
public class Menu implements Runnable {

	// Load System Library for Native methods.
	static{
		System.loadLibrary("sum");
	}
    // Native Method.
	public static native int sumOfArray(int[] array);
    
	List <Order> cart = new LinkedList<>();
    @Override
    public void run() {
        menuOperations();
    }

    public void menuOperations() {
        boolean kill = false;
        // This scanner should not be closed. Since Threading uses shared resources like Inputstream.
        Scanner scan = new Scanner(System.in);
        do {
            // Main.CLRSCR();
            displayDash();
			displayMenu();
            displayCart();
            String option = scan.nextLine();
            switch (option) {
                case "1" -> {
                    // Add item to cart
                    List <Order> list = new DAO().getList();
                    System.out.println("Enter the Food Item :");
                    String regex = scan.nextLine();
                    for (Order order : list) {
                        if (order.food.equals(regex)){
                            this.cart.add(order);
                            System.out.println("Item Added Into Cart.");
                            Main.delay(2000);
                            break;
                        }
                    }
                }

                case "2" -> {
                    // Clear cart
                    this.cart = new LinkedList<>();
                    System.out.println("Cart Emptied.");
                    Main.delay(2000);
                }

                case "3" -> {
                    // Generate Bill
					int sum = 0, i = 0;
					int[] prizes = new int[this.cart.size()];
                    for (Order order : this.cart) {
						prizes[i++] = order.prize;
                    }
					sum = sumOfArray(prizes);
					
					if (sum != 0){
						displayCart();
						System.out.println("\n TOTAL Bill : $ "+sum);
						new Payment().pay(sum, scan);
                        System.out.println("Press any key to continue :");
                        scan.next();
						kill = true;
					}
					else{
						System.out.println("Cart is Empty. Can't Generate Bill.");
						Main.delay(1000);
					}

                }

                case "4" -> {
                    // Find using Regex.
                    List <Order> list = new DAO().getList();
                    System.out.println("Provide Starting Word :");
					String regex = "[" + scan.nextLine() + "]";
                    int count = 0;
                    for (Order order : list) {
                        if (Pattern.matches(regex, order.food)){
                            System.out.println((count++)+". "+order.food+"\t"+order.prize+"\t"+order.rest);
                        }
                    }
                    Main.delay(4000);
                }
                
                case "5" -> {System.out.println("\nThank You !!"); kill = true;}

                default ->{
					
                }
            }

        } while (!kill);
        // scan.close();
    }

    private void displayCart() {
        System.out.println("\nCART");
        System.out.println("\tFood\t\tPrize\tRestaurant");
		Iterator <Order> lst_iterator = cart.iterator();
		int count = 1;
		while(lst_iterator.hasNext()){
			Order o = lst_iterator.next();
			System.out.println((count++)+". "+o.food+"\t"+o.prize+"\t"+o.rest);
		}
        System.out.print("===>>> ");
    }
	
	private void displayMenu() {
		System.out.println("\tFood\t\tPrize\tRestaurant");
        DAO dao = new DAO();
		List <Order> list = dao.getList();
		Iterator <Order> lst_iterator = list.iterator();
		int count = 1;
		while(lst_iterator.hasNext()){
			Order o = lst_iterator.next();
			System.out.println((count++)+". "+o.food+"\t"+o.prize+"\t"+o.rest);
		}
    }

    private void displayDash() {
        System.out.println("\n\n\tGet Your Favorite food for favorite Restaurants.\n");
		System.out.println("1. Add Item into cart.");
		System.out.println("2. Clear Cart");
		System.out.println("3. Buy Cart");
		System.out.println("4. Add Item into cart using Regex.");
        System.out.println("5. Go To Home Page.");
		System.out.println("\n\tHave A Nice Day !!\n");
		System.out.print("==>>> ");
    }
}

class Payment{
	
	// Load System Library.
	static{
		System.loadLibrary("checkBalance");
	}
	// Native Method.
	public native boolean checkBalance(int v1, int v2);
	
	void pay(int sum, Scanner scan){
		System.out.println("Initializing Payment .....");
		Main.delay(500);
		System.out.println("Payment Started ....");
		Main.delay(1000);
		System.out.print("Requesting Bank for $ "+sum+" ...");
        int v2 = scan.nextInt();
		if (checkBalance(v2, sum)){
			Main.delay(1000);
			System.out.print("Payment Status ..");
			Main.delay(2000);
			System.out.println("Success");
			Main.delay(1000);
			System.out.println("Payment Completed.\n Thank You, Enjoy Your Meal :) ");
		}
		else{
			Main.delay(1000);
			System.out.print("Payment Status ..");
			Main.delay(2000);
			System.out.println("Failed");
			Main.delay(1000);
			System.out.println("Payment Aborted due to insufficient funds in Bank.\n Sorry :(");
		}
	}
}