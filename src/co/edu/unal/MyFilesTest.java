/**
 * 
 */
package co.edu.unal;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jiacontrerasp
 *
 */
public class MyFilesTest {

	/**
	 * Test method for {@link co.edu.unal.MyFiles#addContent(java.lang.String)}.
	 * @throws IOException 
	 */
	@Test
	public void testAddContent() throws IOException {
		
		File file1 = new File("./goku.txt");
		File file2 = new File("./vegeta.txt");
		
		file1.createNewFile();
		file2.createNewFile();
		
		//Create initial file
		MyFiles file = new MyFiles("./","Amici di Goku",file1);
		
		//Create expected file
		MyFiles file_expected = new MyFiles("./","Amici di Goku e Vegeta",file2);
				
		//Add text to initial file
		file.addContent(" e Vegeta");
		
		assertTrue("Compara", file_expected.getContent().equals(file.getContent()));
		
		
	}

}
