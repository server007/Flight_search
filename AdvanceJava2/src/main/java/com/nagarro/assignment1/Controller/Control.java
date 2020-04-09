package main.java.com.nagarro.assignment1.Controller;

/**
 * Control class of the project contains main method and controls the execution.
 * @author sarvagyasingh
 *
 */
public class Control extends Thread{

	public static void main(String[] args) {
		
		//Creates thread for CheckAvailableFilesThread and start the execution by calling start method.
		CheckAvailableFilesThread thread1=new CheckAvailableFilesThread();
		thread1.start();
	}
}
		