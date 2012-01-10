public class TrickOrTreat {
	
	public static void main(String args[]) {
		Dispatcher dispatch1 = new Dispatcher(); //need to modify
		dispatch1.printDisplay(); //as is
		
		//dispatch1 and dispatch2 are of type Dispatcher
		/*
		 if (dispatch1.equals(dispatch2)) { //NOTE: SHOULD BE TRUE AT ALL COST
		 	System.out.println("both objects are equal");
		 } else {
		 	System.out.println("both objects are NOT equal");
		 }		
			 
	}	
}	

class Dispatcher {
	
	private Dispatcher() { //as is
	}
	
	public void printDisplay() { //as is
		System.out.println("hello world");
	}			
}	

/*
 1. Do NOT add anymore constructors for Dispatcher.
 2. Do NOT modify the private access modifier of Dispatcher constructor.
 3. NEVER change the method prototype printDisplay()
 4. You may add a new function only ONCE.
 5. You can use the static keyword. 
 6. You may add a class/instance variable.
 */