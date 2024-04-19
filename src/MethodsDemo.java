public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MethodsDemo d = new MethodsDemo();
		//d.getData();
		
		// if i want access any method, i need to create object for cls
		//MethodsDemo a = new MethodsDemo();
		//String name = a.getletter();
		//System.out.println(name);
		
		//MethodsDemo2 b = new MethodsDemo2();
		//String name2 = b.getdotletter();
		//System.out.println(name2);
		
		//getdirectletter();
	}

	//why method --> set of actions to be performed, it allow to reuse the code to define once and we use multiple times
	//we cannot create methods in inside the main block, 
	//here we are declaring the method not running anything
	//void cannot return anything
	//we used cls to create object, that obj we are calling method
	
	//public void getData()
	{
		//System.out.println("Hello World!");
	}
	
	//public String getletter()
	{
		//System.out.println("Hello World!");
		//return "welcome";
	}
    
	// if we use static keyword, our method will access main cls

	public static String getdirectletter()
	{
		System.out.println("Nishaa");
		return "Back";
	}


}

