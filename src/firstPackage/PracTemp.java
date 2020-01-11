package firstPackage;

//import java.util.Arrays;

public class PracTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method 
String wordForAbreviaton= "new day";
String abbreviation= " ";
String[]newArr= wordForAbreviaton.split("\\s");
for(int i=0;i<newArr.length; i++) {
	abbreviation= abbreviation + newArr[i].charAt(0);
	abbreviation= abbreviation.toUpperCase();
	
	
}

System.out.println(abbreviation);

	}
}

			
			
		
//		String name= "";
//		for(int i= st.length()-1; i>=0;i--) {
//			name= name + st.charAt(i);
//		}
//			
//		System.out.println(name);
//		
//		}
//		
//		
		
	
//	int[]arr= {22,43,21,50};
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max= arr[i];
//				
//			}
//		}
//			System.out.print(max);
//		}
//	
		
//		int sum=0;
//		int[]num = {1,6,2,7};
//		Arrays.sort(num);
//		for(int i=0;i<num.length;i++) {
//			sum= sum + num[i];
//		}
//			System.out.print(sum);
//		}
//	
	
	
	
//int []num = {2,3,4,5};
//int sum = 0;
//for(int i=0; i<num.length;i++){
//sum= (sum + num[i]);
//
//}n
//System.out.print("the sum is: " + sum);



