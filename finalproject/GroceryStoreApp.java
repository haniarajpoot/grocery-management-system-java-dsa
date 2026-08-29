package finalproject;
import java.util.Scanner;
public class GroceryStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Store store = new Store(100);  // Store with max 100 items

	        while (true) {
	            System.out.println("\n===== Grocery Store Menu =====");
	            System.out.println("1. Add Item");
	            System.out.println("2. Display Items");
	            System.out.println("3. Purchase Item");
	            System.out.println("4. View Sales");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter price: ");
	                    double price = scanner.nextDouble();
	                    System.out.print("Enter quantity: ");
	                    int quantity = scanner.nextInt();
	                    store.addItem(name, price, quantity);
	                    break;

	                case 2:
	                    store.displayItems();
	                    break;

	                case 3:
	                    store.displayItems();
	                    System.out.print("Enter item number to purchase: ");
	                    int itemNumber = scanner.nextInt();
	                    System.out.print("Enter quantity: ");
	                    int qty = scanner.nextInt();
	                    store.purchaseItem(itemNumber, qty);
	                    break;

	                case 4:
	                    store.viewSales();
	                    break;

	                case 5:
	                    System.out.println("Thank you for using the Grocery Store Management System!");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
}

