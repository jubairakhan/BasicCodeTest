package firstPackage;

//Determine the fare: $2 for a child (no more than 11
//years), $3 for a senior (at least 65 years), or $5 for an
//adult.

public class IfElseStatementPrac {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age= 22;
		int fare ;
		
		 
			if(age<=11) {
				fare=2;
				System.out.println("you are a child");
			
		}
			else if(age>=65) {
				fare=3;
				System.out.println("you are a senior");
			}
			
			else {
				fare=5;
				System.out.println("you are an adult");
				
			}
			

	}

}
