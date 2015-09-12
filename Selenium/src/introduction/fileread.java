package introduction;

import java.io.*;

public class fileread
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
	File file=new File("C://Users//navkiran//Desktop//harry.txt");
	int ch;
	StringBuffer strcontent=new StringBuffer("");
	FileInputStream fin=new FileInputStream(file);
	
		//fin=new FileInputStream(file);
		while((ch=fin.read())!=-1)   //till the file is not fully read
			
		{
			strcontent.append((char)ch);  //typecasting integer
		}
		
		fin.close();
		System.out.println("file contents:");
		System.out.println(strcontent);
	}

}
