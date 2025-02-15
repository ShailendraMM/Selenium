package java_basic;

public class CallByValueCallByReference {
	static int n;
	
	
	void m1(int n) {
		n=n+10;
		System.out.println(n);
	}
		
	void m2(CallByValueCallByReference c) {
		c.n=n+10;
		System.out.println(n);
		
	}
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///call by value (referring copied value in method)--->original value doesn't affect after applying method
		CallByValueCallByReference call=new CallByValueCallByReference();
		call.n=100;
		System.out.println(call.n);
		call.m1(n);
		System.out.println("n value after m1 method="+n);
	
		//call by reference (referring original value in method)--->original value doesn't affect after applying method
        call.m2(call);
        System.out.println("n value after m2 method="+n);
        
       
        		
	}

}
