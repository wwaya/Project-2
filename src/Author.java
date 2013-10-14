/**
 * Project 2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * Author.java
 * 
 * A class that would store name of authors of the paper.
 *  
 * </P>
 * @version 1.0
 */

public class Author {
			 
	 /** 
	 * The last name that would be stored in the string. 
	 */
	private String primaryName;
	
	 /** 
	 * The first name that would be stored in the string. 
	 */
	private String secondaryName;
 
 
	/**
     * Constructer that would allow to create an Author object that later would be stored into the 
     * ArrayList in Paper class
     * 
     * <P>
      * Algorithm:<br>
     * 1. 
     * <br>
     * </P>
      *@param  primary  last name of the author 
      * @param secondary first name of the author  
      * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -  Each parameters would need to be in appropriate type, and the one object for paper Class needs to be added
     * <dd>POST -  
     */
	 public Author(String primary, String secondary){
	  this.primaryName = primary;
	  this.secondaryName = secondary;
	 }

	  /**
	 * The accessor for the last name <code>primaryName</code>.
	  * @return    the last name of the author .
	 */
	 public String getPrimaryName(){
	  return primaryName;
	 }
	 
	 /**
	 * The accessor for the first name <code>secondaryName</code>.
	  * @return    the first name of the author .
	 */
	 public String getSecondaryName(){
	  return secondaryName;
	 }
	 

}