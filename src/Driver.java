import java.io.IOException;
/**
 * Project 2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * Driver.java
 * Driver class that will be running implemented classes and methods
 * by simply using main methods. 
 * </P>
 * @version 1.0
 */

public class Driver {
	
	/**
     * Main method that would have to include codes that will be executed.
     * 
     * <P>
     * Algorithm:<br>
     * 1. Once all the classes that needs to handle all the informations are 
     * implemented, the driver class will only would execute the codes that are implemented .<br>
     * </P>
     * @param             args      String array.
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         All the classes should have to be implemented properly.
     * <dd>POST -         The device that will running the program would have proper condition to keep run the program.
	 * @throws IOException 
     */
	public static void main (String[] args) throws IOException{
		ScholarPub a = new ScholarPub();
		
				
		String fileroot = a.printMenu();
		
		a.executeMenu(fileroot);
	}
}
