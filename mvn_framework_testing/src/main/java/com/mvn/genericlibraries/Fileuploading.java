package com.mvn.genericlibraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Fileuploading 
{
	
	public static void  upload(String data) throws AWTException
	{

	StringSelection str=new StringSelection(data);
	Toolkit tol= Toolkit.getDefaultToolkit();
	Clipboard cd=tol.getSystemClipboard();
	cd.setContents(str, null);
	
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_COPY);
	rob.keyRelease(KeyEvent.VK_COPY);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_PASTE);
	rob.keyRelease(KeyEvent.VK_PASTE);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	
	}
	

