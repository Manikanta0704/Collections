package mypack;
import java.io.*;
import java.io.IOException;
import java.util.Properties;
import java.util.*;

public class DemoProperty {
    public static void main(String[] args) {
    	
//        File file = new File(".\\sample.txt");
//        Properties p = new Properties();
//        try {
//            p.load(new FileInputStream(file));
//            System.out.println(p.getProperty("username"));
//            Sy  stem.out.println(p.getProperty("url"));
//            System.out.println(p.getProperty("password"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    	
    	
    	
//    	File file = new File(".\\sample.txt");
//        Properties p = new Properties();
//        try {
//            p.load(new FileInputStream(file));
//            Set<Map.Entry<Object,Object>> s=p.entrySet();
//            Iterator<Map.Entry<Object,Object>> itr=s.iterator();
//            while(itr.hasNext()) {
//            	Map.Entry<Object,Object> o=itr.next();
//            	System.out.println("The Property name is "+o.getKey()+" the values is "+o.getValue());
//            }
//            } catch (IOException e) {
//            e.printStackTrace();
//        }
        
    	
//    	File file = new File(".\\sample.txt");
//      Properties p = new Properties();
//      try {
//          p.load(new FileInputStream(file));
//          Enumeration<Object> e=p.keys();
//          while(e.hasMoreElements()) {
//        	  Object o=e.nextElement();
//        	  System.out.println(o+" "+p.get(o));
//          }
//          } catch (IOException e) {
//          e.printStackTrace();
//          }
    	
    	
//    	File file = new File(".\\sample.txt");
//        Properties p = new Properties();
//    	p.setProperty("regester", "frnd");
//    	p.setProperty("username", "srinu");
//    	p.setProperty("password", "pavan@123");
//    	try {
//          p.store(new FileOutputStream("dbone.properties"),"Registered person");
//          p.load(new FileInputStream("dbone.properties"));
//          System.out.println(p.getProperty("username"));
//          System.out.println(p.getProperty("password"));
//         } catch (IOException e) {
//          e.printStackTrace();
//          }                           // here outer file is not changed but set the values
    	
    	
    	
 
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sample.txt"));

			String str = "Welcome to java programming frnds";
			byte[] b = str.getBytes();
			bos.write(b);
//			bos.write(b, 0, b.length);
//			bos.flush();
			bos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    	
    	
		
	}
}
