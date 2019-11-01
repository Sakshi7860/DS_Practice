package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f=new File("/Users/sakshi.gupta1/Demo1.txt");
		//FileInputStream fr=new FileInputStream(f);
//		int i;
//		while((i=fr.read())!=-1)
//		{
//			System.out.println((char)i);
//		}
		//File f1=new File("/Users/sakshi.gupta1/Demo2.txt");
		
		//FileWriter fw=new FileWriter(f1);
//		int i;
//		while((i=fr.read())!=-1)
//		{
//			System.out.println((char)i);
//			fw.write((char)i);
//			
//			
//		}
//		System.out.println("");
		
		FileReader fileReader=new FileReader(f);
		BufferedReader br=new BufferedReader(fileReader);
//		int i;
//		while((i=fileReader.read())!=-1)
//		{
//			System.out.println((char)i);
//		}
		
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
//		BufferedReader br=new BufferedReader(fr);
//		BufferedWriter bw=new BufferedWriter(fw);
//		String s;
//		while((s=br.readLine())!=null)
//		{
//			
//			String str[]=s.split(" ");
//			for(int i1=0;i1<str.length;i1++)
//				bw.write(str[i1]);
//		}
		
//		Scanner sc = new Scanner(f); 
//		  
//	    while (sc.hasNextLine()) 
//	      System.out.println(sc.nextLine()); 
		

	}

}
