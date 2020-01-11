package firstPackage;

public class HwCarMode {
	
	public static void main(String[]args) {
		char mode ='r';
		String type= "parallel";
		String driveType = "snow";
		boolean backcamera= true;
		
		if(mode=='p' && type == "parallel") {
			System.out.println("you can park between two car");
			
		}
		
		if(mode == 'D') {
			
			if(driveType== "snow") {
				System.out.println("you can drive in snow mode");
			}
				
			if(driveType== "sports") {
				System.out.println("you can drive in sports mode");
			}
		}
		
			if(mode=='n') {
				System.out.println("car can be in wash station");
			}
			
			if(mode== 'r' && backcamera==true) {
				System.out.println("your can only reverse car");
			}
	}
	
}
			
				

	

			
		
	
	


