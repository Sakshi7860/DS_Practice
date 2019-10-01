package FileSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("/Users/sakshi.gupta1/Demo2.txt");
		FileOutputStream fout=new FileOutputStream(f);
		Employee emp=new Employee();
		emp.setEname("Sakshi");
		emp.setEno(102);
		emp.setCity("BLR");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		out.writeObject(emp);
		out.close();
		fout.close();
		System.out.println("Data is saved");
		
		FileInputStream fin=new FileInputStream(f);
		ObjectInputStream in=new ObjectInputStream(fin);
		Employee e=(Employee) in.readObject();
		System.out.println(e.eno+" "+e.ename+" "+e.city);
		in.close();
		fin.close();
				
	}

}
