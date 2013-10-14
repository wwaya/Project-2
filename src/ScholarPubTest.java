import static org.junit.Assert.*;

import org.junit.Test;


public class ScholarPubTest {

	ScholarPub scholarP = new ScholarPub();
	Serial s1 = new ConferenceProceedings("conference test 1", "conference paper name,", "july", 2010 );
	Serial s2 = new Journal("journal name 1", "journallll", "july", 2010, 22, 44);
	

		
	@Test
	public void searchPapersTest() {		
		Paper result = scholarP.searchPapers("Wired");
		assertEquals(result, null);
	}

	@Test
	public void executeBibliographicTest(){
		Paper result = scholarP.executeBibliographic();
		assertEquals(result, null);

	}

	@Test
	public void executeAuthorNameTest(){
		Paper result = scholarP.executeAuthorName();
		assertEquals(result, null);

	}	

	@Test
	public void executeSerialTitleTest(){
		Serial result = scholarP.executeSerialTitle();
		assertEquals(result, null);
	}
	
	@Test
	public void executeRandomTest(){
		Paper result = scholarP.executeRandom();
		assertEquals(result, null);
	}
	
}
