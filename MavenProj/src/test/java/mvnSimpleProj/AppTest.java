/**
 * Unit Test for simple App
 */
package mvnSimpleProj;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * @author Panagiotis Drakos
 * Student Id: L00170565
 */

public class AppTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
	
	@Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }
	
	@Test
    public void testAppMain()
    {
        App.main(null); // call main in the App file
        
        	// check the output is "Hello out There!" and a new line
            assertEquals("Welcome to DevOps!" + System.getProperty("line.separator"), outContent.toString());
    }
	
	@After
    public void cleanUpStreams() {
        System.setOut(null);
    }
	

}
