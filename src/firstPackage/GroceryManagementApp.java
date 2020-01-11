package firstPackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GroceryManagementApp {
	static Scanner scanner;

	static ArrayList<String> listOfGroceryItem = new ArrayList<String>();

	// "", "", ""

	public static void main(String[] args) {

		listOfGroceryItem.add("Tea");// 0
		listOfGroceryItem.add("Bread");// 1
		listOfGroceryItem.add("Oil");// 2
		listOfGroceryItem.add("orange");// 3
		scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("\n Welcom Grocery Management App Press the options : \n \n");
		choiceOptions(0);
		// press();
		System.out.println(" ");

	}

	public static void press() {
		// Numerical input
		System.out.println("  ");

		int options = scanner.nextInt();
		if (options == 0) {
			choiceOptions(options);
		} else if (options == 1) {
			listOfGroceryItems(options);
		} else if (options == 2) {
			addItemInList(options);
		}

		else if (options == 3) {
			modifyAnItem(options);
		}

		else if (options == 4) {
			removeItemFromList();

		}

		else if (options == 5) {
			searchItemList();
		}

		else if (options == 6) {
			quitTheApplication();
		}

	}

	private static void removeItem(int options) {
		// TODO Auto-generated method stub

	}

	public static void choiceOptions(int options) {
		System.out.println("**************");
		System.out.println("    0 - To print choice options.            \n "
				+ "    1 - To print the list of grocery items. \n " + "    2 - To add an item to the list.         \n "
				+ "    3 - To modify an item in the list.      \n " + "    4 - To remove an item from the list.    \n "
				+ "    5 - To search for an item in the list.  \n "
				+ "    6 - To quit the application.               ");
		System.out.println("**************");
		press();

	}

	public static void listOfGroceryItems(int options) {

		for (int i = 0; listOfGroceryItem.size() > i; i++) {
			System.out.println((i + 1) + ": " + listOfGroceryItem.get(i));

		}
		System.out.println("   0 - To print choice options. ");
		press();

	}

	public static void addItemInList(int options) {
		System.out.println("Type the grocery item");
		scanner = new Scanner(System.in);
		String addItemValue = scanner.nextLine();

		listOfGroceryItem.add(addItemValue);
		System.out.println("   0 - To print choice options. ");

		press();

	}

	public static void modifyAnItem(int options) {
		// TODO Auto-generated method stub
		// System.out.println("Befor the modify the Grocery list");

		System.out.println("Modify the item just type the item from the list");
		scanner = new Scanner(System.in);
		Integer index = null;
		String modifyItemValue = scanner.nextLine();

		for (int i = 0; listOfGroceryItem.size() > i; i++) {
			System.out.println(listOfGroceryItem.get(i));
			if (listOfGroceryItem.get(i).equalsIgnoreCase(modifyItemValue.trim())) {
				index = i;
			}
		}
		System.out.println("Enter the new item just type  ");
		scanner = new Scanner(System.in);
		String newItemValue = scanner.nextLine();
		if (index != null) {
			listOfGroceryItem.set(index, newItemValue);

		}
		System.out.println("   0 - To print choice options. ");

		press();

	}

	// System.out.println("To search for an item in the list");
	public static void searchItemList() {
		System.out.println("Enter the search items");
		scanner = new Scanner(System.in);
		String yesOrNo = "";
		String searchItemList = scanner.nextLine();

		for (int i = 0; listOfGroceryItem.size() > i; i++) {
			// System.out.println(listOfGroceryItem.get(i));
			if (listOfGroceryItem.get(i).equalsIgnoreCase(searchItemList.trim())) {
				yesOrNo = "yes";
			}
		}
		if (yesOrNo.equalsIgnoreCase("YES")) {
			System.out.println("item found in the list");

		} else {
			System.out.println("item not fund");

		}
		System.out.println("   0 - To print choice options. ");
		press();

	}

	// remove item from the list
	@SuppressWarnings("unlikely-arg-type")
	public static void removeItemFromList() {
		System.out.println("Remove the item just type the item from the list");
		scanner = new Scanner(System.in);
		int index = 0 ;boolean falg= false;
		String removeItem = scanner.nextLine();
		String value="";
		

		for (int i = 0; listOfGroceryItem.size() > i; i++) {
			System.out.println(listOfGroceryItem.get(i));
			if (listOfGroceryItem.get(i).equalsIgnoreCase(removeItem.trim())) {
				index = i;
				value =listOfGroceryItem.get(i);
				falg = true;
			}
		}
		System.out.println("Enter the new item just type  ");

		if (falg) {
			listOfGroceryItem.remove(index);
			//listOfGroceryItem.remove(value);
		}
		System.out.println("   0 - To print choice options. " + listOfGroceryItem);
		press();
	}

	public static void quitTheApplication() {

		// To quit the application
		System.out.println("you are quiting the application");
		System.exit(0);

	}

}
