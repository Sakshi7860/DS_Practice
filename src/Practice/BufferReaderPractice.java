package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderPractice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader( new InputStreamReader(System.in));
		///String s=bf.readLine();
		String s="sakshi.gupta.mittal";
		String str[]=s.split("//.");
	
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
		

	}

}
