

import java.io.*;

public class FindData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file_name ="/Users/ZhengfeiRui/Desktop/test.txt";
		OpenFile(file_name);		
	}
	
	//private String path;
	//public void ReadFile(String file_path){
	//	path = file_path;
	//}
	
	public static void OpenFile(String path) throws IOException{
		FileReader fr = new FileReader(path); //one byte
		BufferedReader txtReader = new BufferedReader(fr);//one line
		FileWriter fw = new FileWriter("/Users/ZhengfeiRui/Desktop/test2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter fileOut = new PrintWriter(bw);
		
		
		String aline;//单个string
		String [] sline= null;//存进array
		
		while((aline = txtReader.readLine())!=null){
		System.out.println(aline);
		sline = aline.split(",");
		
		for(int i =0;i<sline.length;i++){
			System.out.println(sline[i]);
			fileOut.println(sline[i]);
		}
		
		}
		
		txtReader.close();
		fileOut.close();
	}

}
