package main.java.com.nagarro.assignment1.Controller;

import java.io.File;
import java.util.ArrayList;

public class CheckAvailableFilesThread extends Thread{
	static File[] files; 
	
	//Create thread for ReadFileThread class
	ReadFileThread thread2=new ReadFileThread();
	int len;
	String currDir = "C:\\Users\\sarvagyasingh\\eclipse-workspace\\AdvanceJava2\\bin\\main\\java\\com\\nagarro\\assignment1\\Model\\resources";
	File dir=new File(currDir);
	long lastChanged=0,lastChangedFiles=0;
	ArrayList<Long> array=new ArrayList<>();
	
	/**
	 * override run method to continuosly check for new file in specific folder
	 */
	@Override
	public void run() {
		while(true) {
			long temp=0;
			//files references will be stored here.
			files = new File(currDir).listFiles();
			
			//Add modification time of all the files present in the directory
			for(File f:files) {
				temp+=f.lastModified();
			}
							
			//If any changes madde to the directory then it will be true 
			if(temp!=lastChangedFiles) {
				lastChangedFiles=temp;
				lastChanged=dir.lastModified();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//make thread2 run whenever the modification is done in the specified directory.
				thread2.run();
		   }
		}
	}
}
