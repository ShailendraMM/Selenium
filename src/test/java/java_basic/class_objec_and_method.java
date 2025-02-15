package java_basic;

public class class_objec_and_method {
	String name;
	String add;
	String contact;
	
	void detail() {
		System.out.println(name);
		System.out.println(add);
		System.out.println(contact);
	}
	
	  void detail2 (String nam,String add,String mob) {
		nam=name;
		add=add;
		mob=contact;
		
		System.out.println(name);
		System.out.println(add);
		System.out.println(contact);
		}

	  //constructor	
	  public class_objec_and_method(String name1,String add2,String mob) //---parameterized constructor
	  {
		  name=name1;
		  add=add2;
		  contact=mob;
	}
	  
//	  public class_objec_and_method() //---default constructor
//	  {
//      name ="abhi";
//      add="123 xfds";
//      contact="95959595";
//      
//	  }
//		
//	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
/*		//assigning data by object reference method
		class_objec_and_method emp1=new class_objec_and_method();
		// for class_objec_and_method we are creating object emp1 (object only created in main method)
		emp1.name="abc";
		emp1.add="xyz xyz 123";
		emp1.contact="9999999999";
		
		emp1.detail();
		
		class_objec_and_method emp2=new class_objec_and_method();
		emp2.name="aman";
		emp2.add="123 wqwe djf";
		emp2.contact="9847747384";
		
		emp2.detail();
		
		
		//assigning data by user defined method
		class_objec_and_method emp3=new class_objec_and_method();
		emp3.detail2("anand", "123 xyzie", "9383883");
		
		//by using constructor
		 * 
		//constructor name should be same as class name-->method name can be anything
		//constructor name never return a value-->method may return value
		//constructor can be invoke at the time of object declaration---> invoke through object
*/		//constructor used for initializing the value of variable-->method used for specifying the logic

		
		//using parameterized constructor
		class_objec_and_method emp4=new class_objec_and_method("shailendra","Gorakhpur", "907789363");
		emp4.detail();
				
		//using default constructor
		class_objec_and_method emp5=new class_objec_and_method();
		emp5.detail();
		

	}

}
