package main.java.com.nagarro.assignment1.View;
public class Input_Validation {
	
	/**
	 * To validate the Location.
	 * 
	 * @param str
	 * @return
	 */
	public static boolean location_Validate(String str) {
		if(str.matches("^[A-Z|a-z][A-Z|a-z][A-Z|a-z]$"))
			return true;
		else {
			System.err.println("Enter location again in proper format (XXX) :");
			return false;
		}
	}
	
	/**
     * To validate the Date.
     * 
     * @param
     * 		String :
     * @return 
     * 		boolean
     * 
     */
	public static boolean Date_Validate(String str) {
			
		String[] arr=str.split("-");
		int y=Integer.parseInt(arr[2]);
		if((str.matches("(0?[1-9]|[12][0-9]|3[01])\\-(0?[1-9]|1[0-2])\\-([0-9]{4})"))&&(y==2013 || y==2014)) {		
			return true;
		}
		else {
			System.err.println("Enter date again in proper format (dd-mm-yyyy) :");
			return false;
		}
	}
	
	/**
     * To validate the Flight Class.
     * 
     * @param
     * 		String :
     * @return 
     * 		boolean
     * 
     */
	public static boolean Class_Validate(String str) {
		String strUp=str.toUpperCase();
		if((strUp.length()==1)&&((strUp.charAt(0)=='E')||((strUp.charAt(0)=='B')))) {
			return true;
		}
		else {
			System.err.println("Available options for input are (E/B) :");
			return false;
		}
	}
	
	/**
     * To validate the Flight Class.
     * 
     * @param
     * 		String :
     * @return 
     * 		boolean
     * 
     */
	public static boolean OutputPref_Validate(String str) {
		if((str.equalsIgnoreCase("fare"))||(str.equalsIgnoreCase("both"))) {
			return true;
		}
		else {
			System.err.println("Available options for input are \n 1.Fare\n 2.Both (For both fare and duration)");
			return false;
		}
	}

}
