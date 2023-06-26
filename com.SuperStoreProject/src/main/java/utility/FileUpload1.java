package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;

public class FileUpload1 {

public void fileUpload() throws AWTException {
		
	StringSelection filePath = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\sample.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
	Robot rb = new Robot();
	rb.delay(3);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.delay(2);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.delay(2);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	System.out.println("file uploaded..");
	
	}
}
