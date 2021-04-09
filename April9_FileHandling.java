package com.corejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class April9_FileHandling {

	public static void main(String[] args) throws IOException {
		
		
		
		
	
	}
	
	public static void ReadFromTxtFile() throws IOException
	{
		File f = new File("D:\\eveningBatchMarch123\\test.txt");
		
		FileReader fr = new FileReader(f);
			
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		String line ="";
		
		while( (line = br.readLine())!= null)
		{
			System.out.println(line);
		}
	}
	
	public static void writeToHtmlFile() throws IOException
	{
		
		File f = new File("D:\\eveningBatchMarch123\\test.html");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("<html>");
		fw.write("<body>");
		
		fw.write("<input type='text'>UserName</input><br>");
		fw.write("<input type='text'>Password</input><br>");
		
		fw.write("<Button >OK</button><br>");
		fw.write("<Button >OK</button><br>");
		
		fw.write("</body>");
		fw.write("</html>");
		
		fw.flush();
		fw.close();
	}
	
	/*	
	writeResultsToFile("Login_001", "Pass");
	writeResultsToFile("Login_002", "Fail");
	writeResultsToFile("Login_003", "Fail");
	writeResultsToFile("Login_004", "Pass");
	*/
	
	public static void writeResultsToFile(String testCaseName, String status) throws IOException
	{
		File f = new File("D:\\eveningBatchMarch123\\test.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write(testCaseName+"----"+status+"\n");
		fw.flush();
		fw.close();
		
		
	}
	
	public static void fileCreation() throws IOException
	{

		/*
		File f = new File("D:\\eveningBatchMarch123\\test.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("Welcome to java\n");
		fw.write("java seems to be interesting....\n");
		fw.write("Selenium will be further interesting...\n");
		
		fw.flush();
		fw.close();
		*/
		
		File file = new File("D:\\eveningBatchMarch123\\test.json")	;
			
		file.createNewFile();
		
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getAbsoluteFile());
		
		System.out.println(file.getParent());
		
		System.out.println(file.isFile());
			
	}
	
	public static void folderMethods()
	{
		
		
		File f = new File("D:\\eveningBatchMarch");
		
		//File f = new File("D:\\EveningBatch");
		
		//f.mkdir();
		
		//f.delete();
		
		System.out.println(f.exists());
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.isDirectory());
		
		System.out.println(f.getParent());
		
		String[] s = f.list();
		
		System.out.println(Arrays.toString(s));
		
		System.out.println(f.canRead());
		
		System.out.println(f.canExecute());
		
		System.out.println(f.isHidden());
		
		File f1 = new File("D:\\eveningBatchMarch123\\temp\\test");
		
		//f.renameTo(f1);
		
		f1.mkdirs();
	}

}
