

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//For the File class, the system will auto detect that and tell you add them
//import java.io.*; //this is also fine

public class ReadFile {
	
	public static void main(String[] args) throws IOException{
	//
	File file =new File("/Users/ZhengfeiRui/Desktop/test.txt");
	//if file not there, it will need FileNotException
	int ch;
	StringBuffer strContent = new StringBuffer("");
	//Diff. lines will be read, it will store the content line by line
	//it is a class in the java.io.package
	FileInputStream fin =new FileInputStream(file);
	//byte
	while((ch = fin.read()) !=-1){
		strContent.append((char)ch);
	}
	
	fin.close();
	System.out.println("File content:");
	System.out.println(strContent);
	
	}

}
