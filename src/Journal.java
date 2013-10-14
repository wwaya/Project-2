import java.util.ArrayList;

/**
 * Project 2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * Journal.java
 * Inherits from the Serial Class. A Journal is an object that holds and
 * stores articles.
 * </P>
 * @version 1.0
 */
public class Journal extends Serial{
	
	/**An ArrayList object that will store Article class objects **/
	private ArrayList<Article> journalList;
	
	 /** 
	 * The volume number that would be stored in the int. 
	 */
	protected int volume;
	 /** 
	 * The issue number that would be stored in the int. 
	 */
	protected int issue;
			
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
	public Journal(){
		
	}
	
	/**
     * A constructor in order to initialize an object that contains an
     * arraylist to store articles, its own name (Journal name), year
     * published, month published, volume of journal, and the issue number of the journal.
     * 
     * <P>
     * Algorithm:<br>
     * 1. Call the super class serial to implement what serial does
     * into Journal.
     * 2. Set variables to input variables
     * 3. Create the arraylist to store Articles
     * <br>
     * </P>
     * @param			serialName		Name of the serial
     * @param			paperName		Name of the Paper
     * @param			month			Month Journal published
     * @param			year			Year Journal published
     * @param			volumeNum		The volume of the Journal
     * @param			issueNum		The issue number of the journal
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -   The object must be declared
     * <dd>POST -         
     */
	public Journal(String serialName, String paperName, String month, int year, int volumeNum, int issueNum){
		super(serialName, paperName, month, year);
		this.volume = volumeNum;
		this.issue = issueNum;
		journalList = new ArrayList<Article>();

	}
	
	/**
     * A mutator that adds an article to the journal to the arraylist
     * <P>
     * Algorithm:<br>
     * 1. Add the article.<br>
     * </P>
     * @param     article    The Article to be added
     * <dt><b>Conditions:</b>
     * <dd>PRE  -     N/A
     * <dd>POST -     A new article is added to the arraylist
     */
	public void addArticle(Article article){
		journalList.add(article);
	}

	@Override
	public int compare(Serial o1, Serial o2) {
		return 0;
	}

}
