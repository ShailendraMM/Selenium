package java_basic;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{6,7,8},{9,10,11}};
		 System.out.println(a.length);
		 System.out.println(a[1].length);
		// System.out.println(a.toString());
		 
		 
//		 for(int i=0; i<a.length; i++) {
//			 for(int j=0;j<a[i].length;j++) {
//				 
//				 System.out.print(a[i][j]+",");
//			 }
//			 System.out.println();
//			 
			 
		for(int arr[]:a)	{
			for(int x:arr) {
				
				System.out.print(x+",");
				
			}
		 
		 System.out.println();
		 }
		 
	}

}
