
public class JavaBrushUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DataTypes and Variable
		
			int myNum = 5;
			String para = "Nisha is the empolyee of the TCS";
			char letter ='N';
			boolean myCard = true;
			float num = 4.23f;
			//System.out.println(letter+para);
				
			//Arrays
			// type 1
			 String[] arr = new String[5];
			 arr[0] = "Nisha";
			 arr[1] = "sai";
			 arr[2] = "nithi";
			 arr[3] = "ram";
			 arr[4] = "sita";
			 //System.out.println(arr[1]);
			
			 // type 2
			 int[] arr2 = {1,2,3,4,5};
	         //System.out.println(arr2[4]);
			
	         // for loop
			 /*for(int i = 0; i<arr2.length; i++)
			 {
			System.out.println(arr2[i]);
			}*/
			 
			 // Enhanced for loop syntax
			 for(int n : arr2)
			 {
			    System.out.println(n);
			 }
				 
	}

}
