package mypack;

public class Exc {
	public static void main(String[] args) {
		/*int i=369;
		int j=i/0;
		System.out.println(j);
		System.out.println("back to main");*/
		int i=369;
		try {
		int j=i/0;
			System.out.println(j);	
		}catch(Exception e) {e.printStackTrace();}
			
		System.out.println("back to main");
	}

}
