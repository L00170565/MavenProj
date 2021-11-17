package mavenProj;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * @author Panagiotis Drakos
 * Student Id: L00170565
 * sample Test code used from: https://github.com/jenkins-docs/simple-java-maven-app/blob/master/src/test/java/com/mycompany/app/AppTest.java
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

        // check the output is "Welcome to DevOps" and a new line
        assertEquals("Welcome to DevOps!" + System.getProperty("line.separator"), outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


}