import java.util.Comparator;

/**
 * Project 2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * Serial.java
 * 
 * Parent class for Journal and ConferenceProceeding Class that
 * allows each subclasses to have 
 *  
 * </P>
 * @version 1.0
 */


public abstract class Serial implements Comparator<Serial>{
 
 /** The title of the serial to be stored in the string. */
 protected String serialTitle;
 
 /** The kind of the papaer (whether "Conference Paper", or "Journal") to be stored in the string. */
 protected String paperKind;
 
 /** The month of the serial that was issued to be stored in the string. */
 protected String month;

 /** The year of the serial that was issued to be stored in the string. */
 protected int year;
 
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
 public Serial(){
  
 }
 
  /**
     * Constructer that would allow to implement subclass having parameters of
     * serialName, paperKind, month, and year
     * 
     * <P>
      * Algorithm:<br>
     * 1. 
     * <br>
     * </P>
      *@param  serialName  Title of the serial
      * @param paperKind determinant of either "Conference Paper", or "Journal" 
     *@param  month  month that was issued  
     *@param  year  number of years that was issued
      * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -  Each paramaters would need to be in appopriate type.
     * <dd>POST -   Once the object is set, the object of subclasses must be able to use all the methods that implemented from this class.
     */
 public Serial (String serialName, String paperKind, String month, int year){
  this.serialTitle = serialName;
  this.paperKind = paperKind;
  this.month = month;
  this.year = year;
  
 }
 /**
     * The accessor for the serial title <code>serialTitle</code>.
     *
     * @return    The title of the serial.
     */

 public String getSerialTitle(){
  return serialTitle;
 }
 
 
 public int compareTo(Serial o) {
     return Comparators.compare(this, o);
 }
	
	public static class Comparators {

     public static Comparator<Serial> SERIALTITLE = new Comparator<Serial>() {
         @Override
         public int compare(Serial o1, Serial o2) {
             return o1.serialTitle.compareTo(o2.serialTitle);
         }
     };
     
     public static Comparator<Serial> PAPERTYPE = new Comparator<Serial>() {
         @Override
         public int compare(Serial o1, Serial o2) {
             return o1.paperKind.compareTo(o2.paperKind);
         }
     };

	public static int compare(Serial serial, Serial o) {
		
		return serial.compare(serial,o);
	}


     
     


 }
	
 

}