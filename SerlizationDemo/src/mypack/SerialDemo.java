package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerialDemo {
	public static void main(String[] args) {
		
		Employee e1=new Employee(345,"chandu",23,100000);
		Employee e2=new Employee(155,"raj",24,90000);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("chandu.txt")));
			oos.writeObject(e1);
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("chandu.txt")));
			Object[] o;
			o=(Object[])ois.readObject();
			
			for(int i=0;i<=o.length-1;i++) {
				System.out.println(o);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
