package firstPackage;

public class SupermarketSwitch {
	public static void main(String[]args) {
		String itemType= "diaper";
		switch(itemType.toLowerCase()) {
		case "milk":
		case "eggs":
		case "donuts":
			System.out.println("Aisle Eight");
			break;
		case "french fries":
		case "frozen pizza":
			System.out.println("Aisle Seven");
		break;
		case "candy":
			System.out.println("Aisle Three");
		break;
				
		case "diaper":
			System.out.println(" Aisle one");
			break;
		
		case "apple":
		case "orange":
			System.out.println("Aisle two");
			break;
		
			
	default:
		System.out.println("out of stock");
		
	}
	
	
	}
		
	}


