import java.util.ArrayList;

/**
 * Project 2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * ConferenceProceedings.java
 * Inherits from the Serial Class. A ConferenceProceeding is an object that holds and
 * stores conferencePapers.
 * </P>
 * @version 1.0
 */
public class ConferenceProceedings extends Serial{

	/**An ArrayList object that will store ConferencePaper class objects **/
	private ArrayList<ConferencePaper> conferenceLists ;
	
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
	public ConferenceProceedings(){
		conferenceLists = new ArrayList<ConferencePaper>();
	}
	
	/**
     * A constructor in order to initialize an object that contains an
     * arraylist to store articles, its own name (Journal name), year
     * published, month published, volume of journal, and the issue number of the journal.
     * 
     * <P>
     * Algorithm:<br>
     * 1. Call the super class serial to implement what serial does
     * into ConferenceProceedings.
     * 2. Set variables to input variables
     * 3. Create the arraylist to store ConferencePapers
     * <br>
     * </P>
     * @param			serialName		Name of the serial
     * @param			paperName		Name of the Paper
     * @param			month			Month ConferenceProceeding published
     * @param			year			Year ConferenceProceeding published
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -   The object must be declared
     * <dd>POST -         
     */
	public ConferenceProceedings(String serialName, String paperName, String month, int year){
		super(serialName, paperName, month, year);
		conferenceLists = new ArrayList<ConferencePaper>();
	}

	@Override
	public int compare(Serial o1, Serial o2) {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
