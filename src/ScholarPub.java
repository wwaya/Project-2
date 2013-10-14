import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ScholarPub {


	/**An ArrayList object that will store Serial subclass objects **/
	
	public List<Serial> serials = new ArrayList<Serial>();
	
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
	public ScholarPub() {

	}
	
    /**
     * Performing adding all the Serial objects to the ArrayList object
     * 
     * <P>
     * Algorithm:<br>
     * 1. By calling BufferReader, follwed by FileReader Class, the methods will read all the line in one string
     * 2. As the functions of the BufferReader and FileReader are done with reading one line, the line needs to be
     * divided into each informations.
     * 3. Once all the strings are divided, each strings should be put into each object
     * 4. in order to store all the informations, it has to be performed until the last line shows up (when the value of the line becomes null)
     * @param             fileName     text file root.
     * <br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         The root of document needs to be set properly, and Magazine class needed to be clarified.
     * <dd>POST -         Needs to make sure if each informations are put in correct places, and the boolean value of added needs to be set true .
     * @throws		 IOException 
     */
	public void readData(String fileName) throws IOException{

		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String nextline = br.readLine();

		while (nextline != null ){    		
			if(nextline.equals("Conference Paper")){
				ConferencePaper obj = new ConferencePaper();
				nextline = br.readLine();
				String[] authortemp = nextline.split("; ");
				for (int i =0; i< authortemp.length; i++){
					String authorsplit[] = authortemp[i].split(", ");
					obj.addAuthorName(new Author(authorsplit[0].toString(), authorsplit[1].toString()));
				}
				
				nextline = br.readLine();
				obj.setPaperTitle(nextline);
				
				nextline = br.readLine();
				String serialTemp = nextline;
				
				nextline = br.readLine();
				String[] pagetemp = nextline.split("-");
				obj.setPageNumber(Integer.parseInt(pagetemp[0]), Integer.parseInt(pagetemp[1]));
				nextline = br.readLine();
				String[] datetemp = nextline.split(" ");
				
				nextline = br.readLine();
				if(nextline != null){
					obj.setURL(nextline);
				}
				this.serials.add(new ConferenceProceedings(serialTemp, "Conference Paper", datetemp[0], Integer.parseInt(datetemp[1])));
			}
			
			System.out.println(nextline);
			nextline = br.readLine();
			
		}

	}
	
	 /**
     * A method that outputs the menu to the user
     * <P>
     * Algorithm:<br>
     * 1. Show the menu to the user.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
	 * @throws IOException 
     */	
	public String printMenu() throws IOException{
		File fileList = new File("./src");
		String[] fileNames = fileList.list();
		
		for(int i = 0; i< fileNames.length ; i++){
			if(fileNames[i].toString().contains((".txt"))){
				System.out.println(fileNames[i]);
			}
		}
		
		
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print( "Type the name of data from above (include .txt): " ); 
		String input = inputReader.readLine(); 
		
		boolean trueOrNot = false;
		
		while(trueOrNot == false){
			for(int j = 0; j< fileNames.length ; j++ ){
				if(fileNames[j].contains(input)){
					trueOrNot=true;
					break;
				}
			}
			if(trueOrNot ==true)
				break;
			System.out.println( "The input is not a file name of the list. Please type again.");
			System.out.print( "Type the name of data from above (include .txt): " ); 
			input = inputReader.readLine(); 
		}
		
		System.out.println( "You typed: " + input );

		return input;
	}
	
	/**
     * A method that retrieves the input from the user
     * <P>
     * Algorithm:<br>
     * 1. Retrieve the input from the user.<br>
     * </P>
     * @param		selection		the input from the user
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
	 * @throws IOException 
     */	
	public void executeMenu(String selection) throws IOException{
		this.readData("src/"+selection);
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		boolean isQuitting = false;
		/*
		 * 
		 * ‘BI’ for bibliographic, ‘AN’ for author names, ‘PT’ for paper title, ‘ST’ for serial title,
		 * ‘CH’ for chronological, and ‘R’ for random. 
		 * Alternately, the user may choose to enter ‘PS’ for print to screen, 
		 * ‘PF’ to print to a file, or ‘S’ for search. If the user chooses either print option, 
		 * then all of the publication data will be printed in its current order (whatever that may be, given the last sort option)
		 * and in the format described below under
		 */
		while( isQuitting == false){

			System.out.println( "\n------------------------------" ); 
			System.out.println( "-------------Menu------------" ); 
			System.out.println( "------------------------------\n" ); 
	
			System.out.println( "\t 1. 'BN' Sorting the data in order of Biliograpic " ); 
			System.out.println( "\t 2. 'AN' Sorting the data in order of Author Names" ); 
			System.out.println( "\t 3. 'PT' Sorting the data in order of Paper type" ); 
			System.out.println( "\t 4. 'ST' Sorting the data in order of Serial Title " ); 
			System.out.println( "\t 5. 'CH' Sorting the data in order of Chronological " ); 
			System.out.println( "\t 6. 'R' Sorting the data Randomly" ); 
			System.out.println( "\t 7. 'PF' Print sorted data to a file" ); 
			System.out.println( "\t 8. 'S' Search the particular serial " ); 
			System.out.println( "\t 9. 'Q' quit for exit the program " ); 
	
	
			System.out.println( "------------------------------" ); 
			System.out.print( "Choose and type from above:  " ); 
			String input = inputReader.readLine(); 
			while(!"BN".equals(input) && !"AN".equals(input) && !"PT".equals(input) && !"ST".equals(input) && !"CH".equals(input) && !"R".equals(input) && !"PF".equals(input) && !"S".equals(input) && !"Q".equals(input)){
				System.out.println("Wrong input. You typed "+input+". Please type again: ");
				input = inputReader.readLine(); 

			}
		
		 
			switch(input) {
			    case "BN":
			        this.executeBibliographic();
			        break;
			    case "AN":
			        this.executeAuthorName();
			        break;
			    case "PT":
			        executePaperType();
			        break;
			    case "ST":
			        this.executeSerialTitle();
			        break;
			    case "CH":
			        this.executeChronological();
			        break;
			    case "R":
			        this.executeRandom();
			        break;
			    case "PF":
			        this.printToFile();
			        break;
			    case "S":
			    	System.out.println("Type the name of authors");
					input = inputReader.readLine(); 
			        this.searchPapers(input);
			        break;
			    case "Q":
			    	System.out.println("quit");
			    	isQuitting = true;
			    	break;
			}
			if(isQuitting == true){
				break;
			}
		}
	    
		if(isQuitting == true){
			System.exit(0);
		}
	 
	    // etc...
	}
		
		
	
	/**
     * A method that sorts the main list by the bibliographic method
     * <P>
     * Algorithm:<br>
     * 1. Sort by bibliographic.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
	 * @return paper object;
     */	
	public Paper executeBibliographic(){
		System.out.println("executeBibl");
		return null;
	}
	
	/**
     * A method changes the author's name
     * <P>
     * Algorithm:<br>
     * 1. Change author's name.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
	 * @return paper object;
     */	
	public Paper executeAuthorName(){
		System.out.println("executeA");
		return null;
		
	}
	
	/**
     * A method changes the paper's title
     * <P>
     * Algorithm:<br>
     * 1. Change paper's title.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
	 * @return paper object;
	 */
	
	public void executePaperType(){
		
		Collections.sort(serials, Serial.Comparators.SERIALTITLE);
		System.out.println("The list has been sorted with title of serial");
	}
	
	/**
     * A method changes the serial's title
     * <P>
     * Algorithm:<br>
     * 1. Change serial's title.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
     * @return Serial object;
	*/
	public Serial executeSerialTitle(){
		System.out.println("executeSerialT");
		return null;
	}
	
	/**
     * A method that sorts the main list by the random method
     * <P>
     * Algorithm:<br>
     * 1. Sort by random.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
     * @return paper object;
     */
	public Paper executeRandom(){
		
		Collections.shuffle(serials);
		System.out.println("Shuffled Successfully");
		return null;
	}
	
	/**
     * A method that sorts the main list by chronological order
     * <P>
     * Algorithm:<br>
     * 1. Sort by random.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
     */
	public void executeChronological(){

	}
	
	/**
     * A method that prints the list to the screen
     * <P>
     * Algorithm:<br>
     * 1. Print list to screen.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
     */	
	public void printToScreen(){
		System.out.println("PrintToScreen");

		
	}
	
	/**
     * A method that prints the list to a file
     * <P>
     * Algorithm:<br>
     * 1. Print list to file.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
     */	
	public void printToFile(){
		
		System.out.println("PrintToFile");

	}
	
	/**
     * A method that searches the list for papers
     * <P>
     * Algorithm:<br>
     * 1. Search for papers.<br>
     * </P>
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the value would later be used to stored into the serial class.
     */	
	public Paper searchPapers(String nameSerial){
		System.out.println("Searching");
		System.out.println(nameSerial);
		return null;
	}
	
	/**
     * A method that searches the list for papers
     * <P>
     * Algorithm:<br>
     * 1. Simply adding an Serial object into an ArrayList that initialized.<br>
     * </P>
     * @param	obj		A serial object
     *
     * <dt><b>Conditions:</b>
     * <dd>PRE  -         have to have an Serial object.
     * <dd>POST -         the object needs to be added into the object
     */	
	public void add(Serial obj){

		serials.add(obj);
	}
	
	 /**
	 * The accessor for the ArrayList object Serials <code>serials</code>.
	  * @return    returns an ArrayList object that initialized as from the class.
	 */
	public ArrayList<Serial> getSerial(){
		return (ArrayList<Serial>) serials;
	}
	// no exit method is needed(just simply using System.exit(0);
}
