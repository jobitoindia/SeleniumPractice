package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadOperation {
	
	public void readFile() throws IOException {
		FileInputStream fis=new FileInputStream("E:\\JOBITOData.txt");
		int i=0;
		
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
	
	public void writeOPeration() throws IOException {
		FileOutputStream fos=new FileOutputStream("E:\\JOBITOData.txt");
		String str="welcome to jobito pune";
		
		byte[] byteArr=str.getBytes();
		
		fos.write(byteArr);
		fos.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileReadOperation fo=new FileReadOperation();
		fo.writeOPeration();
	}

}
