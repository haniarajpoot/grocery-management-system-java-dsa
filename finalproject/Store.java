package finalproject;

public class Store {
	 private Item[] inventory;
	    private int itemCount;
	    private double totalSales;

	    public Store(int capacity) {
	        inventory = new Item[capacity];
	        itemCount = 0;
	        totalSales = 0;
	    }

	    public void addItem(String name, double price, int quantity) {
	        if (itemCount < inventory.length) {
	            inventory[itemCount++] = new Item(name, price, quantity);
	            System.out.println("Item added successfully.");
	        } else {
	            System.out.println("Inventory full. Cannot add more items.");
	        }
	    }

	    public void displayItems() {
	        if (itemCount == 0) {
	            System.out.println("No items in inventory.");
	            return;
	        }
	        System.out.println("Available Items:");
	        for (int i = 0; i < itemCount; i++) {
	            System.out.print((i + 1) + ". ");
	            inventory[i].displayItem();
	        }
	    }

	    public void purchaseItem(int index, int qty) {
	        if (index < 1 || index > itemCount) {
	            System.out.println("Invalid item number.");
	            return;
	        }

	        Item item = inventory[index - 1];
	        if (qty > item.getQuantity()) {
	            System.out.println("Not enough stock.");
	            return;
	        }

	        double cost = item.getPrice() * qty;
	        item.reduceQuantity(qty);
	        totalSales += cost;
	        System.out.println("Purchased " + qty + " x " + item.getName() + " for $" + cost);
	    }

	    public void viewSales() {
	        System.out.println("Total Sales: $" + totalSales);
	    }
	}

