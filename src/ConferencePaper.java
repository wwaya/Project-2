/**
 * Project 2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * ConferencePaper.java
 * 
 * A class that would give an ability to generate a ConferencePaper class object 
 * that extended by Paper.
 *  
 * </P>
 * @version 1.0
 */


public class ConferencePaper extends Paper {
	
	/**
     * A null constructor in order to initialize an object
     * 
     * <P>
     * Algorithm:<br>
     * 1. a simple null constructor
     * <br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -   The object must be declared
     * <dd>POST -         
     */
	public ConferencePaper(){
		
	}
	
	/**
     * A constructor in order to initialize an object with the parameters
     * given set as values in the conference paper class
     * 
     * <P>
     * Algorithm:<br>
     * 1. Call the super class serial to implement it in conference paper
     * <br>
     * </P>
     * @param		paperTitle		Title of the Conference Paper
     * @param		beginNumber		Page number that the conference paper begins at
     * @param		endNumber		Page number that the conference paper ends at
     * @param		webAddress		The web address or URL of the conference paper
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -   The object must be declared
     * <dd>POST -         
     */
	public ConferencePaper(String paperTitle, int beginNumber, int endNumber, String webAddress){
		super(paperTitle, beginNumber, endNumber, webAddress);
	}
	
}
