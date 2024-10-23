package mypack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

public class TreeMapSerialDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(5,"chandu");
		tm.put(4,"varshit");
		tm.put(1,"sasi");
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("TreeMap.txt"));
		oos.writeObject(tm);
	}	
}
