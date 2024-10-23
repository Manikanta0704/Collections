package mypack;

public class Exc1 {
	public static void main(String[] args) {
//		try {
		/*String str1=null;
		String str2=new String(str1);
		System.out.println(str1);*/
		/*int[] i = {1,2,3,4,5};
		System.out.println(i[5]);
		}catch(Exception e) {e.printStackTrace();}
		System.out.println("back to main");*/
		int i[]=new int[5];
		System.out.println(i.length);
		i[5]=1000;
		System.out.println(i[5]);
	}
}
