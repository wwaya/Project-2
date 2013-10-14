import java.util.ArrayList;
import java.util.Comparator;

/**
 * Project #1
 * CS 2334, Section 010
 * September 11th, 2013
 * <P>
 * Paper.java
 * Abstract class that will have a relationship of inheritance with 
 * Journal class and ConferencePaper class 
 *
 * </P>
 * @version 1.0
 */


public abstract class Paper {
	
	/**An ArrayList object that will store Author class objects */
	protected ArrayList<Author> authorsList;
	
	 /** 
	 * The title of paper that would be stored in the string.  */
	protected String paperTitle;
	 /** 
	 * The start pager number that would be stored in the int.  */
	protected int startPageNumber;
	 /** The last pager number that would be stored in the int.  */
	protected int endPageNumber;
	 /** The URL address  that would be stored in the String.  */
	protected String digitalObjectIdentifier;
	
	
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
	public Paper(){
		authorsList = new ArrayList<Author>();
	}
	
	 /**
     * Constructer that would allow to implement subclass having parameters of
     * paperTitle, beginNumber, and endNumber
     * 
     * <P>
      * Algorithm:<br>
     * 1. 
     * <br>
     * </P>
      *@param  paperTitle  Title of the paper(esecially an article)
     *@param  beginNumber  number of pages that begins 
     *@param  endNumber  number of pages that ends
      * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -  Each paramaters would need to be in appopriate type.
     * <dd>POST -   Once the object is set, the object of subclasses must be able to use all the methods that implemented from this class.
      */
	public Paper(String paperTitle, int beginNumber, int endNumber){
		authorsList = new ArrayList<Author>();
		this.paperTitle = paperTitle;
		this.startPageNumber = beginNumber;
		this.endPageNumber = endNumber;
	}
	  /**
     * Constructer that would allow to implement subclass having parameters of
     * paperTitle, beginNumber, endNumber, and webAddress
     * 
     * <P>
      * Algorithm:<br>
     * 1. 
     * <br>
     * </P>
      *@param  paperTitle  Title of the paper(esecially an article)
     *@param  beginNumber  number of pages that begins 
     *@param  endNumber  number of pages that ends
     * @param webAddress web address of the reference 
      * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -  Each paramaters would need to be in appopriate type.
     * <dd>POST -   Once the object is set, the object of subclasses must be able to use all the methods that implemented from this class.
      */
	public Paper(String paperTitle, int beginNumber, int endNumber, String webAddress){
		authorsList = new ArrayList<Author>();
		this.paperTitle = paperTitle;
		this.startPageNumber = beginNumber;
		this.endPageNumber = endNumber;
		this.digitalObjectIdentifier = webAddress;
	}
	
	/**
     * A method that will return the paper title
     * <P>
     * Algorithm:<br>
     * 1. Simply will return the paper title by calling this method.<br>
     * </P>
     * @return            paperTitle		returns String type of the paperTitle
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Paper object.
     * <dd>POST -         the value would later be used to stored into the Paper class.
     */	
	public String getPaperTitle(){
		return paperTitle;	
	}
	
	/**
     * A method that will return the start page number
     * <P>
     * Algorithm:<br>
     * 1. Simply will return the start page number by calling this method.<br>
     * </P>
     * @return            startPageNumber		returns int type of the estartPageNumber
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Paper object.
     * <dd>POST -         the value would later be used to stored into the Paper class.
     */	
	public int getStartPageNumber(){
		return startPageNumber;
	}
	
	/**
     * A method that will return the end page number
     * <P>
     * Algorithm:<br>
     * 1. Simply will return the end page number by calling this method.<br>
     * </P>
     * @return            endPageNumber		returns int type of the endPageNumber
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Paper object.
     * <dd>POST -         the value would later be used to stored into the Paper class.
     */	
	public int getEndPageNumber(){
		return endPageNumber;
	}
	
	/**
     * A method that will return the digital object identifier
     * <P>
     * Algorithm:<br>
     * 1. Simply will return the digital object identifier by calling this method.<br>
     * </P>
     * @return            digitalObjectIdentifier		returns String type of the digital Object Identifier
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Paper object.
     * <dd>POST -         the value would later be used to stored into the Paper class.
     */	
	public String getDigitalObjectIdentifier(){
		return digitalObjectIdentifier;
	}
	
	/**
     * A method that will return the author names
     * <P>
     * Algorithm:<br>
     * 1. Simply will return the author names by calling this method.<br>
     * </P>
     * @return            allAuthorName		returns String type of the author names
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Paper object.
     * <dd>POST -         the value would later be used to stored into the Paper class.
     */	
	public String getAuthorName(){
		String allAuthorName;
		
		allAuthorName = authorsList.get(0).getPrimaryName() +", "+authorsList.get(0).getSecondaryName();

		for(int i=1; i <authorsList.size(); i++ ){
			allAuthorName += "; "+authorsList.get(i).getPrimaryName() +", "+authorsList.get(i).getSecondaryName();
		}
		return allAuthorName;
	}
	
	/**
     * A mutator that sets the Author name to a new author name
     * <P>
     * Algorithm:<br>
     * 1. Set the author name to a new author name.<br>
     * </P>
     * @param     fullName		The new author name
     * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -     N/A
     * <dd>POST -     A new author name is set
     */
	public void addAuthorName(Author fullname){
		this.authorsList.add(fullname);
	}
	
	/**
     * A mutator that sets the paper title to a new paper title
     * <P>
     * Algorithm:<br>
     * 1. Set the paper title to its new paper title.<br>
     * </P>
     * @param     titleName		The new paper title
     * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -     N/A
     * <dd>POST -     New page numbers are set
     */
	public void setPaperTitle(String titlename){
		this.paperTitle = titlename;
	}
	
	/**
     * A mutator that sets the page number variables to
     * new page numbers
     * <P>
     * Algorithm:<br>
     * 1. Set both page number variables to their new page numbers.<br>
     * </P>
     * @param     start		The new starting page number     
     * @param     end		The new ending page number
     * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -     N/A
     * <dd>POST -     New page numbers are set
     */
	public void setPageNumber(int start, int end){
		this.startPageNumber = start;
		this.endPageNumber = end;
	}
	
	/**
     * A mutator that sets the digital object identifier or URL to
     * a new digital object identifier or URL
     * <P>
     * Algorithm:<br>
     * 1. Set digitalObjectIdentifier equal to the new digital object identifier.<br>
     * </P>
     * @param     address    The new digital Object Identifier or URL
     * <dt><b>Conditions:</b>
     * <dd>PRE  -     N/A
     * <dd>POST -     A new digital Object Identifier is set
     */
	public void setURL(String address){
		this.digitalObjectIdentifier = address;
	}
	

	
}


