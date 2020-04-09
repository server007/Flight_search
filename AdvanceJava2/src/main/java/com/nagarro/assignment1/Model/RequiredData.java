package main.java.com.nagarro.assignment1.Model;

public class RequiredData {

	protected String Dep_Loc,Arr_Loc,Flight_Date,Output_Pref,Flight_Class;

	/**
	 * setter for Departure Location
	 * @param Dep_Loc
	 */
	public void setDep_Loc(String Dep_Loc) {
		this.Dep_Loc=Dep_Loc;
	}
	/**
	 * getter for Departure Location
	 * @return
	 */
	public String getDep_Loc() {
		return Dep_Loc;
	}
	
	/**
	 * setter for Arrival Location
	 * @param Arr_Loc
	 */
	public void setArr_Loc(String Arr_Loc) {
		this.Arr_Loc=Arr_Loc;
	}
	/**
	 * getter for Arrival Location
	 * @return
	 */
	public String getArr_Loc() {
		return Arr_Loc;
	}
	
	/**
	 * setter for Flight Date
	 * @param Flight_Date
	 */
	public void setFight_Date(String Flight_Date) {
		this.Flight_Date=Flight_Date;
	}
	/**
	 * getter for Flight Date
	 * @return
	 */
	public String getFlight_Date() {
		return Flight_Date;
	}
	
	/**
	 * setter for Flight Class
	 * @param Flight_Class
	 */
	public void setFlight_Class(String Flight_Class) {
		this.Flight_Class=Flight_Class;
	}
	/**
	 * getter for Flight Class
	 * @return
	 */
	public String getFlight_Class() {
		return Flight_Class;
	}

	/**
	 * setter for Output Preference
	 * @param Output_Pref
	 */
	public void setOutput_Pref(String Output_Pref) {
		this.Output_Pref=Output_Pref;
	}
	/**
	 * getter for Output Preference
	 * @return
	 */
	public String getOutput_Pref() {
		return Output_Pref;
	}
}


